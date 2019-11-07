package Tasks.Task3;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedNumbersTest {

    @Test
    public void one() {
        Assert.assertEquals("1", new ExtendedNumbers().one().toString());
    }

    @Test
    public void ten() {
        Assert.assertEquals("10", new ExtendedNumbers().ten().toString());
    }

    @Test
    public void hundred() {
        Assert.assertEquals("100", new ExtendedNumbers().hundred().toString());
    }

    @Test
    public void thousand() {
        Assert.assertEquals("1000", new ExtendedNumbers().thousand().toString());
    }
}