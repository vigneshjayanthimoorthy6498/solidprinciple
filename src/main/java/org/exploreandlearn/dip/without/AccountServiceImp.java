package org.exploreandlearn.dip.without;

public class AccountServiceImp {

    public Account getAccountId(long id) {
        return new Account(id, 900.0, "vignesh");
    }
}


record Account(long account, double balance, String name) {}