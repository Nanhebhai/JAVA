// Count even and odd numbers in an array. 
public class pro7 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}