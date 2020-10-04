package practice;

/**
 * This utility class calculates different types of interets
 */
public class InterestCalculations {

    public static void main(String[] args) {
    }

    /**
     * javadoc : Java documentation for public method "calculateSimpleInterest"
     * This method will calculate simple interest
     *
     * @param  principalValue The principal amount borrowed
     * @param rateValue rate
     * @param timeValue time
     *
     * @return the simpleInterest value
     */
    public double calculateSimpleInterest(int principalValue, float rateValue, int timeValue) {
        double simpleInterest = (principalValue * rateValue * timeValue) / 100;
        return simpleInterest;
    }
    protected double calculateCompoundInterest(int principalValue, float rateValue, int timeValue) {
        double compoundInterest = principalValue * (1 + (rateValue/100));
        return compoundInterest;
    }

    protected double balance() {
        double someFixedBalance = getBalanceValue(); // call private method for getting balance vale
        return someFixedBalance;
    }

    // this private method will give balance value.
    // This method can be re-used multiple times within this same class when needed.
    private double getBalanceValue() {
        return 150000.00;
    }
}



