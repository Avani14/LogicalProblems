import java.util.Scanner;

public class AlltheDigitQuestions {
	public static void numberOfDigits(long n1)
	{
		long count = 0;
		while(n1>0)
		{
			count++;
			n1/=10;
		}
		System.out.println("The number "+n1+" is "+count+" digit long");
	}
	public static void averageNumber(float n1,float n2,float n3)
	{
		System.out.println("The average of numbers is "+((float)(n1+n2+n3)/3));
	}
	public static void equalOrNot(float n1,float n2,float n3)
	{
		if(n1 == n2 & n2 == n3)
		{
			System.out.println("The numbers are equal");
		}
		else
		{
			System.out.println("All numbers are different");
		}
			
	}
	public static void increasingDecreasing(float n1,float n2,float n3)
	{
		if(n1<n2 && n2<n3)
		{
			System.out.println("The numbers are in increasing order");
		}
		else if(n1>n2 && n2>n3)
		{
			System.out.println("The numbers are in decreasing order");
		}
		else {
			System.out.println("Neither increasing or decreasing order");
		}
	}
	public static void smallest(float n1,float n2,float n3)
	{
		float smaller = n1<n2?n1:n2;
		float smallest = smaller<n3?smaller:n3;
		System.out.println("The smallest number among "+n1+","+n2+" and "+n3+" is "+smallest);
	}
	public static void sameUpToTwoDecimalPlaces(float n1,float n2)
	{
		if(n1 == n2) {
		if(((n1*100)%100) == ((n2*100)%100)) {
			System.out.println("The numbers are same");
		}
		else
		{
			System.out.println("The numbers are not same");
		}
		}
		else
		{
			System.out.println("The numbers are not same");
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	float num1 = sc.nextFloat();
	System.out.println("Enter second number");
	float num2 = sc.nextFloat();
	System.out.println("Enter third number");
	float num3 = sc.nextFloat();
	smallest(num1, num2, num3);
	sameUpToTwoDecimalPlaces(num2, num3);
	increasingDecreasing(num1, num2, num3);
	averageNumber(num1, num2, num3);
	System.out.println("Enter a long number less than 10 billion to calculate its length");
	long n = sc.nextLong();
	numberOfDigits(n);
}
}
