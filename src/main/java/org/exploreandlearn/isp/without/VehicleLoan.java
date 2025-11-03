package org.exploreandlearn.isp.without;


// This class is violating the principle of the ISP
// because implementing the unwanted abstract method
// that is irrelevant to the vehicle loan
public class VehicleLoan implements Loan{
    @Override
    public void applyLoan() {
        System.out.println("Applying for Gold Loan");
    }

    @Override
    public void calculateEMI() {
        System.out.println("Evaluate the collateral for given vehicle loan");
    }

    @Override
    public void evaluateCollateral() {
        throw new IllegalArgumentException("Is not application for Gold Loan");
    }


}
