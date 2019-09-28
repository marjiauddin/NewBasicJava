
package newbasicjava;

import java.util.Scanner;

public class PatternDemo7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter any line:");
        n=input.nextInt();
        
        for (int row = 0; row <n; row++) {
            for (int col = 65; col <=65+row; col++) {
                System.out.print(" "+(char)col);
                
            }
            System.out.println(" ");
            
        }
        
    }
    
    }
    

