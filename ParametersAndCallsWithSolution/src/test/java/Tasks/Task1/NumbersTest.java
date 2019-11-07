package Tasks.Task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void zero() {
        Assert.assertEquals("0", new Numbers().zero().toString());
    }

    @Test
    public void one() {
        Assert.assertEquals("1", new Numbers().one().toString());
    }

    @Test
    public void two() {
        Assert.assertEquals("2", new Numbers().two().toString());
    }

    @Test
    public void three() {
        Assert.assertEquals("3", new Numbers().three().toString());
    }

    @Test
    public void four() {
        Assert.assertEquals("4", new Numbers().four().toString());
    }

    @Test
    public void five() {
        Assert.assertEquals("5", new Numbers().five().toString());
    }

    @Test
    public void six() {
        Assert.assertEquals("6", new Numbers().six().toString());
    }

    @Test
    public void seven() {
        Assert.assertEquals("7", new Numbers().seven().toString());
    }

    @Test
    public void eight() {
        Assert.assertEquals("8", new Numbers().eight().toString());
    }

    @Test
    public void nine() {
        Assert.assertEquals("9", new Numbers().nine().toString());
    }
}