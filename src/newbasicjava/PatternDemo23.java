
package newbasicjava;

import java.util.Scanner;


public class PatternDemo23 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter eny line:");
        n=input.nextInt();
        
         for (int row =1; row<=n; row++) {
            for (int col =1; col<=n; col++) {
                if(row==col || row+col==n+1){
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
