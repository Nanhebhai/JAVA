// program to calculate compound interest without taking any input from user
public class pro7 {
    public static void main(String[] args) 
    {
        double principal = 10000; 
        double rate = 5; 
        int time = 10; 

        // Compound interest
        double amount = principal * Math.pow((1 + rate / 100), time);//math.pow ko use kiya hai power ke liye jo bhi answer aayega uski power 'time' ho jayega uske baad answer calculate hoga
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest after " + time + " years: " + compoundInterest);
    }
}