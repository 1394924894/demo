package com.jie.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sm_bank_pmn")
public class SmBankPmn {
    @Id
    @Column(name = "PK_BANK_PMN")
    private String pkBankPmn;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "RANDOM_NUMBER")
    private String randomNumber;

    @Column(name = "ADMINISTRATOR")
    private String administrator;

    @Column(name = "CLS_RANDOM_NUMBER")
    private String clsRandomNumber;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATE_TIME")
    private String createTime;

    @Column(name = "MODIFYOR")
    private String modifyor;

    @Column(name = "MODIFY_TIME")
    private String modifyTime;

    /**
     * @return PK_BANK_PMN
     */
    public String getPkBankPmn() {
        return pkBankPmn;
    }

    /**
     * @param pkBankPmn
     */
    public void setPkBankPmn(String pkBankPmn) {
        this.pkBankPmn = pkBankPmn;
    }

    /**
     * @return BANK_NAME
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return RANDOM_NUMBER
     */
    public String getRandomNumber() {
        return randomNumber;
    }

    /**
     * @param randomNumber
     */
    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    /**
     * @return ADMINISTRATOR
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator
     */
    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    /**
     * @return CLS_RANDOM_NUMBER
     */
    public String getClsRandomNumber() {
        return clsRandomNumber;
    }

    /**
     * @param clsRandomNumber
     */
    public void setClsRandomNumber(String clsRandomNumber) {
        this.clsRandomNumber = clsRandomNumber;
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return MODIFYOR
     */
    public String getModifyor() {
        return modifyor;
    }

    /**
     * @param modifyor
     */
    public void setModifyor(String modifyor) {
        this.modifyor = modifyor;
    }

    /**
     * @return MODIFY_TIME
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}