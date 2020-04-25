package cn.xuhao.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sm_account")
public class SmAccount {
    /**
     * 账户ID 同SM_ACCOUNT表ACCOUNT_ID
     */
    @Id
    @Column(name = "PK_ACCOUNT")
    private String pkAccount;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RIGHTS")
    private String rights;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "LAST_LOGIN")
    private String lastLogin;

    @Column(name = "IP")
    private String ip;

    /**
     * 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    @Column(name = "ACCOUNT_STATUS")
    private String accountStatus;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "SFID")
    private String sfid;

    @Column(name = "START_TIME")
    private String startTime;

    @Column(name = "END_TIME")
    private String endTime;

    @Column(name = "YEARS")
    private Integer years;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "EMAIL")
    private String email;

    /**
     * Logo文件名
     */
    @Column(name = "LOGO_FILE")
    private String logoFile;

    /**
     * LOGO文件存储位置
     */
    @Column(name = "FILE_DIR")
    private String fileDir;

    /**
     * 获取账户ID 同SM_ACCOUNT表ACCOUNT_ID
     *
     * @return PK_ACCOUNT - 账户ID 同SM_ACCOUNT表ACCOUNT_ID
     */
    public String getPkAccount() {
        return pkAccount;
    }

    /**
     * 设置账户ID 同SM_ACCOUNT表ACCOUNT_ID
     *
     * @param pkAccount 账户ID 同SM_ACCOUNT表ACCOUNT_ID
     */
    public void setPkAccount(String pkAccount) {
        this.pkAccount = pkAccount;
    }

    /**
     * @return ACCOUNT_NAME
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return RIGHTS
     */
    public String getRights() {
        return rights;
    }

    /**
     * @param rights
     */
    public void setRights(String rights) {
        this.rights = rights;
    }

    /**
     * @return ACCOUNT_TYPE
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return LAST_LOGIN
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     *
     * @return ACCOUNT_STATUS - 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     *
     * @param accountStatus 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * @return BZ
     */
    public String getBz() {
        return bz;
    }

    /**
     * @param bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return SFID
     */
    public String getSfid() {
        return sfid;
    }

    /**
     * @param sfid
     */
    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    /**
     * @return START_TIME
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return END_TIME
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return YEARS
     */
    public Integer getYears() {
        return years;
    }

    /**
     * @param years
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * @return NUMBER
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取Logo文件名
     *
     * @return LOGO_FILE - Logo文件名
     */
    public String getLogoFile() {
        return logoFile;
    }

    /**
     * 设置Logo文件名
     *
     * @param logoFile Logo文件名
     */
    public void setLogoFile(String logoFile) {
        this.logoFile = logoFile;
    }

    /**
     * 获取LOGO文件存储位置
     *
     * @return FILE_DIR - LOGO文件存储位置
     */
    public String getFileDir() {
        return fileDir;
    }

    /**
     * 设置LOGO文件存储位置
     *
     * @param fileDir LOGO文件存储位置
     */
    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }
}