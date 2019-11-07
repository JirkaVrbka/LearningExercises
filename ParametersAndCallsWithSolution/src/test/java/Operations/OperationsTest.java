package Operations;

import Numbers.Digit;
import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {

    @Test
    public void plusZero(){
        Digit zero = Digit.Zero();

        Assert.assertEquals("0", Operations.plus(zero, zero).toString());
        Assert.assertEquals("0", Operations.plus(zero, Digit.Zero()).toString());
        Assert.assertEquals("1", Operations.plus(zero, Digit.Zero().next()).toString());
        Assert.assertEquals("1", Operations.plus(Digit.Zero().next(), zero).toString());
    }

    @Test
    public void plusTwoNonZeroNumbers() {
        Assert.assertEquals("2", Operations.plus(Digit.Zero().next(), Digit.Zero().next()).toString());
        Assert.assertEquals("3", Operations.plus(Digit.Zero().next().next(), Digit.Zero().next()).toString());
        Assert.assertEquals("3", Operations.plus(Digit.Zero().next(), Digit.Zero().next().next()).toString());

        Digit one = Digit.Zero().next();
        Assert.assertEquals("2", Operations.plus(one, one).toString());
    }

    @Test
    public void minusZero() {
        Digit zero = Digit.Zero();

        Assert.assertEquals("0", Operations.minus(zero, zero).toString());
        Assert.assertEquals("0", Operations.minus(zero, Digit.Zero().next()).toString());
        Assert.assertEquals("1", Operations.minus(Digit.Zero().next(), zero).toString());
    }

    @Test
    public void minusTwoNonZeroNumbers() {
        Digit zero = Digit.Zero();

        Assert.assertEquals("0", Operations.minus(zero.next(), zero.next()).toString());
        Assert.assertEquals("1", Operations.minus(zero.next().next(), Digit.Zero().next()).toString());
    }
}