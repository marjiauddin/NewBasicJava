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
public class GradeDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int mark;
        System.out.print("Enter mark:");
        mark=input.nextInt();
        
       if(mark>=70 && mark<79){
            System.out.println("A");
            
        }
        else if(mark>=60 && mark<69){
            System.out.println("A-");
            
        }
        else if(mark>=50 && mark<59){
            System.out.println("B");
            
        }
        else if(mark>=40 && mark<49){
            System.out.println("C");
            
        }
        else if(mark>=33 && mark<39){
            System.out.println("D");
            
        }
        else if (mark>=0 && mark<33){
            System.out.println("Fail");
            
        }
        else{
            System.out.println("invalid marks");
        }
    }
}
