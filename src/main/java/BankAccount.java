import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /**
     * gets the number of accounts.
     */
    public static int getNumAccounts() {
        return numOfAccounts;
    }
    /**
     * You may want to use this to distinguish between different kinds of accounts.
     *
     */
    public enum BankAccountType {
        /**
         * checking account.
         */
        CHECKINGS,
        /**
         * savings account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * work account.
         */
        WORKPLACE
    }

    /**
     * the number of accounts.
     */
    private static int numOfAccounts;

    /**
     * indentifying account number.
     */
    private int accountNumber;
    /**
     * the type of account.
     */
    private BankAccountType accountType;
    /**
     * the money in the account.
     */
    private double accountBalance;
    /**
     * name of the owner.
     */
    private String ownerName;
    /**
     * the rate of interest.
     */
    private double interestRate;
    /**
     * interest earner.
     */
    private double interestEarned;

    /**
     * Sets the owner and account type.
     * @param name owner's name.
     * @param accountCategory account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        numOfAccounts++;
    }

    /**
     * get account number.
     * @return the account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * kdk.
     * @param accountNumber dddd
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * get acct type.
     * @return acct. type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * kdkdkd kdkdk.
     * @param accountType jdjdjd
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * kdjfdkjkf.
     * @return fjdkl;
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * fjdklsl.
     * @param accountBalance jfkdlsls
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * fjkdslls.
     * @return fjdksl
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * fjdkls.
     * @param interestEarned fjksldls
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }

    /**
     * fjkdslsl.
     * @return fjdksl
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * fjkdslsl.
     * @param interestRate  fjdksl
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     * fjkdslsl.
     * @return fjdksl
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * fjkdls.
     * @param newName fjkdls
     */
    public void changeOwnerName(final String newName) {
        this.ownerName = newName;
    }
}
