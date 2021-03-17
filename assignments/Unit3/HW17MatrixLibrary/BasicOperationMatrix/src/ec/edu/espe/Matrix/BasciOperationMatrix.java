/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Matrix;

/**
 *
 * @author Asus
 */
public class BasciOperationMatrix {
    
    // addition, subtraction,multiplication
    public static void addMatrix(int[][] matrixA, int[][] matrixB) {
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrixA[i][j] + matrixB[i][j]) < 10) {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + "  ");
                } else {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }

    public static void subtractionMatrix(int[][] matrixA, int[][] matrixB) {
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrixA[i][j] + matrixB[i][j]) < 10) {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + "  ");
                } else {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }


     public static void multiplyMatrix(int[][] matrixA, int[][] matrixB) {
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrixA[i][j] + matrixB[i][j]) < 10) {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + "  ");
                } else {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }
     
}