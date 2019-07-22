package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

}
