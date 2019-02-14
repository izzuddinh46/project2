/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indecrementcp;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class InDeCrementCP {
    public static void main(String[] args) {
        int input,i, j, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("bilangan baris piramid terbalik: ");
        input = scan.nextInt();
        
        for(i=input;i>=1;i--){
            for(j=input;j>i;j--){
                System.out.println(" ");
            }
            for(k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
