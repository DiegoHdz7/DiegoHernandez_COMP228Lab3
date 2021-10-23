package exercise1;

public class Life extends Insurance{

    public Life(double monthlyCost){
        super("Life", monthlyCost);
    }

    @Override
    void setInsuranceCost(double newCost) {
        this.monthlyCost=newCost;

    }

    @Override
    void displayInfo() {
        System.out.println("Insurance Type: "+getInsuranceType()+", Monthly Cost: "+getMonthlyCost());

    }
}
