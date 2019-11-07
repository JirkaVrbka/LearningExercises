package Tasks.Task4;

import Numbers.Digit;
import Tasks.Task2.ExtendedOperations;

/**
 * Advanced operations for digits
 * Remembers number that is working with.
 */
public class AdvancedOperations {
    private Digit digit;

    /**
     * Creates new object of AdvancedOperations (does not destruct original one)
     * Does Remember copy of given digit
     * @param digit Digit to remember copy of
     */
    public AdvancedOperations(Digit digit){
        //TODO remember copy of digit
        this.digit = digit.copy();
    }

    /**
     * Adds given digit into remembered one (does not destruct original one)
     * @param digit to be added
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations plus(Digit digit){
        //TODO add given digit to remembered one
        this.digit = ExtendedOperations.plus(this.digit, digit);
        return this;
    }

    /**
     * Subtract remembered digit and given one (does not destruct original one)
     * @param digit to be subtracted
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations minus(Digit digit){
        //TODO subtract remembered digit and given one
        this.digit = ExtendedOperations.minus(this.digit, digit);
        return this;
    }

    /**
     * Multiply remembered digit and given one (does not destruct original one)
     * @param digit to be multiplied with
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations multiply(Digit digit){
        //TODO subtract remembered digit and given one
        this.digit = ExtendedOperations.multiply(this.digit, digit);
        return this;
    }

    /**
     * Gives result of operations applied
     * @return result of operations applied
     */
    public Digit getResult(){
        return this.digit;
    }
}
