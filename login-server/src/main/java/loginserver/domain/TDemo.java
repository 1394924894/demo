package loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..t_demo")
public class TDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "PK_DEMO")
    private String pkDemo;

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

    /**
     * @return PK_DEMO
     */
    public String getPkDemo() {
        return pkDemo;
    }

    /**
     * @param pkDemo
     */
    public void setPkDemo(String pkDemo) {
        this.pkDemo = pkDemo;
    }
}