// write a program to swap two numbers without using a third variable
public class pro2 {
        public static void main(String[] args) 
    {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        // After swapped 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}