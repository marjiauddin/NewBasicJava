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
public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num, fact=1;
        System.out.print("Enter any positive integer:");
        num=input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            
            fact=fact*i;
            System.out.print(" "+i);
            
        }
        
        System.out.println(" ");
        System.out.println("The factorial of " +num +"=" +fact);
        
    }
    
}
