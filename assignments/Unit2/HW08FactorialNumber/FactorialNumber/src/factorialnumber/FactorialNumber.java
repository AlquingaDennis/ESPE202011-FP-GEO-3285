/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FactorialNumber {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int factorial = 1;
        int stop=15;
        int i;
        
        if (factorial >=0 && factorial <=15) {
            System.out.println("Factorial number less than 0 cannot be printed");
            System.out.println("Factorial number greater than 15 cannot be printed ");
            System.out.println("Enter the factorial number you want to know");
        }
        
        factorial=1;
        
        do{
            System.out.print("ENTER NUMBER ");
            
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            for (i = number; i > 1; i--) {
              factorial = factorial * i;
             
        }

        System.out.println("the factorial of the number" + number + " is "  +factorial);

        } while (number != 0);
        
        System.out.println("Good Bye");
    }
    
}