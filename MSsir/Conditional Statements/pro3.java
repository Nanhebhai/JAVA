import java.util.Scanner;
public class pro3
{
	public static void main(String[] args) {
        Scanner atten=new Scanner(System.in);
        int attendance = atten.nextInt();
        if(attendance <= 75)
		   System.out.println("College Chalo");
        else
           System.out.println("Koe Tension nahi");
	}
}
