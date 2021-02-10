package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_code_map")
public class SmCodeMap {
    @Id
    @Column(name = "type_code")
    private String typeCode;

    @Id
    @Column(name = "code_key")
    private String codeKey;

    @Column(name = "code_value")
    private String codeValue;

    @Column(name = "pk_code_map")
    private String pkCodeMap;

    @Column(name = "CODE_PLUS")
    private String codePlus;

    /**
     * @return type_code
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * @param typeCode
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * @return code_key
     */
    public String getCodeKey() {
        return codeKey;
    }

    /**
     * @param codeKey
     */
    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    /**
     * @return code_value
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * @param codeValue
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * @return pk_code_map
     */
    public String getPkCodeMap() {
        return pkCodeMap;
    }

    /**
     * @param pkCodeMap
     */
    public void setPkCodeMap(String pkCodeMap) {
        this.pkCodeMap = pkCodeMap;
    }

    /**
     * @return CODE_PLUS
     */
    public String getCodePlus() {
        return codePlus;
    }

    /**
     * @param codePlus
     */
    public void setCodePlus(String codePlus) {
        this.codePlus = codePlus;
    }
}