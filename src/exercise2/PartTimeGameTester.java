package exercise2;

public class PartTimeGameTester extends GameTester {

    private double totalSalary;
    public PartTimeGameTester(String testerName, boolean fullTimeStatus) {
        super(testerName, fullTimeStatus);
        totalSalary = 20 * 20;
    }

    @Override
    public void determineSalary(double hours) {
        totalSalary = 20 * hours;
    }

    @Override
    public String toString() {
        return "Name: "+getTesterName()+", isFulltime: "+isFullTimeStatus()+", Salary: "+totalSalary+" CAD per week";
    }
}
