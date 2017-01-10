package school.lemon.changerequest.java.banking;

/**
 * Created by Diana on 10.01.2017.
 */
public class TransactionalBankAccountImpl extends BankAccountImpl implements TransactionalBankAccount {


    public TransactionalBankAccountImpl(int index, double rate, double balance) {
        super(index, rate, balance);
    }

    /**
     * Get account number
     *
     * @return account number
     */
    @Override
    public int getAccountNumber() {
        return super.getAccountNumber();
    }

    /**
     * Get current balance
     *
     * @return account balance
     */
    @Override
    public double getBalance() {
        return super.getBalance();
    }

    /**
     * Get current rate
     *
     * @return account rate
     */
    @Override
    public double getRate() {
        return super.getRate();
    }

    /**
     * Set current account rate in percents
     *
     * @param rate value
     */
    @Override
    public void setRate(double rate) {
        super.setRate(rate);
    }

    /**
     * Withdraw specified sum from account
     *
     * @param sum to withdraw
     * @throws IllegalArgumentException for {@code sum < 0 || sum > balance}
     */
    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
        super.withdraw(sum);

    }

    /**
     * Deposit specified sum for account
     *
     * @param sum to deposit
     * @throws IllegalArgumentException for {@code sum < 0}
     */
    @Override
    public void deposit(double sum) throws IllegalArgumentException {
        super.deposit(sum);
    }

    /**
     * Add interest for 1 year to balance.
     * E.g.: rate = 10% and balance = 200$ -> interest = 20$. So, new balance is 120$.
     */
    @Override
    public void addInterest() {
        super.addInterest();
    }

    /**
     * Specified whether future operations should be in transaction.
     *
     * @param value
     */
    @Override
    public void setAutoCommit(boolean value) {

    }

    /**
     * @return true - if auto commit enabled, false - otherwise.
     */
    @Override
    public boolean isAutoCommitEnabled() {
        return false;
    }

    /**
     * Commits all uncommitted operations
     */
    @Override
    public void commit() {

    }

    /**
     * Revert all uncommitted operations
     */
    @Override
    public void revert() {

    }
}
