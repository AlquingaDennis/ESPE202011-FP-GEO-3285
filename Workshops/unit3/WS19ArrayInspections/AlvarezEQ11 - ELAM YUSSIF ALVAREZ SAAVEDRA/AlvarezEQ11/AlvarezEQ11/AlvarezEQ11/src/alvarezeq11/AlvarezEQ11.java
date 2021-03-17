/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvarezeq11;

import java.util.Scanner;

/**
 *
 * @author SAAVEDRA
 */
public class AlvarezEQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma =0;
        int [] array = new int [5];
        Scanner ent = new Scanner (System.in);
        for (int i=0; i < 5; i++){
            
            System.out.println("Enter to " + i + " number: ");
            array[i] = ent.nextInt();
            suma += array[i];
        }
         int n,s=0,x;
        double p;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the 3 floating numbers:");
        n=teclado.nextInt();
   
        for(int i=1;i<=2;i++)
        { 
         System.out.println("Elements ["+i+"]=");
         x=teclado.nextInt();
         s=s+x;                
        }   
        p=s/2;
        
         System.out.println("The Average is:" +p); 
        for (int i=0; i < 1; i++){
            System.out.println("Sum total is: " + suma);
        }
        int[] numeros = { 12,23,34,98,87,65,0 };
     
        int numeroBuscado = 20;
  
        int posicionDeElementoBuscado = existeEnArreglo(numeros, numeroBuscado);
 
        if (posicionDeElementoBuscado == -1) {
   
            System.out.println("Element does not existir in array");
  } else {
    System.out.println("Element exist in the posicion: " + posicionDeElementoBuscado);
  }
    }

    private static int existeEnArreglo(int[] numeros, int numeroBuscado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
