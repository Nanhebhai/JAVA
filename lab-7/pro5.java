// reverse an array. 
public class pro5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array is:");
        for (int number : reversed) {
            System.out.println(number);
        }
    }
}