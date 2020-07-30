package hr;

import java.util.ArrayList;
import java.util.List;

public class HR {
    private final List<Employee> employees = new ArrayList<>();

    public void hire(Employee e) {
        if (!employees.contains(e)) {
            employees.add(e);
        }
    }

    public double payEverybody() {
        double total = 0.0;
        for (Employee e : employees) {
            total += e.computePay();
        }
        return total;

        // Functional approach
//        return employees.parallelStream()
//                .mapToDouble(Employee::computePay)
//                .sum();
    }
}
