package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.BankAccount;
import school.lemon.changerequest.java.banking.BankAccountImpl;
import school.lemon.changerequest.java.banking.TransactionalBankAccount;
import school.lemon.changerequest.java.banking.TransactionalBankAccountImpl;

public final class AccountFactory {

    private AccountFactory() {
    }

    /**
     * Creates bank account
     *
     * @return bank account
     */
    public static BankAccount createBankAccount(int index, double rate, double balance) {
        BankAccountImpl bankAccount = new BankAccountImpl(index, rate, balance);
        return bankAccount;
    }

    /**
     * Creates transactional bank account
     *
     * @return transactional bank account
     */
    public static TransactionalBankAccount createTransactionalBankAccount(int index, double rate, double balance) {
        TransactionalBankAccountImpl transactionalBankAccount = new TransactionalBankAccountImpl(index, rate, balance);
        return transactionalBankAccount;
    }
}
