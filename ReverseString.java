import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String n=input.next();
		String temp="";
		for(int i=0;i<n.length();i++)
		{
			temp=n.charAt(i)+temp;
		}
		System.out.println("Orignal String :"+n);
		System.out.println("Reverse String :"+temp);
	}
}
