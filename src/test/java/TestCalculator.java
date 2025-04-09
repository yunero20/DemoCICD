import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.calculator;
import java.util.Calendar;

public class TestCalculator {
    @Test
    public void testSum() {
        calculator cal = new calculator();

        Assert.assertEquals(cal.sum(2,3),5);
    }
    @Test
    public void testSub() {
        calculator cal = new calculator();

        Assert.assertEquals(cal.sub(2,3),0);
    }
}
