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
public class LeapYearDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int year;
        System.out.print("Enter year:");
        year=input.nextInt();
        
        if (year%400==0){
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
            
            
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    
}
