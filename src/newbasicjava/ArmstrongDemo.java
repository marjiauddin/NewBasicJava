
package newbasicjava;

import java.util.Scanner;


public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r,temp,num,sum=0;
        System.out.print("Enter any number:");
        num=input.nextInt();
        
        temp=num;
        
        
        while(temp!=0){
            r=temp%10;
            sum= sum+r*r*r;
            temp=temp/10;
            
            
            
        }
        if(num==sum){
            System.out.println("Armstrong number");
            
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
    
}
