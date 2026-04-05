public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String fName,String lName ,int ssn,double  commissionRate,double grossSale,double baseSalary){
        super(fName,lName,ssn,commissionRate,grossSale);
        this.baseSalary=baseSalary;

    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative!");
        this.baseSalary=baseSalary;
    }

    @Override
    public void applyRaise(double rate) {
        this.baseSalary = this.baseSalary * (1 + rate);
    }

    public double earning() {
        return super.earning() + this.baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+" Base salary:"+ baseSalary;
    }
}
