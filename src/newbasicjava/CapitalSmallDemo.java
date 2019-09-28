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
public class CapitalSmallDemo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        char ch;
        System.out.print("Enter any letter:");
        
        ch=input.next().charAt(0);
        
        if(ch>='A'&&ch<='Z'){
            System.out.println("Capital Letter");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("Small letter");
            
        }
        else{
            System.out.println("Not a letter");
        }
         }
    }
    

