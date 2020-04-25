package loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..t_managectrl")
public class TManagectrl {
    @Id
    @Column(name = "PK_MANAGECTRL")
    private String pkManagectrl;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * @return PK_MANAGECTRL
     */
    public String getPkManagectrl() {
        return pkManagectrl;
    }

    /**
     * @param pkManagectrl
     */
    public void setPkManagectrl(String pkManagectrl) {
        this.pkManagectrl = pkManagectrl;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}