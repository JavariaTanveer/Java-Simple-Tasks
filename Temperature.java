import java.util.*;

public class Temperature {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Temperature in Centigrade: ");
		double c=input.nextDouble();
		double f = c*9/5+32;
		double k = c + 273.15;
		System.out.println("Enter Temperature in Fahrenheit: " + f);
		System.out.println("Enter Temperature in Kelvin: " + k);
	}
}
