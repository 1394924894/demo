package cn.xuhao.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sm_tran_code")
public class SmTranCode {
    @Id
    @Column(name = "PK_TRAN_CODE")
    private String pkTranCode;

    @Column(name = "CODE_KEY")
    private String codeKey;

    @Column(name = "CODE_NAME")
    private String codeName;

    @Column(name = "CAL_FIELD")
    private String calField;

    @Column(name = "IS_VOUCHER")
    private String isVoucher;

    @Column(name = "IO_FLAG")
    private String ioFlag;

    @Column(name = "IO_BANK")
    private String ioBank;

    @Column(name = "IS_L")
    private String isL;

    @Column(name = "IS_N")
    private String isN;

    @Column(name = "IS_D")
    private String isD;

    @Column(name = "IS_LC")
    private String isLc;

    @Column(name = "IS_P")
    private String isP;

    @Column(name = "IS_O")
    private String isO;

    /**
     * @return PK_TRAN_CODE
     */
    public String getPkTranCode() {
        return pkTranCode;
    }

    /**
     * @param pkTranCode
     */
    public void setPkTranCode(String pkTranCode) {
        this.pkTranCode = pkTranCode;
    }

    /**
     * @return CODE_KEY
     */
    public String getCodeKey() {
        return codeKey;
    }

    /**
     * @param codeKey
     */
    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    /**
     * @return CODE_NAME
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * @param codeName
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * @return CAL_FIELD
     */
    public String getCalField() {
        return calField;
    }

    /**
     * @param calField
     */
    public void setCalField(String calField) {
        this.calField = calField;
    }

    /**
     * @return IS_VOUCHER
     */
    public String getIsVoucher() {
        return isVoucher;
    }

    /**
     * @param isVoucher
     */
    public void setIsVoucher(String isVoucher) {
        this.isVoucher = isVoucher;
    }

    /**
     * @return IO_FLAG
     */
    public String getIoFlag() {
        return ioFlag;
    }

    /**
     * @param ioFlag
     */
    public void setIoFlag(String ioFlag) {
        this.ioFlag = ioFlag;
    }

    /**
     * @return IO_BANK
     */
    public String getIoBank() {
        return ioBank;
    }

    /**
     * @param ioBank
     */
    public void setIoBank(String ioBank) {
        this.ioBank = ioBank;
    }

    /**
     * @return IS_L
     */
    public String getIsL() {
        return isL;
    }

    /**
     * @param isL
     */
    public void setIsL(String isL) {
        this.isL = isL;
    }

    /**
     * @return IS_N
     */
    public String getIsN() {
        return isN;
    }

    /**
     * @param isN
     */
    public void setIsN(String isN) {
        this.isN = isN;
    }

    /**
     * @return IS_D
     */
    public String getIsD() {
        return isD;
    }

    /**
     * @param isD
     */
    public void setIsD(String isD) {
        this.isD = isD;
    }

    /**
     * @return IS_LC
     */
    public String getIsLc() {
        return isLc;
    }

    /**
     * @param isLc
     */
    public void setIsLc(String isLc) {
        this.isLc = isLc;
    }

    /**
     * @return IS_P
     */
    public String getIsP() {
        return isP;
    }

    /**
     * @param isP
     */
    public void setIsP(String isP) {
        this.isP = isP;
    }

    /**
     * @return IS_O
     */
    public String getIsO() {
        return isO;
    }

    /**
     * @param isO
     */
    public void setIsO(String isO) {
        this.isO = isO;
    }
}