/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h11;

/**
 *
 * @author Asus
 */
public class H11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        //guardamos el resultado en una variable
        int resultado = sumaRecursiva(n);
        //Mostramos el resultado
        System.out.println(resultado);

    }

    public static int sumaRecursiva(int numero) {

        int res;

        if (numero == 1) {
            //Se termina la recursion
            return 1;
        } else {
            //Se llama a si misma la función con el parametro numero menos 1
            res = numero + sumaRecursiva(numero);
        }
    
    }
}
