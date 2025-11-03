package org.exploreandlearn.dip.with;

public class AccountServiceImpl implements AccountService{
    @Override
    public Account getAccountId(long accountNumber) {
        return new Account(accountNumber, 900.0, "vignesh");
    }
}
