import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("John Smith", 20202020, 100000);
    }

    @Test
    public void canRaiseSalary() {databaseAdmin.raiseSalary(10000.00);
        assertEquals(110000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, databaseAdmin.payBonus(databaseAdmin.getSalary()));
    }
}
