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
public class LargeDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num1,num2,num3;
        
        System.out.print("Enter 1st number:");
        num1=input.nextInt();
        
        System.out.print("Enter 2nd number:");
        num2=input.nextInt();
        
        System.out.print("Enter 3rd number:");
        num3=input.nextInt();
        
        
        if(num1>num2 && num1>num3){
            System.out.println("Large="+num1);
        }
        
        else if(num2>num1 && num2>num3){
            System.out.println("Large="+num2);
        }
        
        else if(num3>num1 && num3>num2){
            System.out.println("Large="+num3);
        }
        else{
            System.out.println("Equal");
        }
        
    }
    
}
