
package newbasicjava;

import java.util.Scanner;


public class PatternDemo25 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter any line:");
        n=input.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col<=n-row; col++) {
                System.out.print(" ");
                
            }
            for (int col = 1; col <=row; col++) {
                System.out.print(""+col);
                
            }
            for (int col =row-1; col>=1; col--) {
                System.out.print(""+col);
                
            }
            System.out.println(" ");
            
        }
    }
    
}
