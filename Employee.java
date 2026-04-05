public abstract class Employee {
    protected String fName;
    protected String lName;
    protected int ssn;

    public Employee(String fName,String lName , int ssn){
        this.fName=fName;
        this.lName=lName;
        this.ssn=ssn;
    }
    public abstract double earning();

    public void applyRaise(double rate){

    }

    public String getFName() { return fName; }
    public String getLName() { return lName; }
    public int    getSsn()   { return ssn; }

    public String toString(){
        return "First name: "+fName+" Last name: "+lName+" SSN: "+ssn;
    }
}
