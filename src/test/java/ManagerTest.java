import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Joe", 100, 1234, "BigDept");
    }

    @Test
    public void canRaiseSalary() {
        manager.increaseSalary(100);
        assertEquals(300.00, manager.increaseSalary(100.00), 0.0);
        assertEquals(300, manager.getSalary(), 0.0);

    }

    @Test
    public void canPayBonus() {
        ;
        assertEquals(1, manager.payBonus(1.01), 0.0);

    }
}
