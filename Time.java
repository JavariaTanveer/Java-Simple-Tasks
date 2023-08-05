import java.util.*;

public class Time {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Time in seconds: ");
		int s = input.nextInt();
		int m = s/60;
		int h = m/60;
		System.out.println("Time in minutes: " + m);
		System.out.println("Time in hours: " + h);
	}

}
