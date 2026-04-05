public class HourlyEmployee extends Employee{
    private int wage;
    private int hours;

    public HourlyEmployee(String fName,String lName ,int ssn ,int wage,int hours){
        super(fName,lName,ssn);
        setWage(wage);
        setHours(hours);
    }

    public int getWage(){
        return wage;
    }

    public int getHours() {
        return hours;
    }

    public void setWage(int wage){
        if(wage < 0) throw new IllegalArgumentException("Wage cannot be negative!");
        this.wage=wage;
    }

    public void setHours(int hours){
        if(hours < 0 || hours > 168) throw new IllegalArgumentException("Invalid hours: "+hours+".Must be between 0-168.");
        this.hours=hours;
    }


    @Override
    public double earning(){
        if(hours <=40)  return wage * hours;
        else return (40 * wage) + (hours - 40) * (wage * 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + " Wage:" + wage + " Hours: " + hours;
    }
}
