/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbasicjava;

/**
 *
 * @author HP
 */
public class UnaryDemo1 {
    public static void main(String[] args) {
        
        int x=10;
        int y;
        
        
        y=--x;
        System.out.println("y="+y);
        
        y=x--;
        System.out.println("y="+y);
        
        y=++x;
        System.out.println("y="+y);
        
        y=x++;
        System.out.println("y="+y);
    }
    
}
