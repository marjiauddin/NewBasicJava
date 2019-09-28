
package newbasicjava;

import java.util.Scanner;


public class PatternDemo22 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter eny line:");
        n=input.nextInt();
        
         for (int row =1; row<=n; row++) {
            for (int col =1; col<=n; col++) {
                if(col==1 || row==n || col==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            
        }
    }
    
}
