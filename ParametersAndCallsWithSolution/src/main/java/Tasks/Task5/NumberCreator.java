package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task4.AdvancedOperations;

/**
 * Starting point for number creation
 */
public class NumberCreator {

    /**
     * Creates NumberVolume that can be used for number creation
     * @return new NumberVolume with zero
     */
    public static NumberAmount create(){
        //TODO
        return new NumberAmount(new AdvancedOperations(Digit.Zero()));
    }

}
