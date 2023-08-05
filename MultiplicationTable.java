import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=0;
		while(i<10)
		{
			System.out.println(n+" x " + (i+1)+"=" + (n*(i+1)));
			i++;
		}
	}
}
