/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

/**
 *
 * @author Asus
 */
public class EjemploFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Multiplication Tables : 3");
        int top=10;
        int product =0;
        int table = 3;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("3 *" + j + " = " + product);
        }
    }
    
}
