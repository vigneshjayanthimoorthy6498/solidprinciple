package org.exploreandlearn.isp.with;

import org.exploreandlearn.isp.with.Loan;

public class GoldLoan implements Loan, CollateralLoan {
    @Override
    public void applyLoan() {
        System.out.println("Applying for Gold Loan");
    }


    @Override
    public void evaluateCollateral() {
        System.out.println("Evaluate the collateral for given gold loan");
    }

}