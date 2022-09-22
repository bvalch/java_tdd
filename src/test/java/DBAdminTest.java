import Staff.DBAdmin;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {
    Employee DBAdmin;

    @Before
    public void before() {
        DBAdmin = new DBAdmin("Jolly", 40, 1111);

    }
    @Test
    public void hasName(){
        assertEquals("Jolly", DBAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(40, DBAdmin.getSalary(),0.0);
    }

    @Test
    public void hasNI_num(){
        assertEquals(1111, DBAdmin.getNI_num());

    }
}
