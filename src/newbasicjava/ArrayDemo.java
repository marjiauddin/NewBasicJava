
package newbasicjava;


public class ArrayDemo {
    public static void main(String[] args) {
        int [] number=new int[5];
        
        number[0]=10;
        number[1]=10;
        number[2]=10;
        number[3]=10;
        number[4]=10;
        
        int len=number.length;
        System.out.println("Size of array:"+len);
        
        int sum=number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum is:"+sum);
    }
    
}
