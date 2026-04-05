import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1,Employee emp2){
        return Double.compare(emp2.earning(),emp1.earning());
    }
}
