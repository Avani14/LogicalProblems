import java.util.Scanner;

public class ReverseANumber {
	public static void reverse(int n)
	{
		int temp = n;
		int sum = 0;
		int reverse = 0;
		while(n>0)
		{
			sum = n%10;
			reverse = reverse*10 + sum;
			n = n/10;
		}
		System.out.println("Reverse of number "+temp+" is : "+reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		ReverseANumber.reverse(n);
	}

}
