/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.pkg​​a.heptagon;

/**
 *
 * @author Asus
 */
public class AreaOf​​aHeptagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int area;
        int sides; 
        int apothem;
        
        sides = 12;
        apothem = 27;
        
        
        // operation
        area = ((7*sides)*apothem)/2; 
        System.out.println("The area of ​​the heptagon is equal to : " + area);         
    }
    
}
