package loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..tb_sample")
public class TbSample {
    @Id
    @Column(name = "SAMPLE_ID")
    private String sampleId;

    /**
     * ID值
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Name
     */
    private String 名称;

    /**
     * @return SAMPLE_ID
     */
    public String getSampleId() {
        return sampleId;
    }

    /**
     * @param sampleId
     */
    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * 获取ID值
     *
     * @return ID - ID值
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID值
     *
     * @param id ID值
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取Name
     *
     * @return 名称 - Name
     */
    public String get名称() {
        return 名称;
    }

    /**
     * 设置Name
     *
     * @param 名称 Name
     */
    public void set名称(String 名称) {
        this.名称 = 名称;
    }
}