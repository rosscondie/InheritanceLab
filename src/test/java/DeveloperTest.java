import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("John Smith", 20202020, 100000);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000.00);
        assertEquals(110000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, developer.payBonus(developer.getSalary()));
    }
}
