
package newbasicjava;

import java.util.Scanner;


public class ArraySumDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        double [] number=new double[5];
        double sum=0;
        System.out.print("Please enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            number[i]=input.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
            
        }
        System.out.println("Sum is:"+sum);
        
    }
    
}
