/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Asus
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int diference;
        int multiplier;
        int multiplying;
        int product;
        int dividing;
        int divider; 
        int quotient;
        int dividingg;
        int dividierr; 
        int module;
        
        
        minuend = -23;
        subtrahend = -6; 
        
        multiplier = 8;
        multiplying = 12;
        
        dividing = 45;
        divider = 9;
        
        dividingg = 16;
        dividierr = 2;
        
        //-23 - (-6)= -23 + 6 = -17
        //8*12=96
        //45/9=5
        //initilization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + " + " + addend2 +
                " is equall to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + ((++sum)));
        
        System.out.println("The subtraction of " + minuend + " - " + subtrahend +  " is equal to " + (minuend - subtrahend));
        
        System.out.println("The multiplicacion of  " + multiplying + " * " + multiplier + " is equal to --> " + (multiplying * multiplier));
        
        System.err.println("The division of  " + dividing + " / " + divider+ " is equal to --> " + (dividing / divider));
        
        System.err.println("The module of  " + dividingg+ " % " + dividierr+ " is equal to --> " + (dividingg % dividierr));   
    } 
}
