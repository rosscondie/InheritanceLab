import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("John Smith", 20202020, 100000, "HR", 1000000.00 );
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(110000, director.getSalary());
    }

    @Test
    public void raiseSalaryCanNotReturnNegative() {
        director.raiseSalary(-2000.00);
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000, director.payBonus(director.getSalary()));
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.0);
    }

    @Test
    public void canChangeName(){
        director.changeName("Jim");
        assertEquals("Jim", director.getName());
    }

    @Test
    public void canNotChangeNameToNull() {
        director.changeName(null);
        assertEquals("John Smith", director.getName());

    }



}
