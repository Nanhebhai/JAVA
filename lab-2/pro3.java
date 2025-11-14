// swap two numbers using third variable
public class pro3 {
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a; 
        a = b; 
        b = temp; 

        // After swapped 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}