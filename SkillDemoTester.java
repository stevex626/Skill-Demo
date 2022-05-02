import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTester {
    @Test
    public void test(){
        assertEquals("odd", SkillDemo.oddOrEven(1, 4)); // failing test
    }
}
