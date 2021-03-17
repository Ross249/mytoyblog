package com.my.blog.website.utils.backup;

public class Table {
    private String name;
    private ColumnCollection columns;
    private FKCollection constraints;

    public String getName() {
        return name;
    }

    public ColumnCollection getColumns() {
        return columns;
    }

    public FKCollection getConstraints() {
        return constraints;
    }

    public Table(String name){
        this.name = name;
        this.columns = new ColumnCollection();
        this.constraints = new FKCollection();
    }

    @Override
    public String toString() {
        return "Table [name=" + name + "]";
    }

    public boolean isReferenced(Table referenceTable){
        return constraints.isReferenced(referenceTable);
    }
}
