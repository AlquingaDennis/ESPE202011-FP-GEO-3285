/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class HW15MatrixOperation {

    /**
     * @param Args
     */
    public static void main(String[] Args) {
        int matriza[][] = new int[3][3];
        int matrizb[][] = new int[3][3];
        int matrizc[][] = new int[3][3];
        int i, j;

        Scanner dato = new Scanner(System.in);

        System.out.println("Matrix A data :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Write value " + i + " , " + j + " : ");
                matriza[i][j] = dato.nextInt();
            }
        }

        System.out.println("Matrix B data :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Write value " + i + " , " + j + " : ");
                matrizb[i][j] = dato.nextInt();
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matrizc[i][j] = matriza[i][j] * matrizb[i][j];
            }
        }

        System.out.println("Matrix resulting from multiplication :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizc[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
