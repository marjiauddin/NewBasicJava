
package newbasicjava;

import java.util.Scanner;


public class PatternDemo14 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.println("Enter eny line:");
        n=input.nextInt();
        
        for (int row =1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col*row);
                
            }
            System.out.println(" ");
            
        }
    }
            
    
}
