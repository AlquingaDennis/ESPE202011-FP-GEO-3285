/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaretion;

import java.util.Scanner;
import ec.edu.espe.tax.BasicTax;

/**
 *
 * @author Asus
 */
public class TaxDeclaretion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentage = 12;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----Dennis Alquinga Taxes---");
        System.out.println("IVA ---->");
        System.out.println("Ente the price of your products");
        price = input.nextFloat();
        
        ivaValue = BasicTax.computeIva(price, ivaPercentage);
        totalPrice = price + ivaValue;
        
        System.out.println("total price -> " + totalPrice);
        
        
    }
    
}
