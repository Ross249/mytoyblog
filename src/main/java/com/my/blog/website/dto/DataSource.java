package com.my.blog.website.dto;

/**
 * 建立数据库连接的参数对象
 */
public class DataSource {

    // 数据库url
    private String url;

    // 数据库用户名
    private String username;

    // 数据库密码
    private String password;

    // 数据库驱动名称
    private String driverClassName;

    // 数据库名字
    private String dbName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", dbName='" + dbName + '\'' +
                '}';
    }
}
