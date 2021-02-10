package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_syspara")
public class SmSyspara {
    @Id
    @Column(name = "pk_syspara")
    private String pkSyspara;

    @Column(name = "p_key")
    private String pKey;

    @Column(name = "p_value")
    private String pValue;

    @Column(name = "p_default")
    private String pDefault;

    @Column(name = "p_name")
    private String pName;

    @Column(name = "p_desc")
    private String pDesc;

    @Column(name = "p_data_type")
    private String pDataType;

    @Column(name = "p_type")
    private String pType;

    @Column(name = "pk_account")
    private String pkAccount;

    /**
     * @return pk_syspara
     */
    public String getPkSyspara() {
        return pkSyspara;
    }

    /**
     * @param pkSyspara
     */
    public void setPkSyspara(String pkSyspara) {
        this.pkSyspara = pkSyspara;
    }

    /**
     * @return p_key
     */
    public String getpKey() {
        return pKey;
    }

    /**
     * @param pKey
     */
    public void setpKey(String pKey) {
        this.pKey = pKey;
    }

    /**
     * @return p_value
     */
    public String getpValue() {
        return pValue;
    }

    /**
     * @param pValue
     */
    public void setpValue(String pValue) {
        this.pValue = pValue;
    }

    /**
     * @return p_default
     */
    public String getpDefault() {
        return pDefault;
    }

    /**
     * @param pDefault
     */
    public void setpDefault(String pDefault) {
        this.pDefault = pDefault;
    }

    /**
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return p_desc
     */
    public String getpDesc() {
        return pDesc;
    }

    /**
     * @param pDesc
     */
    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    /**
     * @return p_data_type
     */
    public String getpDataType() {
        return pDataType;
    }

    /**
     * @param pDataType
     */
    public void setpDataType(String pDataType) {
        this.pDataType = pDataType;
    }

    /**
     * @return p_type
     */
    public String getpType() {
        return pType;
    }

    /**
     * @param pType
     */
    public void setpType(String pType) {
        this.pType = pType;
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
}