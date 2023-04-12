import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John Smith", 20202020, 100000, "HR");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000.00);
        assertEquals(110000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, manager.payBonus(manager.getSalary()));
    }
}
