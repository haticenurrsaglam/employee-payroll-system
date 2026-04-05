public class CommissionEmployee extends Employee{
    protected double grossSale;
    protected double commissionRate;

    public CommissionEmployee(String fName,String lName ,int ssn,double  commisionRate,double grossSale){
        super(fName,lName,ssn);
        setCommissionRate(commisionRate);
        setGrossSale(grossSale);
    }

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSale(double grossSale){
        if(grossSale < 0) throw new IllegalArgumentException("Gross sale cannot be negative!");
        this.grossSale=grossSale;
    }

    public void setCommissionRate(double rate){
        if (rate < 0 || rate > 1) throw new IllegalArgumentException("Commission rate must be between 0 and 1.");
        this.commissionRate = rate;
    }

    public double earning(){
        return commissionRate*grossSale;
    }

    @Override
    public String toString() {
        return super.toString() + " C.rate:"+commissionRate+" Gross sale:"+grossSale;
    }
}
