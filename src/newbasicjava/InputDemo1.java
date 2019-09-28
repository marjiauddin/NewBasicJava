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
public class InputDemo1 {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        String name;
        
        System.out.print("Enter your name:");
        
        name=input.nextLine();
        
        System.out.println("welcome "+name);
    }
    
}
