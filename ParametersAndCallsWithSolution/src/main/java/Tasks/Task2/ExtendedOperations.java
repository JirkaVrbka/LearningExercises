package Tasks.Task2;

import Numbers.Digit;
import Operations.Operations;
import Tasks.Task1.Numbers;

/**
 * Additional operations for digits.
 * Uses undestructive way to work with digits
 */
public class ExtendedOperations {

    /**
     * You are unable to create new object of this, you can use static methods without creating new object
     */
    private ExtendedOperations(){}

    /**
     * Sum of numbers (undestructive for given numbers).
     * @param first to be summed
     * @param second to be summed
     * @return first + second
     */
    public static Digit plus(Digit first, Digit second){
        //TODO create one line solution
        return Operations.plus(first.copy(), second.copy());
    }

    /**
     * subtract of numbers (undestructive for given numbers). Lowest value is zero.
     * @param first to be subtracted
     * @param second to be subtracted
     * @return first - second, cannot be lower than zero.
     */
    public static Digit minus(Digit first, Digit second){
        //TODO create one line solution
        return Operations.minus(first.copy(), second.copy());
    }

    /**
     * Adds one to current number (undestructive for given number)
     * @param digit to be added
     * @return digit + 1
     */
    public static Digit plusPlus(Digit digit){
        //TODO
        return Operations.plus(digit.copy(), new Numbers().one());
    }

    /**
     * Subtract one to current number (undestructive for given number)
     * @param digit to be subtracted
     * @return digit - 1. If number is representation of zero, return representation of zero
     */
    public static Digit minusMinus(Digit digit){
        //TODO
        return Operations.minus(digit.copy(), new Numbers().one());
    }

    /**
     * Returns double of given digit (undestructive for given number)
     * @param digit to be doubled
     * @return doubled value of given digit
     */
    public static Digit doubleValue(Digit digit){
        //TODO
        return Operations.plus(digit.copy(), digit.copy());
    }

    /**
     * Multiplication of numbers (undestructive for given numbers).
     * @param first to be multiplied
     * @param second to be multiplied with
     * @return first * second
     */
    public static Digit multiply(Digit first, Digit second){
        //TODO multiply digits
        Digit firstCopy = first.copy();
        Digit secondCopy = second.copy();
        Digit result = Digit.Zero();
        while(!firstCopy.isZero()){
            firstCopy = firstCopy.previous();
            result = plus(result, secondCopy);
        }

        return result;
    }

}
