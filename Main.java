import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> staffList = new ArrayList<>();

        staffList.add(new SalariedEmployee("Ali", "Yilmaz", 111, 1000));

        staffList.add(new HourlyEmployee("Ayse", "Demir", 222, 50, 45));

        staffList.add(new CommissionEmployee("Fatma", "Kaya", 333, 0.10, 50000));

        staffList.add(new BasePlusCommissionEmployee("Mehmet", "Can", 444, 0.10, 50000, 3000));

        Comparator<Employee> salaryComp = new SalaryComparator();
        Collections.sort(staffList, salaryComp);


        System.out.println("------ COMPANY SALARY LIST (Sorted) ------");

        for (Employee e : staffList) {
            System.out.println(e.toString());

            double oldEarning = e.earning();
            e.applyRaise(0.10);

            if (oldEarning != e.earning()) {
                System.out.println(">>> CONGRATULATIONS! A 10% raise has been applied.");
                System.out.printf(">>> Old: %.2f TL -> New: %.2f TL%n", oldEarning, e.earning());
            } else {
                System.out.printf("Total Earnings : %.2f TL%n", e.earning());
            }

            System.out.println("------------------------------");
        }

    }
}