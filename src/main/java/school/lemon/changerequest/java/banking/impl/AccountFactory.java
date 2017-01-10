package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.BankAccount;
import school.lemon.changerequest.java.banking.BankAccountImpl;
import school.lemon.changerequest.java.banking.TransactionalBankAccount;

public final class AccountFactory {

    private AccountFactory() {
    }

    /**
     * Creates bank account
     * @return bank account
     */
    public static BankAccount createBankAccount(int index, double rate, double balance) {
        BankAccountImpl bankAccount = new BankAccountImpl(index,rate,balance);
        //TODO: implement me
        return bankAccount;
    }

    /**
     * Creates transactional bank account
     * @return transactional bank account
     */
    public static TransactionalBankAccount createTransactionalBankAccount() {
        //TODO: implement me
        return null;
    }
}
