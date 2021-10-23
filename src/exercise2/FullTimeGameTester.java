package exercise2;

public class FullTimeGameTester extends GameTester {
    private final double  BASE_SALARY = 3000;
    private double salary;

    public FullTimeGameTester(String testerName, boolean fullTimeStatus) {
        super(testerName, fullTimeStatus);
        salary = BASE_SALARY;
    }

    @Override
    public void determineSalary(double hours) {
        // in this case hours would be used as extra hours
        salary = BASE_SALARY + (BASE_SALARY/40*0.5)*hours;
    }

    @Override
    public String toString() {
        return "Name: "+getTesterName()+", isFulltime: "+isFullTimeStatus()+", Salary: "+salary+" CAD base salary + extra hours";
    }
}
