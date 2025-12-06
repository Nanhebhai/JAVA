// Check if a given year is a leap year or not
public class pro5 {
    public static void main(String[] args) {
        int year = 2020; // You can change this value to test with other years

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }
    }
}