package org.exploreandlearn.ocp.with;

public class FixedDepositAccount implements InterestCalculator{
    @Override
    public double calculateInterest(double amount) {
        return amount + (amount * .775);
    }
}
