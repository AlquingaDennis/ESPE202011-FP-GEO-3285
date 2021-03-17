/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperation;

import ec.edu.espe.Matrix.BasciOperationMatrix;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
     

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("☾☾☾☾☾Enter matrix A:☽☽☽☽☽");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("****************");

        System.out.println("☾☾☾☾☾Enter matrix B:☽☽☽☽☽");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix A and Matrix B:");

        System.out.println("");
        System.out.println("----MATRIX A----");
        System.out.println("************");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matrixA[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }

            }
        }
        System.out.println("-----MATRIX B-----");
        System.out.println("************");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matrixB[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }

            }
        }
        
        System.out.println("🎥🎥🎥🎥🎥 Matrix sum 🎥🎥🎥🎥🎥");
        System.out.println("");
        BasciOperationMatrix.addMatrix(matrixA, matrixB);
        
     
        System.out.println("🌛🌛🌛🌛🌛Matrix Subtraction🌛🌛🌛🌛🌛");
         System.out.println("");
        BasciOperationMatrix.subtractionMatrix(matrixA, matrixB);
          
        System.out.println("🌞🌞🌞🌞🌞Matrix Multiplication🌞🌞🌞🌞🌞");
         System.out.println("");
        BasciOperationMatrix.multiplyMatrix(matrixA, matrixB);
        
        
       
    }
}