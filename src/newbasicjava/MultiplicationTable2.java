/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbasicjava;

import java.util.Scanner;

/**
 *
 * @author himac
 */
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        System.out.print("Enter initial number:");
        m=input.nextInt();
        
        System.out.print("Enter last number:");
        n=input.nextInt();
        
        
        for(int i=m;i<=n;i++){
            
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j+"="+i*j);
            }
            System.out.println("    ");
        }
        
        
        
    }
    
}
