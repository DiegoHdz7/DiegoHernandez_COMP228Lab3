package exercise2;

abstract class GameTester {


    private String testerName;
    private boolean fullTimeStatus;


    public GameTester(String testerName, boolean fullTimeStatus) {
        this.testerName = testerName;
        this.fullTimeStatus = fullTimeStatus;
    }

    public String getTesterName() {
        return testerName;
    }

    public boolean isFullTimeStatus() {
        return fullTimeStatus;
    }

    public abstract void determineSalary(double hours);


}
