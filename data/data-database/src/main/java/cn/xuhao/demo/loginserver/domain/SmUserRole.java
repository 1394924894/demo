package cn.xuhao.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sm_user_role")
public class SmUserRole {
    @Id
    @Column(name = "pk_user_role")
    private String pkUserRole;

    @Column(name = "pk_users")
    private String pkUsers;

    @Column(name = "pk_sysrole")
    private String pkSysrole;

    /**
     * @return pk_user_role
     */
    public String getPkUserRole() {
        return pkUserRole;
    }

    /**
     * @param pkUserRole
     */
    public void setPkUserRole(String pkUserRole) {
        this.pkUserRole = pkUserRole;
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
}