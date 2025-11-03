package org.exploreandlearn.ocp.with;

public class RecurringDeposit implements  InterestCalculator{
    @Override
    public double calculateInterest(double amount) {
        return amount + (amount * 0.65);
    }
}
