import java.util.Scanner;

public class Swap {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1=input.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2=input.nextInt();
		System.out.println("Before swapping");
		System.out.println("1st number = " + n1 + ", 2nd number = " + n2);
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping");
		System.out.println("1st number = "+ n1+", 2nd number = "+n2);
		
	}
}
