/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.functions;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int wats;
        int hours;
        int days;
        int multiply;

        int Volts;
        int Amps;
        
        System.out.println("AUTHOR: DENNIS FABIAN ALQUINGA");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculate the monthly electricity consumption of the ranges");
        
        System.out.println("Enter the wats");
        System.out.println("Wats -->");
        wats= input.nextInt();
        
        System.out.println("Enter the hours");
        System.out.println("Hours -->");
        hours= input.nextInt();
        
        System.out.println("Enter the days");
        System.out.println("Days -->");
        days= input.nextInt();
        
        System.out.println("The monthly electricity consumption of the ranges is " + (wats * hours * days));
        
        System.out.println("Calculate the average power of the ranges");
        
        System.out.println("Enter the Volts");
        System.out.println("Volts -->");
        Volts= input.nextInt();
        
        System.out.println("Enter the Amps");
        System.out.println("Amps -->");
        Amps= input.nextInt();
        
        System.out.println("The average power of the ranges is " + (Volts * Amps) + " watts ");

    }

}
