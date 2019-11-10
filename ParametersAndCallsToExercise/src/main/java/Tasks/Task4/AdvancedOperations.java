package Tasks.Task4;

import Numbers.Digit;
import Tasks.Task2.ExtendedOperations;

/**
 * Advanced operations for digits.
 * Remembers number when instance of this class created and is working with.
 * usage:
 *  Numbers n = new Numbers();
 *  Digit fifteen = new AdvancedOperations(n.one).plus(n.two).multiply(n.five).getResult();
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
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Adds given digit into remembered one (does not destruct original one)
     * @param digit to be added
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations plus(Digit digit){
        //TODO add given digit to remembered one
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Subtract remembered digit and given one (does not destruct original one)
     * @param digit to be subtracted
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations minus(Digit digit){
        //TODO subtract remembered digit and given one
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Multiply remembered digit and given one (does not destruct original one)
     * @param digit to be multiplied with
     * @return this, same object that can be used with other operations
     */
    public AdvancedOperations multiply(Digit digit){
        //TODO subtract remembered digit and given one
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Gives result of operations applied
     * @return result of operations applied
     */
    public Digit getResult(){
        return this.digit;
    }
}
