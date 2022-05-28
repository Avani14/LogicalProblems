import java.util.Scanner;

public class PrimeNumbers {

	public static boolean primeNumberDertermine(int n)
	{
		boolean ans = false;
		for(int i =2;i<n;i++)
		{
			if(n%i == 0)
			{
				ans =  false;
			}
			else
			{
				ans = true;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		if(PrimeNumbers.primeNumberDertermine(n)) {
		System.out.println(n+" is a prime number");	
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
