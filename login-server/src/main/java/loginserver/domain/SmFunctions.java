package loginserver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mytest2..sm_functions")
public class SmFunctions {
    @Id
    @Column(name = "pk_functions")
    private String pkFunctions;

    @Column(name = "fnc_code")
    private String fncCode;

    @Column(name = "fnc_name")
    private String fncName;

    @Column(name = "fnc_type")
    private String fncType;

    @Column(name = "fnc_status")
    private String fncStatus;

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

    /**
     * @return fnc_code
     */
    public String getFncCode() {
        return fncCode;
    }

    /**
     * @param fncCode
     */
    public void setFncCode(String fncCode) {
        this.fncCode = fncCode;
    }

    /**
     * @return fnc_name
     */
    public String getFncName() {
        return fncName;
    }

    /**
     * @param fncName
     */
    public void setFncName(String fncName) {
        this.fncName = fncName;
    }

    /**
     * @return fnc_type
     */
    public String getFncType() {
        return fncType;
    }

    /**
     * @param fncType
     */
    public void setFncType(String fncType) {
        this.fncType = fncType;
    }

    /**
     * @return fnc_status
     */
    public String getFncStatus() {
        return fncStatus;
    }

    /**
     * @param fncStatus
     */
    public void setFncStatus(String fncStatus) {
        this.fncStatus = fncStatus;
    }
}