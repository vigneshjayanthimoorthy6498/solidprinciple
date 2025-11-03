package org.exploreandlearn.isp.without;

// This class is violating the principle of the ISP
// because implementing the unwanted abstract method
// that is irrelevant to the vehicle loan
public class GoldLoan  implements Loan{
    @Override
    public void applyLoan() {
        System.out.println("Applying for Gold Loan");
    }

    @Override
    public void calculateEMI() {
        throw new IllegalArgumentException("Is not application for Gold Loan");
    }

    @Override
    public void evaluateCollateral() {
        System.out.println("Evaluate the collateral for given gold loan");
    }
}
