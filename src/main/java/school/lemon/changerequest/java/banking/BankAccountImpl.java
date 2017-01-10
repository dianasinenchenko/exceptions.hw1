package school.lemon.changerequest.java.banking;

/**
 * Created by Diana on 08.01.2017.
 */
public class BankAccountImpl implements BankAccount {


    private static final int INITIAL_ARRAY_SIZE = 10;
    private int arr[];
    private int size;
    private double rate;
    private double balance;
    private int index;


    public BankAccountImpl(int arr[]) {
        this.arr = new int[INITIAL_ARRAY_SIZE];
        this.size = 0;
    }

    public BankAccountImpl(int index, double rate, double balance) {
        this.rate = rate;
        this.balance = balance;
        this.index = index;
    }


    public BankAccountImpl(int index, double balance) {
        this.index = index;
        this.balance = balance;
        this.rate = 1;
    }

    public BankAccountImpl(int index) {
        this.index = index;
        this.balance = 0.0;
        this.rate = 1.0;
    }


    private void CheckSize() {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 10];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }


    /**
     * Get account number
     *
     * @return account number
     */

    public int getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("You are trying to get element at non-existing index %d", index));
        }
        return arr[index];
    }

    @Override
    public int getAccountNumber() {
        return getIndex(index);
    }


    /**
     * Get current balance
     *
     * @return account balance
     */
    @Override
    public double getBalance() {
        return balance;
    }

    /**
     * Get current rate
     *
     * @return account rate
     */
    @Override
    public double getRate() {
        return rate;
    }

    /**
     * Set current account rate in percents
     *
     * @param rate value
     */
    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Withdraw specified sum from account
     *
     * @param sum to withdraw
     * @throws IllegalArgumentException for {@code sum < 0 || sum > balance}
     */
    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
        if (sum < 0 || sum > balance) {
            throw new IllegalArgumentException(String.format(" insufficient funds on the account %d", sum));
        }
        balance = balance - sum;
    }

    /**
     * Deposit specified sum for account
     *
     * @param sum to deposit
     * @throws IllegalArgumentException for {@code sum < 0}
     */
    @Override
    public void deposit(double sum) throws IllegalArgumentException {
        if (sum < 0) {
            throw new IllegalArgumentException(String.format(" insufficient funds on the account %d", sum));
        }
        balance = balance + sum;
    }

    /**
     * Add interest for 1 year to balance.
     * E.g.: rate = 10% and balance = 200$ -> interest = 20$. So, new balance is 120$.
     */
    @Override
    public void addInterest() {
        balance = balance + (balance * rate / 100);
    }
}
