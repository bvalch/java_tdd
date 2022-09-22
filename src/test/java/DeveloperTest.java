import Staff.Developer;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee developer;

    @Before
    public void before(){
    developer = new Developer("Jane",50,2222);
    }

    @Test
    public void hasName(){
    assertEquals("Jane",developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(50,developer.getSalary(),0.0);
    }

    @Test
    public void hasNI_num(){
        assertEquals(2222,developer.getNI_num());

    }

}


