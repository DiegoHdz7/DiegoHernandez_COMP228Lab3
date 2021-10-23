package exercise1;

public class Health extends Insurance{
    public Health(double monthlyCost){
        super("Health", monthlyCost);
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
