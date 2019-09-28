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
public class LargeDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num1,num2;
        System.out.print("Enter First number:");
        num1=input.nextInt();
        
        
        System.out.print("Enter Second number:");
        num2=input.nextInt();
        
        
        if(num1>num2){
            System.out.println("Large="+num1);
        }
        else if(num1<num2){
            
            System.out.println("Large="+num2);
            
        }
        
        else{
            System.out.println("Equal");
        }
        
        
        
    }
    
}
