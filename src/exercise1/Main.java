package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Insurance insurance1 = new Life(100);
        insurance1.displayInfo();
        insurance1.setInsuranceCost(300.69);
        insurance1.displayInfo();

        Insurance insurance2 = new Health(100);
        insurance2.displayInfo();
        insurance2.setInsuranceCost(150.35);
        insurance2.displayInfo();


        userInterface();
    }

    public static void userInterface(){

        boolean keepGoing=true;
        int insuranceType;
        double monthlyFee;
        Scanner input = new Scanner(System.in);
        ArrayList<Insurance> insurances = new ArrayList<>();

        System.out.println("-------------Exercise1: Insurances-----------------");
        System.out.println("Create a list of insurances");
        while (keepGoing){
            System.out.println("Select the insurance type: \nHealth Insurance (1)\n Life Insurance (2)");
            insuranceType = input.nextInt();

            if(insuranceType==1) insurances.add(new Health(askMonthlyCost()));
            else if (insuranceType==2)insurances.add(new Life(askMonthlyCost()));
            else{
                System.out.println("Invalid Input!, try again");
                continue;
            }

            System.out.println("To keep creating insurances press (y) otherwise press any key");
            if(input.next().equals("y")==false) keepGoing= false;

        }

        System.out.println("This are the insurances you created");
        displayList(insurances);

        System.out.println("------------------ setting new monthly fee--------------------");
        int index=1;
        for (Insurance insurance: insurances){
            System.out.println("Set new monthly fee for insurance "+index++);
            insurance.setInsuranceCost(askMonthlyCost());
        }

        System.out.println("This are the insurances with the new monthly fees");
        displayList(insurances);



    }

    public static double askMonthlyCost(){
        Scanner input = new Scanner(System.in);
        double monthlyFee=0;

            System.out.println("Enter the monthly fee");
            try {
                monthlyFee  = input.nextDouble();
            }

            catch (Exception e){
                System.out.println("Invalid input! try again.");
                monthlyFee = askMonthlyCost();
            }
        return monthlyFee;

    }

    public static void displayList(List<Insurance> insurances){
        int index=1;
        for (Insurance insurance:insurances){
            System.out.print((index++)+" | ");
            insurance.displayInfo();
        }
    }
}
