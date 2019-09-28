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
public class AverageDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int num1,num2,num3,sum;
        float average;
        
        
        System.out.print("Enter first number:");
        num1=input.nextInt();
        
        
        System.out.print("Enter 2nd number:");
        num2=input.nextInt();
                
        System.out.print("Enter 3rd number:");
        num3=input.nextInt();
        
        
        sum=num1+num2+num3;
        average=sum/3;
        System.out.println("Sum="+sum);
        System.out.print("average="+average);
        
        
        
        
    }
    
}
