package commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test2..sm_schoolinfo")
public class SmSchoolinfo {
    @Id
    @Column(name = "pk_schooleinfo")
    private String pkSchooleinfo;

    /**
     * 行政区域代码
     */
    @Column(name = "admin_division_code")
    private String adminDivisionCode;

    /**
     * 学校代码
     */
    @Column(name = "school_code")
    private String schoolCode;

    /**
     * 学校名称
     */
    @Column(name = "school_name")
    private String schoolName;

    /**
     * 管理部门
     */
    @Column(name = "manage_dept")
    private String manageDept;

    /**
     * 所在地
     */
    private String base;

    /**
     * 办学层次
     */
    @Column(name = "school_level")
    private String schoolLevel;

    /**
     * 备注信息
     */
    private String memo;

    /**
     * @return pk_schooleinfo
     */
    public String getPkSchooleinfo() {
        return pkSchooleinfo;
    }

    /**
     * @param pkSchooleinfo
     */
    public void setPkSchooleinfo(String pkSchooleinfo) {
        this.pkSchooleinfo = pkSchooleinfo;
    }

    /**
     * 获取行政区域代码
     *
     * @return admin_division_code - 行政区域代码
     */
    public String getAdminDivisionCode() {
        return adminDivisionCode;
    }

    /**
     * 设置行政区域代码
     *
     * @param adminDivisionCode 行政区域代码
     */
    public void setAdminDivisionCode(String adminDivisionCode) {
        this.adminDivisionCode = adminDivisionCode;
    }

    /**
     * 获取学校代码
     *
     * @return school_code - 学校代码
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * 设置学校代码
     *
     * @param schoolCode 学校代码
     */
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    /**
     * 获取学校名称
     *
     * @return school_name - 学校名称
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置学校名称
     *
     * @param schoolName 学校名称
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * 获取管理部门
     *
     * @return manage_dept - 管理部门
     */
    public String getManageDept() {
        return manageDept;
    }

    /**
     * 设置管理部门
     *
     * @param manageDept 管理部门
     */
    public void setManageDept(String manageDept) {
        this.manageDept = manageDept;
    }

    /**
     * 获取所在地
     *
     * @return base - 所在地
     */
    public String getBase() {
        return base;
    }

    /**
     * 设置所在地
     *
     * @param base 所在地
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 获取办学层次
     *
     * @return school_level - 办学层次
     */
    public String getSchoolLevel() {
        return schoolLevel;
    }

    /**
     * 设置办学层次
     *
     * @param schoolLevel 办学层次
     */
    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    /**
     * 获取备注信息
     *
     * @return memo - 备注信息
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注信息
     *
     * @param memo 备注信息
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}