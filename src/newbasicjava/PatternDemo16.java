
package newbasicjava;

import java.util.Scanner;


public class PatternDemo16 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter any number:");
        n=input.nextInt();
        
        for (int row =n; row>=1; row--) {
            for (int col =1; col<=n-row; col++) {
                System.out.print(" ");
                
            }
            for (int col = 1; col <=2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
