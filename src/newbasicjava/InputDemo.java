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
public class InputDemo {
    
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        
        int number;
        System.out.print("Enter any number:");
        number=input.nextInt();
        System.out.println("number="+number);
    }
    
}
