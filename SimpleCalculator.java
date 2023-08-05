import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int res=0;
		System.out.print("Enter 1st number: ");
		int n1=input.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2=input.nextInt();
		System.out.print("Enter Operator: ");
		char op=input.next().charAt(0);
		switch(op)
		{
		case '+':
			res=n1+n2;
	        break;
		case '-':
			res=n1-n2;
	        break;
		case '*':
			res=n1*n2;
	        break;
		case '/':
			res=n1/n2;
	        break;
		default:
	        System.out.println("Invalid operator!");
	        break;
		}
		System.out.println("Result = " + res);
		
	}
}
