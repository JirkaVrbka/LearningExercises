package Tasks.Task3;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import Tasks.Task2.ExtendedOperations;

public class ExtendedNumbers {

    public Digit one(){
        //TODO
        return new Numbers().one();
    }

    public Digit ten(){
        //TODO
        return ExtendedOperations.plus(new Numbers().one(), new Numbers().nine());
    }

    public Digit hundred(){
        //TODO
        return ExtendedOperations.multiply(ten(), ten());
    }

    public Digit thousand(){
        //TODO
        return ExtendedOperations.multiply(hundred(), ten());
    }
}
