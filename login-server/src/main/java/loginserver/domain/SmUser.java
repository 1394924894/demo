package loginserver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mytest2..sm_user")
public class SmUser {
    @Id
    @Column(name = "PK_USERS")
    private String pkUsers;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "RIGHTS")
    private String rights;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "LAST_LOGIN")
    private String lastLogin;

    @Column(name = "IP")
    private String ip;

    /**
     * 用户状态: 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "SKIN")
    private String skin;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "PK_OF_ORG")
    private String pkOfOrg;

    private String profession;

    @Column(name = "join_year")
    private String joinYear;

    @Column(name = "register_datetime")
    private String registerDatetime;

    /**
     * @return PK_USERS
     */
    public String getPkUsers() {
        return pkUsers;
    }

    /**
     * @param pkUsers
     */
    public void setPkUsers(String pkUsers) {
        this.pkUsers = pkUsers;
    }

    /**
     * @return USER_CODE
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
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
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return USER_TYPE
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
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
     * 获取用户状态: 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     *
     * @return STATUS - 用户状态: 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置用户状态: 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     *
     * @param status 用户状态: 0初始状态，1正常使用，2审批中，3暂停使用，9已作废
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return SKIN
     */
    public String getSkin() {
        return skin;
    }

    /**
     * @param skin
     */
    public void setSkin(String skin) {
        this.skin = skin;
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
     * @return PK_OF_ORG
     */
    public String getPkOfOrg() {
        return pkOfOrg;
    }

    /**
     * @param pkOfOrg
     */
    public void setPkOfOrg(String pkOfOrg) {
        this.pkOfOrg = pkOfOrg;
    }

    /**
     * @return profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return join_year
     */
    public String getJoinYear() {
        return joinYear;
    }

    /**
     * @param joinYear
     */
    public void setJoinYear(String joinYear) {
        this.joinYear = joinYear;
    }

    /**
     * @return register_datetime
     */
    public String getRegisterDatetime() {
        return registerDatetime;
    }

    /**
     * @param registerDatetime
     */
    public void setRegisterDatetime(String registerDatetime) {
        this.registerDatetime = registerDatetime;
    }
}