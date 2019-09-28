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
public class LoopDemo2 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int sum=0;
        int m,n;
        
        System.out.print("Enter initial number:");
        m=input.nextInt();
        
        System.out.print("Enter final number:");
        n=input.nextInt();
        
        
        for(int i=m;i<=n;i++){
            
            if(i%2==0){
                
                sum=sum+i;
                System.out.print(" " +i);
            }
        }
        
        System.out.println(" ");
        System.out.println("The sum is:" +sum);
        
        
    }
}