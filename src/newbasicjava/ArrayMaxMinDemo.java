
package newbasicjava;

import java.util.Scanner;


public class ArrayMaxMinDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double [] number=new double[5];
        System.out.print("Please Enter 5 numbers:");
        
        for (int i = 0; i <number.length; i++) {
            number[i]=input.nextDouble();
            
            
        }
         double max=number[0];
         double min=number[0];
        for (int i = 1; i < 5; i++) {
            if(max<number[i]){
                max=number[i];
            }
            if(min>=number[i])
                min=number[i];
            
        }
        System.out.println("Maximum number is:"+max);
        System.out.println("Minumum number is:"+min);
        
    }
    
}
