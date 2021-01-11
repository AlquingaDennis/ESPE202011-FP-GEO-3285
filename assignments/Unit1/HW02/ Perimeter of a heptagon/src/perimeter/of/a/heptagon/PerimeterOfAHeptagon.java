/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter.of.a.heptagon;

/**
 *
 * @author Asus
 */
public class PerimeterOfAHeptagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float perimeter;
        float side1;
        float side2;
        float side3;
        float side4;
        float side5;
        float side6;
        float side7;
        
        side1 = 5.12f;
        side2 = 7.3f;       
        side3 = 4.98f;
        side4 = 7.66f;    
        side5 = 11.3f;    
        side6 = 12.01f;   
        side7 = 2.78f;
         
        // operation 
        perimeter = side1 + side2 + side3 + side4 + side5 + side6 + side7;
        
        System.out.println(" Perimeter of a heptagon" + side1 + "+" + side2 + "+" + side3 + "+" + side4 + "+" + side5 + "+" + side6 + "+" + side7 + "is equal to -->" +  perimeter);
    }
    
}
