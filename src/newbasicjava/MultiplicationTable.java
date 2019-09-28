/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbasicjava;

import java.util.Scanner;

/**
 *
 * @author himac
 */
public class MultiplicationTable {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any number:");
        num=input.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+"=" +num*i );
            
        }
        
        
    }
    
}
