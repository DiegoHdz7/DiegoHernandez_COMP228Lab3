package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessMortgage implements MortgageConstants{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Mortgage> mortgages = new ArrayList<>();
        int mortgageType;
        double mortgageAmount;
        int term;
        String name;
        double currentPrimeRate;

        System.out.println("--------------------Exercise 3: Mortgages------------------");
        System.out.println("This is the "+Mortgage.BANK_NAME+", Create 3 Mortgages");
        System.out.println("Select the current prime rate (%)");
        currentPrimeRate= input.nextDouble();

        Mortgage.setCurrentPrimeRate(currentPrimeRate/100);

        for(int i=1; i<4;i++){
            System.out.println("Enter the data for the mortgage "+i);
            System.out.println("Select the mortgage type: business(1)/ personal(any other number)");
            mortgageType = input.nextInt();

            System.out.println("Enter the customer name");
            name = input.next();


            System.out.println("Enter the amount of mortgage (no more than "+MAXIMUM_MORTGAGE_AMOUNT+")");
            mortgageAmount = input.nextDouble();


            System.out.println("Enter the term(1,3,5 years)");
            term = input.nextInt();


            if(mortgageType==1) mortgages.add(new BusinessMortgage(name,mortgageAmount,term));
            else mortgages.add(new PersonalMortgage(name,mortgageAmount,term));
        }

        for (Mortgage mortgage: mortgages) {
            mortgage.getMortgageInfo();
        }


    }
}
