package hr;

import java.text.NumberFormat;
import java.util.Locale;

public class Salaried extends Employee {
    private double salary = 52000;

    public Salaried() {
        super();
    }

    public Salaried(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double computePay() {
        // Factory method --> instantiate something using a method
        NumberFormat nf = NumberFormat.getCurrencyInstance(
                new Locale("hin", "IN"));

        System.out.println(getName() + " makes " + nf.format(salary/26));
        return salary / 26;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary = " + salary;
    }
}
