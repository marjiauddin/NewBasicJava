/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbasicjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SeriesDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n,sum=0;
        System.out.print("Enter the last number:");
        n=input.nextInt();
        
        for (int i = 1; i <= n; i=i+2) {
            
            sum=sum+i;
            System.out.print(" " +i);
            
        }
        System.out.println(" ");
        System.out.println(" sum is:" +sum);
        
    }
    
}
