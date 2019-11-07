package Numbers;

import java.util.Objects;

/**
 * Representation of number
 */
public class Digit {
    private Digit digit;

    /**
     * Private constructor that does not allow to create Digit out of this class
     * @param digit representation of number, null if representation should be zero
     */
    private Digit(Digit digit){
        this.digit = digit;
    }

    /**
     * Return representation of next number (e.g. if there was representation of number 1, now it will represent number 2)
     * @return Digit representing next number in line
     */
    public Digit next(){
        return new Digit(this);
    }

    /**
     * Return representation of previous number (e.g. if there was representation of number 2, now it will represent number 1)
     * It cannot go under zero (e.g. if called on representation of zero, new representation will be zero as well)
     * @return Digit representing previous number in line
     */
    public Digit previous(){
        if(digit == null){
            return this;
        }else {
            return digit;
        }
    }

    /**
     * Check if representation represents number zero
     * @return true if represents number zero
     */
    public boolean isZero(){
        return digit == null;
    }

    /**
     * Creates copy of current number representation (original value stays the same)
     * @return new Digit representing number value of original Digit
     */
    public Digit copy(){
        Digit tmp = digit;
        Digit result = Digit.Zero();
        while(tmp != null){
            result = result.next();
            tmp = tmp.digit;
        }

        return result;
    }

    /**
     * Value of representation
     * @return number
     */
    @Override
    public String toString() {
        if(digit == null){
            return "0";
        }else{
            return String.valueOf(Integer.parseInt(digit.toString()) + 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Digit otherDigit = (Digit) o;

        if(this.digit == null && otherDigit.digit == null) {
            return true;
        }

        if(this.digit != null && otherDigit.digit != null){
            return this.digit.equals(otherDigit.digit);
        }

        return false;
    }

    public boolean isBigger(Digit otherDigit){
        if(this.digit == null && otherDigit.digit == null) {
            return false;
        }

        if(this.digit != null && otherDigit.digit != null){
            return this.digit.isBigger(otherDigit.digit);
        }

        if(this.digit != null && otherDigit.digit == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(digit);
    }

    /**
     * Creates new digit that represent number zero
     * @return digit with int value of zero
     */
    public static Digit Zero(){
        return new Digit(null);
    }
}
