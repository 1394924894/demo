package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "sm_code_type")
public class SmCodeType {
    @Column(name = "type_code")
    private String typeCode;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "pk_code_type")
    private String pkCodeType;

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
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return pk_code_type
     */
    public String getPkCodeType() {
        return pkCodeType;
    }

    /**
     * @param pkCodeType
     */
    public void setPkCodeType(String pkCodeType) {
        this.pkCodeType = pkCodeType;
    }
}