import java.util.Scanner;

public class Fibonacci {
	public static void fibNumber(int n )
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		int counter = 0;
		while(counter<n)
		{
			System.out.println(n1);
			
			n3 = n1+n2; 
			n1 = n2;
			n2 = n3;
			counter++;
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Fibonacci series up to "+n+" is below:");
		Fibonacci.fibNumber(n);
	}

}
