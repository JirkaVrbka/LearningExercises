package Operations;

import Numbers.Digit;

/**
 * Basic operations using class Digit
 */
public class Operations {

    /**
     * You are unable to create new object of this, you can use static methods without creating new object
     */
    private Operations(){}

    /**
     * Sum of numbers (destructive for given numbers).
     * @param first to be summed
     * @param second to be summed
     * @return first + second
     */
    public static Digit plus(Digit first, Digit second){
        Digit result = Digit.Zero();

        while(!first.isZero()){
            result = result.next();
            first = first.previous();
        }

        while(!second.isZero()){
            result = result.next();
            second = second.previous();
        }

        return result;
    }

    /**
     * subtract of numbers (destructive for given numbers). Lowest value is zero.
     * @param first to be subtracted
     * @param second to be subtracted
     * @return first - second, cannot be lower than zero.
     */
    public static Digit minus(Digit first, Digit second){
        Digit result = Digit.Zero();

        while(!first.isZero()){
            result = result.next();
            first = first.previous();
        }

        while(!second.isZero()){
            result = result.previous();
            second = second.previous();
        }

        return result;
    }


}
