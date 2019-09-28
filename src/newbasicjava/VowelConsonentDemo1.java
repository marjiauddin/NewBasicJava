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
public class VowelConsonentDemo1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        char ch;
        System.out.print("Enter any Character:");
        ch=input.next().charAt(0);
        
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' ||ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
        
        
        
        
        
        
    }
   
    
}
