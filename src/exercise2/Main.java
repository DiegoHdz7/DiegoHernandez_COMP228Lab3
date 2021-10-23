package exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        userInterface();
    }

    public static void userInterface(){


        ArrayList<GameTester> gameTesters;
        System.out.println("------------Exercise 2: Game Tester----------------");
        System.out.println("Create a list of Game Testers:");
        gameTesters = createGameTesterList();
        displayList(gameTesters);

        for (GameTester tester:gameTesters) {
            if(tester.isFullTimeStatus()==true){
                System.out.println("Enter the number of extra hours worked by "+tester.getTesterName());
                tester.determineSalary(askHours());
            }
        }

        displayList(gameTesters);
    }

    public  static ArrayList<GameTester> createGameTesterList(){
        ArrayList<GameTester> gameTesters = new ArrayList<>();
        boolean toContinue=true;
        Scanner input = new Scanner(System.in);
        while (toContinue){

            String name = askName();
            boolean isFullTime = askGameTesterStatus();
            if(isFullTime){
                gameTesters.add(new FullTimeGameTester(name,isFullTime));
            }
            else {
                gameTesters.add(new PartTimeGameTester(name,isFullTime));
                gameTesters.get(gameTesters.size()-1).determineSalary(askHours());
            }

            System.out.println("Press 1 to continue or any key to exit");

            try {
                int continuing = input.nextInt();
                if(continuing==1) continue;
            }
            catch (Exception e){
                toContinue=false;
            }
        }

        return gameTesters;


    }
    public static  void displayList(ArrayList<GameTester> list){

        System.out.println("List items: " + list.size());
        for(GameTester gameTester : list){
            System.out.println(gameTester);
        }
    }

    public static String askName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce the name of the game tester:");
        String name = input.nextLine();
        return name;
    }

    public static boolean askGameTesterStatus(){
        boolean isFullTime;
        String status;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the status of the GameTester");
        System.out.println("Full-time (F)  | Part-Time (P)");
        status = input.nextLine();

        if(status.equals("f")) isFullTime=true;
        else if(status.equals("p"))isFullTime=false;
        else {
            System.out.println("Invalid input! Try again (F/P).");
            isFullTime= askGameTesterStatus();
        }
        return isFullTime;
    }

    public static double askHours(){
        double hours;
        Scanner input = new Scanner(System.in);
        System.out.println("Set the hours to work by the GameTester");

        try{
            hours = input.nextDouble();
        }
        catch (Exception e){
            System.out.println("Invalid input! Try again.");
            hours = askHours();
        }

        return  hours;
    }
}
