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
public class VowelConsonentDemo {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        char ch;
        System.out.print("Enter any leter:");
        ch=input.next().charAt(0);
        
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }
        else if(ch=='i'){
            System.out.println("Vowel");
        }
        else if(ch=='o'){
            System.out.println("Vowel");
        }
        else if(ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}
