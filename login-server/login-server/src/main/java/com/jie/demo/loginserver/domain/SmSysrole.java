package com.jie.demo.loginserver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mytest2..sm_sysrole")
public class SmSysrole {
    @Id
    @Column(name = "pk_sysrole")
    private String pkSysrole;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_type")
    private String roleType;

    /**
     * @return pk_sysrole
     */
    public String getPkSysrole() {
        return pkSysrole;
    }

    /**
     * @param pkSysrole
     */
    public void setPkSysrole(String pkSysrole) {
        this.pkSysrole = pkSysrole;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_type
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * @param roleType
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}