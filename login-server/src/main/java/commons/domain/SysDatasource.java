package commons.domain;

import javax.persistence.*;

@Table(name = "test2..sys_datasource")
public class SysDatasource {
    @Id
    @Column(name = "DATASOURCE_ID")
    private String datasourceId;

    /**
     * 数据源编号
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 数据库名
     */
    @Column(name = "DATABASE_NAME")
    private String databaseName;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 数据源URL
     */
    @Column(name = "URL")
    private String url;

    /**
     * 是否启用数据源
     */
    @Column(name = "ENABLE")
    private String enable;

    /**
     * 驱动名
     */
    @Column(name = "DRIVER_CLASS_NAME")
    private String driverClassName;

    /**
     * 数据库类型
     */
    @Column(name = "DATABASE_TYPE")
    private String databaseType;

    /**
     * @return DATASOURCE_ID
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    /**
     * @param datasourceId
     */
    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    /**
     * 获取数据源编号
     *
     * @return ID - 数据源编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置数据源编号
     *
     * @param id 数据源编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取数据库名
     *
     * @return DATABASE_NAME - 数据库名
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * 设置数据库名
     *
     * @param databaseName 数据库名
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取数据源URL
     *
     * @return URL - 数据源URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置数据源URL
     *
     * @param url 数据源URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取是否启用数据源
     *
     * @return ENABLE - 是否启用数据源
     */
    public String getEnable() {
        return enable;
    }

    /**
     * 设置是否启用数据源
     *
     * @param enable 是否启用数据源
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }

    /**
     * 获取驱动名
     *
     * @return DRIVER_CLASS_NAME - 驱动名
     */
    public String getDriverClassName() {
        return driverClassName;
    }

    /**
     * 设置驱动名
     *
     * @param driverClassName 驱动名
     */
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    /**
     * 获取数据库类型
     *
     * @return DATABASE_TYPE - 数据库类型
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * 设置数据库类型
     *
     * @param databaseType 数据库类型
     */
    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }
}