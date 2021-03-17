package com.my.blog.website.utils.backup;

import com.my.blog.website.utils.backup.db.DataTable;
import com.my.blog.website.utils.backup.db.Row;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Backup {
    private Connection connection;
    private TableCollection tables;
    private boolean addEmptyTable;
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyy-MM-dd");
    private static final DateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
    private static final DateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm:ss");

    public Backup(Connection connection) {
        this.addEmptyTable = true;
        this.connection = connection;
    }

    public String execute() throws SQLException{
        StringBuffer stringBuffer = new StringBuffer();

        DatabaseMetaData metaData = connection.getMetaData();
        String quote = metaData.getIdentifierQuoteString();

        DataTable dataTable = null;

        // 获取表
        tables = new TableCollection();
        dataTable = DataTable.parse(metaData.getTables(null,null,null,null));
        for (Row row : dataTable){
            tables.add(new Table(row.getString("TABLE_NAME")));
        }

        // 获取列
        for (Table table : tables){
            dataTable = DataTable.parse(metaData.getColumns(null,null,table.getName(),null));
            for (Row row : dataTable){
                table.getColumns().add(new Column(row.getString("COLUMN_NAME"),row.getString("TYPE_NAME"),row.getInteger("DATA_TYPE")));
            }
        }

        // 获取约束
        for (int i = 0;i < tables.size(); i++){
            for (int j = 0;j < tables.size(); j++){
                if (i != j){
                    dataTable = DataTable.parse(metaData.getCrossReference(null,null,tables.get(i).getName(),null,null,tables.get(j).getName()));
                    if (dataTable.size() > 0){
                        Table src = tables.get(j);
                        for (Row row : dataTable){
                            src.getConstraints().add(new FK(row.getString("FKCOLUMN_NAME"),tables.get(i),row.getString("PKCOLUMN_NAME")));
                        }
                    }
                }
            }
        }

        tables.sort();

        if (addEmptyTable){
            for (int i = tables.size() - 1; i >= 0;i--){
                stringBuffer.append("DROP TABLE IF EXISTS");
                stringBuffer.append(quote + tables.get(i).getName() + quote + ";\r\n");
            }
        }

        for (Table table : tables){
            dataTable = DataTable.execute(connection ,"select * from " + quote + table.getName() + quote);
            if (dataTable.size() > 0){
                printInfo(stringBuffer,table.getName());
                String str = "insert into " + quote + table.getName() + quote
                        + " (" + quote + table.getColumns().get(0).getName()
                        + quote;
                for (int i = 1; i < table.getColumns().size(); i++) {
                    str += ", " + quote + table.getColumns().get(i).getName()
                            + quote;
                }
                str += ") values ";
                stringBuffer.append(str);
                for (int k = 0; k < dataTable.size(); k++) {
                    Row row = dataTable.get(k);
                    str = "(" + getSQLValue(table, row, 0);
                    for (int i = 1; i < dataTable.getColumns().size(); i++) {
                        str += ", " + getSQLValue(table, row, i);
                    }
                    str += ")";
                    if (k < dataTable.size() - 1) {
                        str += ",";
                    } else {
                        str += ";";
                    }
                    stringBuffer.append(str).append("\r\n");
                }
                stringBuffer.append("\r\n");
            }
        }
        return stringBuffer.toString();
    }

    public void printInfo(StringBuffer stringBuffer, String message){
        stringBuffer.append("# ------------------------------------------------------------\r\n");
        stringBuffer.append("# ------- " + message + "\r\n");
        stringBuffer.append("# ------------------------------------------------------------\r\n");
    }

    public String getSQLValue(Table table, Row row,int index){
        Column column = table.getColumns().get(index);
        int type = column.getDataType();
        if (row.get(index) == null) {
            return "null";
        } else {
            switch (type) {
                case Types.CHAR:
                case Types.VARCHAR:
                case Types.LONGNVARCHAR:
                case Types.NCHAR:
                case Types.NVARCHAR:
                case Types.LONGVARCHAR:
                    return "\"" + row.getString(index) + "\"";

                case Types.DATE:
                    return "\"" +  DATE_FORMAT.format(row.getDate(index)) + "\"";

                case Types.TIME:
                    return "\"" + TIME_FORMAT.format(row.getDate(index)) + "\"";

                case Types.TIMESTAMP:
                    return "\"" + DATE_TIME_FORMAT.format(row.getDate(index)) + "\"";

                default:
                    return row.getString(index);
            }

        }
    }
}
