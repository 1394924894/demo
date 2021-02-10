package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_user_account")
public class SmUserAccount {
    @Id
    @Column(name = "pk_user_account")
    private String pkUserAccount;

    @Column(name = "pk_users")
    private String pkUsers;

    @Column(name = "pk_account")
    private String pkAccount;

    @Column(name = "ua_status")
    private String uaStatus;

    /**
     * @return pk_user_account
     */
    public String getPkUserAccount() {
        return pkUserAccount;
    }

    /**
     * @param pkUserAccount
     */
    public void setPkUserAccount(String pkUserAccount) {
        this.pkUserAccount = pkUserAccount;
    }

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
     * @return pk_account
     */
    public String getPkAccount() {
        return pkAccount;
    }

    /**
     * @param pkAccount
     */
    public void setPkAccount(String pkAccount) {
        this.pkAccount = pkAccount;
    }

    /**
     * @return ua_status
     */
    public String getUaStatus() {
        return uaStatus;
    }

    /**
     * @param uaStatus
     */
    public void setUaStatus(String uaStatus) {
        this.uaStatus = uaStatus;
    }
}