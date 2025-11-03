package org.exploreandlearn.ocp.without;

public class InterestCalculator {

    // this is code is bad example for OCP.
    // this method violated the principle of OCP
    // if we want to calculate interest for
    // new type need to modify this piece of code.
    public double calculateInterest(String type, double amount) {
        return switch (type) {
            case "FD" ->  amount + (amount * 0.75);
            case "SAVING" -> amount + (amount * 0.50);
            case "RD" -> amount + (amount * 0.68);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
