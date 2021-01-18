/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("Calculator Areas");
            System.out.println("1. -> Square");
            System.out.println("2. -> Rectangle");
            System.out.println("3. -> Triangle");
            System.out.println("5. -> Exit");
            
            System.out.println("Enter your menu option -->");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    int side1;
                    int side2;
                    int side3;
                    int side4;
                    int area1;
                    System.out.println("enter sude1 -> ");
                    side1 = input.nextInt();
                    System.out.println("enter side2 -> ");
                    side2 = input.nextInt();
                    System.out.println("enter sude3 -> ");
                    side3 = input.nextInt();
                    System.out.println("enter side4 -> ");
                    side4 = input.nextInt();
                    area1 = side1 + side2 + side3 + side4;
                    System.out.println(" the sum is --> " + area1 );
                    break;
                case 2:   
                    int length2;
                    int width;
                    int area2;
                    System.out.println("enter length--");
                    length2 = input.nextInt();
                    System.out.println("enter width--");
                    width = input.nextInt();
                    area2 = (length2*width);
                    System.out.println("The area of rectangle is-->" + area2 );
                    break;
                case 3:   
                    int heigth3;
                    int base;
                    int area3;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height -> ");
                    heigth3 = input.nextInt();
                    area3= base + heigth3;
                    System.out.println(" the sum is --> " + area3 );
                    break;
                case 4:   
                    System.out.println("Good Bye my friend");  
                    System.exit(0);
                    break;  
    
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}