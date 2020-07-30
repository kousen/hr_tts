package hr;

import org.junit.jupiter.api.Test;

class HRTest {
    @Test
    void payEverybody() {
        HR hr = new HR();
        hr.hire(new Salaried(1, "Jean-Luc", 104000));
        hr.hire(new Salaried(1, "Will", 52000));
        hr.hire(new Hourly(1, "Wesley", 100.0, 40.0));

        double total = hr.payEverybody();
        System.out.println("Total pay is " + total);
    }
}