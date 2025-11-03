package org.exploreandlearn.srp.with;

public class StatementService {

    public void generateStatement(BankAccount account) {
        System.out.println("Generating the statement with balance "+ account.getBalance());
    }
}
