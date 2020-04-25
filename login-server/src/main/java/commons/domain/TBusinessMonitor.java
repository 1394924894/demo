package commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test2..t_business_monitor")
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