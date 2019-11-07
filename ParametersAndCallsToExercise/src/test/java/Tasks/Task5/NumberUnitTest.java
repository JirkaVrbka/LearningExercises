package Tasks.Task5;

import Tasks.Task4.AdvancedOperations;
import org.junit.Assert;
import org.junit.Test;

public class NumberUnitTest extends UnitTestWithNumbers {

    @Test
    public void ones() {
        Assert.assertEquals("0", new NumberUnit(zero, new AdvancedOperations(zero)).ones().getDigit().toString());
        Assert.assertEquals("1", new NumberUnit(one, new AdvancedOperations(zero)).ones().getDigit().toString());
        Assert.assertEquals("3", new NumberUnit(three, new AdvancedOperations(zero)).ones().getDigit().toString());
    }

    @Test
    public void tens() {
        Assert.assertEquals("0", new NumberUnit(zero, new AdvancedOperations(zero)).tens().getDigit().toString());
        Assert.assertEquals("10", new NumberUnit(one, new AdvancedOperations(zero)).tens().getDigit().toString());
        Assert.assertEquals("40", new NumberUnit(four, new AdvancedOperations(zero)).tens().getDigit().toString());
    }

    @Test
    public void hundreds() {
        Assert.assertEquals("0", new NumberUnit(zero, new AdvancedOperations(zero)).hundreds().getDigit().toString());
        Assert.assertEquals("100", new NumberUnit(one, new AdvancedOperations(zero)).hundreds().getDigit().toString());
        Assert.assertEquals("500", new NumberUnit(five, new AdvancedOperations(zero)).hundreds().getDigit().toString());
    }

    @Test
    public void thousands() {
        Assert.assertEquals("0", new NumberUnit(zero, new AdvancedOperations(zero)).thousands().getDigit().toString());
        Assert.assertEquals("1000", new NumberUnit(one, new AdvancedOperations(zero)).thousands().getDigit().toString());
        Assert.assertEquals("2000", new NumberUnit(two, new AdvancedOperations(zero)).thousands().getDigit().toString());
    }
}