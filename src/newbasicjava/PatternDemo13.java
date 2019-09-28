
package newbasicjava;

import java.util.Scanner;


public class PatternDemo13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n;
        System.out.println("Enter any line:");
        n=input.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
                
            }
            System.out.println(" ");
            
        }
    }
    
}
