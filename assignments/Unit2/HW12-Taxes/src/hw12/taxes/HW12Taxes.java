/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.taxes;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obtener = new Scanner (System.in);
        
        System.out.println("Enter the net worth of the product");
        
        double producto =0;
        
        producto = obtener.nextInt();
        
        double iva=0;
        
        iva = (double) (producto*0.12);
        
        System.out.println("The iva of the product is " + iva);
         
    }
 
}