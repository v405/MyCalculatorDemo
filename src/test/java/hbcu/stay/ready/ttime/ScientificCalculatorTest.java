package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;


public class ScientificCalculatorTest  {
    @Test
    public void sineTest(){
        ScientificCalculator calculator = new ScientificCalculator(10.0);
        double actual = calculator.sine();
        double expected = -0.5440211108893698;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cosineTest(){
        ScientificCalculator calculator = new ScientificCalculator(10.0);
        double actual = calculator.cosine();
        double expected = -0.8390715290764524;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void tangentTest(){
        ScientificCalculator calculator = new ScientificCalculator(10.0);
        double actual = calculator.tan();
        double expected = 0.6483608274590866;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseSineTest(){
        ScientificCalculator calculator = new ScientificCalculator(1);
        double actual = calculator.inverseSine();
        double expected = 1.5707963267948966;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseCosineTest(){
        ScientificCalculator calculator = new ScientificCalculator(1);
        double actual = calculator.inverseCosine();
        double expected = 0;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseTangentTest(){
        ScientificCalculator calculator = new ScientificCalculator(1);
        double actual = calculator.inverseTangent();
        double expected = 0.7853981633974483;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest(){
        ScientificCalculator calculator = new ScientificCalculator(5);
        double actual = calculator.factorial();
        double expected = 120;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void addMemoryTest(){
        ScientificCalculator calculator = new ScientificCalculator(5);
        double actual = calculator.addToMemory(50);
        double expected = 55;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void resetMemoryTest(){
        ScientificCalculator calculator = new ScientificCalculator(5);
        double actual = calculator.resetMemory();
        double expected = 0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void logTest(){
        ScientificCalculator calculator = new ScientificCalculator(5);
        double actual = calculator.log();
        double expected = 0.6989700043360189;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseLogTest(){
        ScientificCalculator calculator = new ScientificCalculator(5);
        double actual = calculator.inverseLog();
        double expected = 148.4131591025766;

        Assert.assertEquals(expected, actual, 0);

    }
}
