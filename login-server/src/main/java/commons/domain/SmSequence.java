package commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test2..sm_sequence")
public class SmSequence {
    @Id
    @Column(name = "pk_sequence")
    private String pkSequence;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "current_value")
    private String currentValue;

    private Byte increment;

    private Byte cache;

    /**
     * @return pk_sequence
     */
    public String getPkSequence() {
        return pkSequence;
    }

    /**
     * @param pkSequence
     */
    public void setPkSequence(String pkSequence) {
        this.pkSequence = pkSequence;
    }

    /**
     * @return table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return current_value
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue
     */
    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * @return increment
     */
    public Byte getIncrement() {
        return increment;
    }

    /**
     * @param increment
     */
    public void setIncrement(Byte increment) {
        this.increment = increment;
    }

    /**
     * @return cache
     */
    public Byte getCache() {
        return cache;
    }

    /**
     * @param cache
     */
    public void setCache(Byte cache) {
        this.cache = cache;
    }
}