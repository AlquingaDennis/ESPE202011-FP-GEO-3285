/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("⭐⭐⭐=============================================");
        System.out.println(" HELLO my name is Dennis Alquinga");
        System.out.println("=============================================⭐⭐⭐");
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;
        float quotient;
        int number1 = 0;
        int number2 = 0;
        int top = 12;
        int product = 0;
        int table = 0;

        //call to divideTwoNumbers() function
        System.out.println("Write the number of dividend-->");
        dividend = input.nextInt();
        System.out.println("Write the number of divisor-->");
        divisor = input.nextInt();
        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println(" Quotient of " + dividend + " and " + divisor + " is -> " + quotient); //0.5 or ?

        System.out.println("☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾");
        System.out.println("Write the number of number1 -->");
        number1 = input.nextInt();
        number2 = f(number1);
        System.out.println("number2 value: " + number1 + " ^2-->" + number2);

        System.out.println("Write the number of number1 -->");
        number1 = input.nextInt();
        number2 = f(number1);
        System.out.println("number2 value: " + number1 + " ^2-->" + number2);

        System.out.println("Write the number of number1 -->");
        number1 = input.nextInt();
        number2 = f(number1);
        System.out.println("the square of -> " + number1 + " <- is equal to -> " + number2);

        System.out.println("☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽☽");
        System.out.println("Write the number of number1 -->");
        number1 = input.nextInt();
        number2 = g(number1);
        System.out.println("number2 value: number2 = " + number1 + " * " + number1 + " + 2 * " + number1 + " + 1--> number2 = " + number2);

        System.out.println("☪☪☪☪☪☪☪☪☪☪☪☪☪☪☪☪☪☪");
        System.out.println("Write the number of table-->");
        table = input.nextInt();
        
        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println(+table + " * " + j + " = " + product);
        }
        System.out.println("🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞");
        System.out.println("[SEE YOU LATER]");
        System.out.println("🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞");
    }

    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int number1) {

        int number2 = 0;
        number2 = number1 * number1;

        return number2;
    }

    public static int g(int number1) {

        int number2 = 0;
        number2 = number1 * number1 + 2 * number1 + 1;

        return number2;
    }

    public static int tablemulriplication() {
        System.out.println("============================");
        System.out.println("The multiplication tables: ");

        int top = 0;
        int product = 0;
        int table = 0;

        for (int i = 1; i <= top; i++) {
            product = table * i;
            System.out.println(+table + " * " + i + " = " + product);

        }
        return +product;
    }
}
