package com.jie.demo.model;

import javax.persistence.*;

@Table(name = "tb_rake")
public class TbRake {
    @Id
    @Column(name = "RAKE_ID")
    private String rakeId;

    /**
     * 银行名称
     */
    @Column(name = "BANKNAME")
    private String bankname;

    /**
     * 名次
     */
    @Column(name = "RAKENO")
    private Integer rakeno;

    /**
     * 成员
     */
    @Column(name = "MEMBER")
    private String member;

    /**
     * @return RAKE_ID
     */
    public String getRakeId() {
        return rakeId;
    }

    /**
     * @param rakeId
     */
    public void setRakeId(String rakeId) {
        this.rakeId = rakeId;
    }

    /**
     * 获取银行名称
     *
     * @return BANKNAME - 银行名称
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置银行名称
     *
     * @param bankname 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 获取名次
     *
     * @return RAKENO - 名次
     */
    public Integer getRakeno() {
        return rakeno;
    }

    /**
     * 设置名次
     *
     * @param rakeno 名次
     */
    public void setRakeno(Integer rakeno) {
        this.rakeno = rakeno;
    }

    /**
     * 获取成员
     *
     * @return MEMBER - 成员
     */
    public String getMember() {
        return member;
    }

    /**
     * 设置成员
     *
     * @param member 成员
     */
    public void setMember(String member) {
        this.member = member;
    }
}