package com.jie.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sm_db")
public class SmDb {
    @Id
    @Column(name = "PK_ACCOUNT")
    private String pkAccount;

    private String memo;

    private String info;

    private String type;

    /**
     * @return PK_ACCOUNT
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
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}