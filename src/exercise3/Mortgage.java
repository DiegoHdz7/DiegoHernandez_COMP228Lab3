package exercise3;

abstract class Mortgage implements MortgageConstants {
    private  int mortgageNumber;
    private String customerName;
    private double amountOfMortgage;
    protected double interestRate;
    private int term;
    private static int mortgagesCounter=1;
    private static double currentPrimeRate;

    public Mortgage(String customerName, double amountOfMortgage, int term){
        mortgageNumber=mortgagesCounter++;
        this.customerName=customerName;
        this.term=term;
        this.amountOfMortgage = (amountOfMortgage>MAXIMUM_MORTGAGE_AMOUNT)? MAXIMUM_MORTGAGE_AMOUNT : amountOfMortgage;
        this.term=(term!=SHORT_TERM && term!=MEDIUM_TERM && term!=LONG_TERM)? SHORT_TERM :term;
    }

    public static void setCurrentPrimeRate(double currentPrimeRate) {
        Mortgage.currentPrimeRate = currentPrimeRate;
    }

    public static double getCurrentPrimeRate() {
        return currentPrimeRate;
    }

    protected void getMortgageInfo(){
        System.out.println("Mortgage Number: " + mortgageNumber+
                ", Customer Name: " + customerName+
                ", Amount of Mortgage: " + amountOfMortgage+
                "Total Interest: " + (Math.round(interestRate*100)) + " %"+
                ",  Term: " + term + " year(s)");

    }
}
