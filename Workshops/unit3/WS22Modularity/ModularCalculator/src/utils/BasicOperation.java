/** Copyright ESPE-DECC
 */
package utils;

/**
 *
 * @author Dennis Alquinga
 */
public class BasicOperation {

    // addition, subtraction, division, multiplication
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtrahend) {
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
        
    } 

    public static float divideTwoNumbers(float dividend, float divisor) {
        float division = 0;
        division = dividend /divisor;
        return division;
        
    }

    public static float multiplyTwoNumbers(float multiplying, float multiplier) {
        float multiplication = 0;
        multiplication = multiplying * multiplier;
        return multiplication;
    }
}


