// Convert given days into years,months and days without user input
public class pro6 { 
    public static void main(String[] args) 
    {
        int totalDays = 800;

        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;

        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        System.out.println(totalDays + " days is approximately " + years + " years, " + months + " months, and " + days + " days.");
    }
}