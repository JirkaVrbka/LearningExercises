package Tasks.UltimateGoal;

import Numbers.Digit;

/**
 * Object that holds sign and Digit
 */
public class SignedDigit {
    private boolean isPositive;
    private Digit digit;

    public SignedDigit(Digit digit){
        this.digit = digit;
        this.isPositive = true;
    }

    public SignedDigit(boolean isPositive, Digit digit){
        this.digit = digit;
        this.isPositive = isPositive;
    }

    public Digit getDigit(){
        return digit;
    }

    public boolean isPositive(){
        return isPositive;
    }
}
