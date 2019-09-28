
package newbasicjava;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any positive integer:");
       int  num=input.nextInt();
       int count=0;
       
       
       for(int i=2;i<num;i++){
           
           if(num%2==0){
               count++;
               break;
           }
       }
       if (count==0){
        System.out.println("prime number");
        
    }
       else{
           System.out.println("not a prime number");
       }
    
}
    
}
