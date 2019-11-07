package Numbers;

import org.junit.Assert;
import org.junit.Test;

public class DigitTest {

    @Test
    public void zero(){
        Digit digit = Digit.Zero();

        Assert.assertEquals("0", digit.toString());
    }

    @Test
    public void next(){
        Digit digit = Digit.Zero().next();

        Assert.assertEquals("1", digit.toString());

        for(int i = 0; i < 10; i++){
            digit = digit.next();
        }

        Assert.assertEquals("11", digit.toString());
    }

    @Test
    public void previous(){
        Digit digit = Digit.Zero().previous();

        Assert.assertEquals("0", digit.toString());

        for(int i = 0; i < 10; i++){
            digit = digit.next();
        }

        Assert.assertEquals("10", digit.toString());

        for(int i = 0; i < 5; i++){
            digit = digit.previous();
        }

        Assert.assertEquals("5", digit.toString());
    }

    @Test
    public void isZero(){
        Digit digit = Digit.Zero();

        Assert.assertTrue(digit.isZero());

        for(int i = 0; i < 10; i++){
            digit = digit.next();
        }

        Assert.assertFalse(digit.isZero());

        for(int i = 0; i < 5; i++){
            digit = digit.previous();
        }

        Assert.assertFalse(digit.isZero());

        for(int i = 0; i < 5; i++){
            digit = digit.previous();
        }

        Assert.assertTrue(digit.isZero());

        for(int i = 0; i < 5; i++){
            digit = digit.previous();
        }

        Assert.assertTrue(digit.isZero());
    }

}
