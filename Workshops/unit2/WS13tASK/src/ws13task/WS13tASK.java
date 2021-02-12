/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class WS13tASK {

    /**
     * @param args the command line arguments
     */
    static double areaCirculo(int r) {
        double pi = 3.1416;
        return pi * Math.pow(r, 2);
    }

    static int areatriangulo(int a, int b) {
        return (a * b) / 2;
    }

    static int areatrapecio(int B, int b, int h) {

        return ((B + b) / 2) * h;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println(" ☾☾☾☾☾☾☾☾☾☾☾☾☾☾☾ MENU DE OPCIONES ☽☽☽☽☽☽☽☽☽☽☽☽☽☽ ");
            System.out.println(" ☪☪☪☪☪☪☪☪☪☪ ");
            System.out.println(" ☉☉☉☉☉☉ 1. Triangle     ☉☉☉☉☉☉ ");
            System.out.println(" 🌦🌦🌦🌦🌦 2. Trapeze      🌦🌦🌦🌦🌦 ");
            System.out.println(" 🌞🌞🌞🌞🌞 3. Circle       🌞🌞🌞🌞🌞 ");
            System.out.println(" ☪☪☪☪☪☪☪☪☪☪ ");
            System.out.println(" Enter an option ");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Enter the base the triangle");
                    int base = teclado.nextInt();
                    System.out.println("Enter the height of the triangle");
                    int altura = teclado.nextInt();
                    System.out.println(" The area of triangle is :" + areatriangulo(base, altura));
                    break;
                    
                case 2:
                     System.out.println("Enter the major base of the trapezoid");
                    int base_ma = teclado.nextInt();
                    System.out.println("enter minor base of the trapezoid");
                    int base_me = teclado.nextInt();
                    System.out.println("Record the height of the trapezoid");
                    int altura_t = teclado.nextInt();
                    System.out.println(" The area of trapeze is  :" + areatrapecio(base_ma, base_me, altura_t));
                    break;

                case 3:
                    System.out.println("Enter the radius ");
                    int radio = teclado.nextInt();
                    System.out.println(" The area of circle is :" + areaCirculo(radio));
                    break;
                   
            }

        } while (opcion != 4);
        
        
    }

}
