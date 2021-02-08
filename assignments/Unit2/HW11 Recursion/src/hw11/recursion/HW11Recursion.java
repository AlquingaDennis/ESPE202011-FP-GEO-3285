/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursion;

/**
 *
 * @author Asus
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        //
        //we save the result in a variable
        int resultado = sumaRecursiva(n);
        // We show the result
        System.out.println(resultado);

    }

    public static int sumaRecursiva(int numero) {

        int res;

        if (numero == 1) {
            
        // The recursion ends
            return 1;
        } else {
            // The function with the parameter number minus 1 calls itself
            res = numero + sumaRecursiva(numero - 1);
        }

        // Returns the result
        return res;
    }

}
