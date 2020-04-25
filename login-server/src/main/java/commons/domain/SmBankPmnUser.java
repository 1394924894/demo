package commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test2..sm_bank_pmn_user")
public class SmBankPmnUser {
    @Id
    @Column(name = "PK_BANK_PMN_USER")
    private String pkBankPmnUser;

    @Column(name = "PK_BANK_PMN")
    private String pkBankPmn;

    @Column(name = "RANDOM_NUMBER")
    private String randomNumber;

    @Column(name = "PK_USERS")
    private String pkUsers;

    @Column(name = "BANK_STATUS")
    private String bankStatus;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "POSITION")
    private String position;

    /**
     * @return PK_BANK_PMN_USER
     */
    public String getPkBankPmnUser() {
        return pkBankPmnUser;
    }

    /**
     * @param pkBankPmnUser
     */
    public void setPkBankPmnUser(String pkBankPmnUser) {
        this.pkBankPmnUser = pkBankPmnUser;
    }

    /**
     * @return PK_BANK_PMN
     */
    public String getPkBankPmn() {
        return pkBankPmn;
    }

    /**
     * @param pkBankPmn
     */
    public void setPkBankPmn(String pkBankPmn) {
        this.pkBankPmn = pkBankPmn;
    }

    /**
     * @return RANDOM_NUMBER
     */
    public String getRandomNumber() {
        return randomNumber;
    }

    /**
     * @param randomNumber
     */
    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    /**
     * @return PK_USERS
     */
    public String getPkUsers() {
        return pkUsers;
    }

    /**
     * @param pkUsers
     */
    public void setPkUsers(String pkUsers) {
        this.pkUsers = pkUsers;
    }

    /**
     * @return BANK_STATUS
     */
    public String getBankStatus() {
        return bankStatus;
    }

    /**
     * @param bankStatus
     */
    public void setBankStatus(String bankStatus) {
        this.bankStatus = bankStatus;
    }

    /**
     * @return NICKNAME
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return POSITION
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }
}