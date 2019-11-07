package Tasks.Task1;

import Numbers.Digit;

public class Numbers {

    public Digit zero(){
        return Digit.Zero();
    }
    /**
     * Creates number 1
     * @return Digit
     */
    public Digit one(){
        //TODO create number two using method "Zero" (you are not allowed to use Digit.Zero())
        return zero().next();

        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * Creates number 2
     * @return Digit
     */
    public Digit two(){

        //TODO create number two using method "One" (you are not allowed to use Digit.Zero())

        return one().next();
    }

    /**
     * Creates number 3
     * @return Digit
     */
    public Digit three(){

        //TODO

        return two().next();
    }

    /**
     * Creates number 4
     * @return Digit
     */
    public Digit four(){

        //TODO

        return three().next();
    }

    /**
     * Creates number 5
     * @return Digit
     */
    public Digit five(){

        //TODO

        return four().next();
    }

    /**
     * Creates number 6
     * @return Digit
     */
    public Digit six(){

        //TODO

        return five().next();
    }

    /**
     * Creates number 7
     * @return Digit
     */
    public Digit seven(){

        //TODO

        return six().next();
    }

    /**
     * Creates number 8
     * @return Digit
     */
    public Digit eight(){

        //TODO

        return seven().next();
    }

    /**
     * Creates number 9
     * @return Digit
     */
    public Digit nine(){

        //TODO

        return eight().next();
    }
}
