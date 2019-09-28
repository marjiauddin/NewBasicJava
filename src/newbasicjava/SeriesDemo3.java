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
public class SeriesDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n,result=1;
        
        System.out.print("Enter last number:");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
             System.out.print(i+"X" +i+" ");
            result=result*i;
            
            
        }
        
        System.out.println(" ");
        System.out.println("result is:"+result);
    }
    
}
