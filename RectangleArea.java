import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter length: ");
		int n1=input.nextInt();
		System.out.print("Enter width: ");
		int n2=input.nextInt();
		System.out.println("Length = " + n1 + ", Width = " + n2);
		int area=n1*n2;
		System.out.println("Area = "+ area);
		
	}
}
