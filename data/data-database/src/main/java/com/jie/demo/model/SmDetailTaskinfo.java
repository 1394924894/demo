package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_detail_taskinfo")
public class SmDetailTaskinfo {
    @Id
    @Column(name = "PK_DETAIL_TASKINFO")
    private String pkDetailTaskinfo;

    @Column(name = "KEY_CODE")
    private String keyCode;

    @Column(name = "KEY_NAME")
    private String keyName;

    /**
     * @return PK_DETAIL_TASKINFO
     */
    public String getPkDetailTaskinfo() {
        return pkDetailTaskinfo;
    }

    /**
     * @param pkDetailTaskinfo
     */
    public void setPkDetailTaskinfo(String pkDetailTaskinfo) {
        this.pkDetailTaskinfo = pkDetailTaskinfo;
    }

    /**
     * @return KEY_CODE
     */
    public String getKeyCode() {
        return keyCode;
    }

    /**
     * @param keyCode
     */
    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    /**
     * @return KEY_NAME
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * @param keyName
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
}