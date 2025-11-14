// print star pattern in odd order from reverse side from 5
public class pro3 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = n; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}