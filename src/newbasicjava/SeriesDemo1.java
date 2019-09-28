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
public class SeriesDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double n,sum=0;
        System.out.print("Enter last number:");
        n=input.nextDouble();
        
        for (double i = 1.5; i <= 10; i++) {
            
            sum=sum+i;
            System.out.print(i+"+" +i);
            
        }
        System.out.println(" ");
        System.out.println("The sum is:" +sum);
        
    }
    
}
