package Tasks.Task5;

import Tasks.Task4.AdvancedOperations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberAmountTest extends UnitTestWithNumbers {
    private NumberAmount volume;

    @Before
    public void initNumberVolume(){
        volume = new NumberAmount(new AdvancedOperations(zero));
    }

    @Test
    public void nothing(){
        Assert.assertEquals("0", volume.getDigit().toString());
    }

    @Test
    public void one() {
        Assert.assertEquals("1", volume.one().ones().getDigit().toString());
        Assert.assertEquals("11", volume.one().tens().getDigit().toString());
        Assert.assertEquals("111", volume.one().hundreds().getDigit().toString());
        Assert.assertEquals("1111", volume.one().thousands().getDigit().toString());
    }

    @Test
    public void two() {
        Assert.assertEquals("2", volume.two().ones().getDigit().toString());
        Assert.assertEquals("22", volume.two().tens().getDigit().toString());
        Assert.assertEquals("222", volume.two().hundreds().getDigit().toString());
        Assert.assertEquals("2222", volume.two().thousands().getDigit().toString());
    }

    @Test
    public void three() {
        Assert.assertEquals("3", volume.three().ones().getDigit().toString());
        Assert.assertEquals("33", volume.three().tens().getDigit().toString());
        Assert.assertEquals("333", volume.three().hundreds().getDigit().toString());
        Assert.assertEquals("3333", volume.three().thousands().getDigit().toString());
    }

    @Test
    public void four() {
        Assert.assertEquals("4", volume.four().ones().getDigit().toString());
        Assert.assertEquals("44", volume.four().tens().getDigit().toString());
        Assert.assertEquals("444", volume.four().hundreds().getDigit().toString());
        Assert.assertEquals("4444", volume.four().thousands().getDigit().toString());
    }

    @Test
    public void five() {
        Assert.assertEquals("5", volume.five().ones().getDigit().toString());
        Assert.assertEquals("55", volume.five().tens().getDigit().toString());
        Assert.assertEquals("555", volume.five().hundreds().getDigit().toString());
        Assert.assertEquals("5555", volume.five().thousands().getDigit().toString());
    }

    @Test
    public void six() {
        Assert.assertEquals("6", volume.six().ones().getDigit().toString());
        Assert.assertEquals("66", volume.six().tens().getDigit().toString());
        Assert.assertEquals("666", volume.six().hundreds().getDigit().toString());
        Assert.assertEquals("6666", volume.six().thousands().getDigit().toString());
    }

    @Test
    public void seven() {
        Assert.assertEquals("7", volume.seven().ones().getDigit().toString());
        Assert.assertEquals("77", volume.seven().tens().getDigit().toString());
        Assert.assertEquals("777", volume.seven().hundreds().getDigit().toString());
        Assert.assertEquals("7777", volume.seven().thousands().getDigit().toString());
    }

    @Test
    public void eight() {
        Assert.assertEquals("8", volume.eight().ones().getDigit().toString());
        Assert.assertEquals("88", volume.eight().tens().getDigit().toString());
        Assert.assertEquals("888", volume.eight().hundreds().getDigit().toString());
        Assert.assertEquals("8888", volume.eight().thousands().getDigit().toString());
    }

    @Test
    public void nine() {
        Assert.assertEquals("9", volume.nine().ones().getDigit().toString());
        Assert.assertEquals("99", volume.nine().tens().getDigit().toString());
        Assert.assertEquals("999", volume.nine().hundreds().getDigit().toString());
        Assert.assertEquals("9999", volume.nine().thousands().getDigit().toString());
    }
}