package Tasks.Task4;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedOperationsTest {


    private Digit zero;
    private Digit one;
    private Digit two;
    private Digit three;
    private Digit four;
    private Digit five;
    private Digit six;
    private Digit seven;
    private Digit eight;
    private Digit nine;

    @Before
    public void before(){
        Numbers numbers = new Numbers();
        zero = numbers.zero();
        one = numbers.one();
        two = numbers.two();
        three = numbers.three();
        four = numbers.four();
        five = numbers.five();
        six = numbers.six();
        seven = numbers.seven();
        eight = numbers.eight();
        nine = numbers.nine();
    }

    @Test
    public void constructor(){
        AdvancedOperations operations = new AdvancedOperations(five);

        Assert.assertEquals("5", five.toString());
        assertNotSame(five, operations.getResult());
    }

    @Test
    public void plus() {
        AdvancedOperations operations = new AdvancedOperations(five);

        operations.plus(zero);
        Assert.assertEquals("5", operations.getResult().toString());

        operations.plus(three);
        Assert.assertEquals("8", operations.getResult().toString());
    }

    @Test
    public void minus() {
        AdvancedOperations operations = new AdvancedOperations(five);

        operations.minus(zero);
        Assert.assertEquals("5", operations.getResult().toString());

        operations.minus(two);
        Assert.assertEquals("3", operations.getResult().toString());

        operations.minus(eight);
        Assert.assertEquals("0", operations.getResult().toString());
    }

    @Test
    public void multiply() {
        AdvancedOperations operations = new AdvancedOperations(five);

        operations.multiply(three);
        Assert.assertEquals("15", operations.getResult().toString());

        operations.multiply(one);
        Assert.assertEquals("15", operations.getResult().toString());

        operations.multiply(zero);
        Assert.assertEquals("0", operations.getResult().toString());
    }

}