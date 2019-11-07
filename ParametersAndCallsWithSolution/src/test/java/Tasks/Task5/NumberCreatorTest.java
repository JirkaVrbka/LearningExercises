package Tasks.Task5;

import Numbers.Digit;
import org.junit.Assert;
import org.junit.Test;

public class NumberCreatorTest {

    @Test
    public void create() {
        NumberAmount vol = NumberCreator.create();
        Assert.assertEquals("0", vol.getDigit().toString());
    }

    @Test
    public void createAdd(){
        Digit digit = NumberCreator.create().five().hundreds().eight().tens().nine().ones().getDigit();
        Assert.assertEquals("589", digit.toString());
    }
}