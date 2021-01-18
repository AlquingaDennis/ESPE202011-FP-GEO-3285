/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquingadennisq11;

import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Asus
 */
public class AlquingaDennisQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enter the table that you want to study
        System.out.println("enter the table that you want to study");
        int top=12;
        int product =0;
        int table;
        table = input.nexInt();
        for (int i = 1 ; i <= top ; i++){
            product = table * i;
            System.out.println(table + " *" + i + " = " + product);   
          
            }
            break;
            case 0:   
                System.out.println("Keep practicing see you later ");  
                System.exit(0);
                break;  
            default:
                System.out.println("Invalid option\n\n\n");
                break;
        }

        }  while (option != 0);

    }

}