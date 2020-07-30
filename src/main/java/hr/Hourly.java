package hr;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(int id, String name) {
        this(id, name, 180.0, 40.0);
    }

    public Hourly(int id, String name, double rate, double hours) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double computePay() {
        System.out.println(getName() + " makes " + rate*hours*2);
        return rate * hours * 2;
    }
}
