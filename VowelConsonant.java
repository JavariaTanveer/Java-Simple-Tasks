import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		char n=input.next().charAt(0);
		if(n=='A'||n=='a'||n=='E'||n=='e'||n=='I'||n=='i'||n=='O'||n=='o'||n=='U'||n=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
