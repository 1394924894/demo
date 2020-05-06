package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "t_business_monitor")
public class TBusinessMonitor {
    @Id
    @Column(name = "PK_BUSINESSMONITOR")
    private String pkBusinessmonitor;

    @Column(name = "bank_name")
    private String bankName;

    /**
     * @return PK_BUSINESSMONITOR
     */
    public String getPkBusinessmonitor() {
        return pkBusinessmonitor;
    }

    /**
     * @param pkBusinessmonitor
     */
    public void setPkBusinessmonitor(String pkBusinessmonitor) {
        this.pkBusinessmonitor = pkBusinessmonitor;
    }

    /**
     * @return bank_name
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
}