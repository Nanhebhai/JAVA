// Copy elements from one array to another.
public class pro6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] copied = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copied[i] = numbers[i];
        }
        System.out.println("Copied array is:");
        for (int number : copied) {
            System.out.println(number);
        }
    }
}