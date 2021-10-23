package exercise3;

public class BusinessMortgage extends Mortgage {


    public BusinessMortgage(String customerName, double amountOfMortgage, int term) {
        super(customerName, amountOfMortgage, term);
        this.interestRate = Mortgage.getCurrentPrimeRate()+0.01;
    }


}
