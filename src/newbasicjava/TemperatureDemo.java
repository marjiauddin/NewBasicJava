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
public class TemperatureDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        double cels,f;
        System.out.print("Enter cels:");
        cels=input.nextDouble();
        
        f=1.8*cels+32;
        System.out.println("F="+f);
        
        
    }
            
    
}
