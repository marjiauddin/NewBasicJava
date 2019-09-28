
package newbasicjava;

import java.util.Scanner;


public class ReverseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r,num,sum=0,fibo,temp;
        System.out.print("Enter any number:");
        num=input.nextInt();
        
        temp=num;
        while(temp!=0){
            
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("Reverse of the number:"+sum);
    }
}
