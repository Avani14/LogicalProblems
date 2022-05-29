import java.util.Scanner;

public class CheckIfPositiveOrNegative {
	public static void positiveOrNegative(float n)
	{
		if(n>0.0)
		{
			if(n<1.0)
			{
				System.out.print("small ");
			}
			else if(n>1000000.0)
			{
				System.out.print("large ");
			}
			System.out.print("positive");
		}
		else
		{
			System.out.print("negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		float num = sc.nextFloat();
		positiveOrNegative(num);
	}
}
