public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee(String fName,String lName , int ssn,int weeklySalary){
        super(fName,lName,ssn);
        this.weeklySalary=weeklySalary;
    }

    public int getWeeklySalary()          { return weeklySalary; }
    public void setWeeklySalary(int salary) { this.weeklySalary = salary; }

    @Override
    public void applyRaise(double rate) {
        this.weeklySalary = (int) (this.weeklySalary * (1 + rate));
    }

    @Override
    public double earning() {
        return weeklySalary;
    }

    @Override
    public String toString(){
        return super.toString() + " Weekly Salary: "+weeklySalary;
    }
}
