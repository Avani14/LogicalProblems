import java.util.Scanner;

public class WorkShop {
	//using method
	public static void perfectNumber(int n)
	{
		int temp = n;
		int sum = 0;
		for(int i = 1; i<n ;i++)
		{
			if(n%i == 0)
			{
				System.out.println("The divisor is "+i);
				sum+=i;
			}
		}
		
		if(sum == temp)
		{
			System.out.println("The number "+n+" is a perfect number");
		}
		else
		{
			System.out.println("The number "+n+" is not a perfect number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		perfectNumber(n);
	}

}
