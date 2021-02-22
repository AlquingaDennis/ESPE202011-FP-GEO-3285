/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes22.pkg2.pkg2021;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Quizzes2222021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota[] = new int[3];
        String nombres[] = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ENTER NAME : ");
            nombres[i] = teclado.next();

            float grades;
            float sum = 0;
            float average;
            int a;

            for (a = 1; a <= 3; a++) {
                System.out.println("enter note:" + a + "");
                grades = leer.nextFloat();
                sum = sum + grades;
            }
            average = sum / (a - 1);
            System.out.println("The average of the grades is:" + average);

        }
    }
