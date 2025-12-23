// Print Fibonacci Series upto n terms
public class pro5 {
    public static void main(String[] args) {
        int n = 10; // You can change this number to print more or fewer terms
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}