package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_users")
public class SmUsers {
    @Id
    @Column(name = "pk_users")
    private String pkUsers;

    @Column(name = "user_code")
    private String userCode;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "account_status")
    private String accountStatus;

    /**
     * @return pk_users
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
     * @return user_code
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
     * @return user_name
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
     * @return user_type
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
     * @return user_pass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * @return account_status
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * @param accountStatus
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}