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
public class CircleDemo {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        double radius,area;
        System.out.print("Enter radius:");
        radius=input.nextDouble();
        
        area=3.1416*radius*radius;
        System.out.println("Area is:"+area);
    }
}
