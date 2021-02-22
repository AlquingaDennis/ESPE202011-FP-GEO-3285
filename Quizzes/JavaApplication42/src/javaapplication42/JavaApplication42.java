/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota[] = new int[3];
        String nombres[] = new String[3];
        Scanner teclado = new Scanner(System.in);

            for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese nombre : ");
            nombres[i] = teclado.next();
            System.out.println("Ingrese nota : ");
            nota[i] = teclado.nextInt();
    }

            for (int i = 0; i < nota.length; i++) {
                if (nota[i] >= 7) {
            System.out.println("--------APROBADOS--------");
            System.out.println("Alumno: " + nombres[i] + " Nota: " + nota[i]);
        }
    }
    }