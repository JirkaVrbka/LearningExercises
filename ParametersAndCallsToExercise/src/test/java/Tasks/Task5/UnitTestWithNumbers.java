package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import org.junit.Before;

public class UnitTestWithNumbers {

    public Digit zero;
    public Digit one;
    public Digit two;
    public Digit three;
    public Digit four;
    public Digit five;
    public Digit six;
    public Digit seven;
    public Digit eight;
    public Digit nine;

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
}
