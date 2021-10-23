package exercise1;

 abstract  class  Insurance  {
     private String insuranceType;
     protected double monthlyCost;

     protected Insurance(String insuranceType, double monthlyCost){
         this.insuranceType=insuranceType;
         this.monthlyCost=monthlyCost;
     }

    protected  String getInsuranceType() {
         return insuranceType;
     }

     protected double getMonthlyCost() {
         return monthlyCost;
     }

     abstract void setInsuranceCost(double newCost);
     abstract void displayInfo();

 }
