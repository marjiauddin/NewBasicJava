
package newbasicjava;

import java.util.Scanner;


public class ArrayAverageDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double[]number=new double[5];
        double sum=0;
        System.out.print("Please enter 5 number:");
        for (int i = 0; i < number.length; i++) {
            number[i]=input.nextDouble();
            
        }
        for (int i = 0; i <number.length; i++) {
            sum=sum+number[i];
            
        }
        System.out.println("Sum is :"+sum);
        double avg=sum/number.length;
        System.out.println("Average is:"+avg);
        
    }
    
    
    
}
