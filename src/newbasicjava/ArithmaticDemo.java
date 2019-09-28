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
public class ArithmaticDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        
        System.out.print("Enter first number:");
         num1=input.nextInt();
         
        System.out.print("Enter second number:");
        
         num2=input.nextInt();
        
        
        
        result=num1+num2;
        System.out.println("Sum="+result);
        
        result=num1-num2;
        System.out.println("Sub="+result);
        
        result=num1*num2;
        System.out.println("Multiplication="+result);
        
        double result2 = (double)num1/num2;
        System.out.println("Division="+result2);
        
        result=num1%num2;
        System.out.println("Remainder="+result);
        
        
        
        
        
    }
}
