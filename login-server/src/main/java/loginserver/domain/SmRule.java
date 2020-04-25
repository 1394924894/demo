package loginserver.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mytest2..sm_rule")
public class SmRule {
    @Id
    @Column(name = "PK_RULE")
    private String pkRule;

    /**
     * 菜单地址
     */
    @Column(name = "MENU_ID")
    private Integer menuId;

    /**
     * 规则名称
     */
    @Column(name = "RULE_TITLE")
    private String ruleTitle;

    /**
     * 规则说明1
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return PK_RULE
     */
    public String getPkRule() {
        return pkRule;
    }

    /**
     * @param pkRule
     */
    public void setPkRule(String pkRule) {
        this.pkRule = pkRule;
    }

    /**
     * 获取菜单地址
     *
     * @return MENU_ID - 菜单地址
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单地址
     *
     * @param menuId 菜单地址
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取规则名称
     *
     * @return RULE_TITLE - 规则名称
     */
    public String getRuleTitle() {
        return ruleTitle;
    }

    /**
     * 设置规则名称
     *
     * @param ruleTitle 规则名称
     */
    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle;
    }

    /**
     * 获取规则说明1
     *
     * @return DESCRIPTION - 规则说明1
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置规则说明1
     *
     * @param description 规则说明1
     */
    public void setDescription(String description) {
        this.description = description;
    }
}