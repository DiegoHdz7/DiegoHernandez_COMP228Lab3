package exercise3;

public class PersonalMortgage extends Mortgage{
    public PersonalMortgage(String customerName, double amountOfMortgage, int term) {
        super(customerName, amountOfMortgage, term);
        this.interestRate = Mortgage.getCurrentPrimeRate()+0.02;
    }
}
