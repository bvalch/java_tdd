import Management.Director;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Big Man", 10000, 0000, 50000.00);

    }

    @Test
    public void canRaiseSalary() {
        director.increaseSalary(100.00);
        assertEquals(10100,director.getSalary(),0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(100,director.payBonus(1.01),0.0);

    }

    @Test
    public void canGetBudget() {
        assertEquals(50000,director.getBudget(),0.0);

    }

    @Test
    public void canSetBudget() {
        director.setBudget(4);
        assertEquals(4,director.getBudget(),0.0);

    }


}
