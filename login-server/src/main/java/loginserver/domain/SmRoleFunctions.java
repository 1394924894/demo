package loginserver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mytest2..sm_role_functions")
public class SmRoleFunctions {
    @Id
    @Column(name = "pk_role_functions")
    private String pkRoleFunctions;

    @Column(name = "pk_sysrole")
    private String pkSysrole;

    @Column(name = "pk_functions")
    private String pkFunctions;

    /**
     * @return pk_role_functions
     */
    public String getPkRoleFunctions() {
        return pkRoleFunctions;
    }

    /**
     * @param pkRoleFunctions
     */
    public void setPkRoleFunctions(String pkRoleFunctions) {
        this.pkRoleFunctions = pkRoleFunctions;
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

    /**
     * @return pk_functions
     */
    public String getPkFunctions() {
        return pkFunctions;
    }

    /**
     * @param pkFunctions
     */
    public void setPkFunctions(String pkFunctions) {
        this.pkFunctions = pkFunctions;
    }
}