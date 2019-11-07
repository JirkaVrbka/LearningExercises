package Tasks.Task2;

import Numbers.Digit;

import Tasks.Task1.Numbers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtendedOperationsTest {

    @Test
    public void plusZero() {
        Numbers numbers = new Numbers();

        Assert.assertEquals("0", ExtendedOperations.plus(numbers.zero(), numbers.zero()).toString());
        Assert.assertEquals("1", ExtendedOperations.plus(numbers.one(), numbers.zero()).toString());
        Assert.assertEquals("1", ExtendedOperations.plus(numbers.zero(), numbers.one()).toString());
        Assert.assertEquals("5", ExtendedOperations.plus(numbers.five(), numbers.zero()).toString());
        Assert.assertEquals("9", ExtendedOperations.plus(numbers.zero(), numbers.nine()).toString());
    }

    @Test
    public void plusTwoNonZeroNumbers() {
        Numbers numbers = new Numbers();

        Assert.assertEquals("2", ExtendedOperations.plus(numbers.one(), numbers.one()).toString());
        Assert.assertEquals("10", ExtendedOperations.plus(numbers.five(), numbers.five()).toString());
        Assert.assertEquals("17", ExtendedOperations.plus(numbers.nine(), numbers.eight()).toString());
    }

    @Test
    public void plusNonDestructive() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();
        Digit six = numbers.six();

        Assert.assertEquals("11", ExtendedOperations.plus(five, six).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("6", six.toString());
    }

    @Test
    public void minusZero() {
        Numbers numbers = new Numbers();

        Assert.assertEquals("0", ExtendedOperations.minus(numbers.zero(), numbers.zero()).toString());
        Assert.assertEquals("1", ExtendedOperations.minus(numbers.one(), numbers.zero()).toString());
        Assert.assertEquals("0", ExtendedOperations.minus(numbers.zero(), numbers.one()).toString());
        Assert.assertEquals("5", ExtendedOperations.minus(numbers.five(), numbers.zero()).toString());
        Assert.assertEquals("0", ExtendedOperations.minus(numbers.zero(), numbers.nine()).toString());
    }

    @Test
    public void minusTwoNonZeroNumbers() {
        Numbers numbers = new Numbers();

        Assert.assertEquals("0", ExtendedOperations.minus(numbers.one(), numbers.one()).toString());
        Assert.assertEquals("0", ExtendedOperations.minus(numbers.five(), numbers.six()).toString());
        Assert.assertEquals("1", ExtendedOperations.minus(numbers.nine(), numbers.eight()).toString());
    }

    @Test
    public void minusNonDestructive() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();
        Digit six = numbers.six();

        Assert.assertEquals("1", ExtendedOperations.minus(six, five).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("6", six.toString());
    }

    @Test
    public void plusPlus() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();

        Assert.assertEquals("6", ExtendedOperations.plusPlus(five).toString());
        Assert.assertEquals("5", five.toString());
    }

    @Test
    public void minusMinus() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();

        Assert.assertEquals("4", ExtendedOperations.minusMinus(five).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("0", ExtendedOperations.minusMinus(numbers.zero()).toString());
    }

    @Test
    public void doubleValue() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();

        Assert.assertEquals("10", ExtendedOperations.doubleValue(five).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("0", ExtendedOperations.doubleValue(numbers.zero()).toString());
    }

    @Test
    public void multiply() {
        Numbers numbers = new Numbers();
        Digit five = numbers.five();
        Digit seven = numbers.seven();

        Assert.assertEquals("35", ExtendedOperations.multiply(five, seven).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("7", seven.toString());
        Assert.assertEquals("35", ExtendedOperations.multiply(seven, five).toString());
        Assert.assertEquals("5", five.toString());
        Assert.assertEquals("7", seven.toString());
        Assert.assertEquals("0", ExtendedOperations.multiply(seven, numbers.zero()).toString());
        Assert.assertEquals("0", ExtendedOperations.multiply(numbers.zero(), seven).toString());
    }
}