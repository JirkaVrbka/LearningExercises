package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import Tasks.Task4.AdvancedOperations;

/**
 * This class specify amount of units (ones, tens, hundreds, thousands) that will be new number created with
 *
 * Enables additional usage (additional creation) when returning NumberUnit
 */
public class NumberAmount {
    AdvancedOperations operations;

    public NumberAmount(AdvancedOperations operations){
        this.operations = operations;
    }

    /**
     * Specify amount of unit as one
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit one(){
        //TODO
        return new NumberUnit(new Numbers().one(), operations);
    }

    /**
     * Specify amount of unit as two
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit two(){
        //TODO
        return new NumberUnit(new Numbers().two(), operations);
    }

    /**
     * Specify amount of unit as three
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit three(){
        //TODO
        return new NumberUnit(new Numbers().three(), operations);
    }

    /**
     * Specify amount of unit as four
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit four(){
        //TODO
        return new NumberUnit(new Numbers().four(), operations);
    }

    /**
     * Specify amount of unit as five
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit five(){
        //TODO
        return new NumberUnit(new Numbers().five(), operations);
    }

    /**
     * Specify amount of unit as six
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit six(){
        //TODO
        return new NumberUnit(new Numbers().six(), operations);
    }

    /**
     * Specify amount of unit as seven
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit seven(){
        //TODO
        return new NumberUnit(new Numbers().seven(), operations);
    }

    /**
     * Specify amount of unit as eight
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit eight(){
        //TODO
        return new NumberUnit(new Numbers().eight(), operations);
    }

    /**
     * Specify amount of unit as nine
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit nine(){
        //TODO
        return new NumberUnit(new Numbers().nine(), operations);
    }

    /**
     * Gets digit from creation process and returns it
     * @return created digit
     */
    public Digit getDigit(){
        //TODO
        return operations.getResult();
    }



}
