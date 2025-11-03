package org.exploreandlearn.isp.with;

public class VehicleLoan implements Loan, EMILoan {
    @Override
    public void applyLoan() {
        System.out.println("Applying for Gold Loan");
    }

    @Override
    public void calculateEMI() {
        System.out.println("Evaluate the collateral for given vehicle loan");
    }
}
