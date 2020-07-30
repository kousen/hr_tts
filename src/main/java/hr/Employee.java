package hr;

public abstract class Employee {
    private int id;
    private String name;

    public Employee() {
        this(99, "Default name");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // override of toString from Object
    public String toString() {
        return "Id = " + id + ", Name = " + name;
    }

    public abstract double computePay();
}
