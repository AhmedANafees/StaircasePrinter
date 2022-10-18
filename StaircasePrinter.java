import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class StaircasePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10");
        Scanner input  = new Scanner(System.in);
        int lineLen = input.nextInt();
        if (lineLen <= 10 && lineLen >= 1){
            for (int i = 0; i < lineLen; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Please try again");
        }
    }
    
}
