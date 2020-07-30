package hr;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void useEmployee() {
        Employee jeanLuc = new Salaried(1, "Jean-Luc Picard", 52000);
        System.out.println(jeanLuc);
    }
}