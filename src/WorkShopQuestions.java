
public class WorkShopQuestions {
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		//using while loop
//		while(n>0)
//		{
//			sum+=n%10;
//			n=n/10;
//		}
		//using for loop
		for(sum = 0;n>0;n=n/10)
		{
			sum+=n%10;
		}
		return sum;
	}
	public static int addition(int x,int y)
	{
		return x+y;
	}
	public static int subtraction(int x,int y)
	{
		return x-y;
	}
	public static int multiply(int x,int y)
	{
		return x*y;
	}
	public static int division(int x,int y)
	{
		return x/y;
	}
	public static int modulus(int x,int y)
	{
		return x%y;
	}
	public static void swapping(int x,int y)
	{
		System.out.println("Before swapping the numbers number 1 is "+x+" and number 2 is "+y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping the numbers number 1 is "+x+" and number 2 is "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Question
		System.out.println("Hello");
		System.out.println("Avani");
		//Second Question 
		int num1 = 212;
		int num2 = 12;
		System.out.println(num1+"!="+num2+" => "+(num1!=num2));
		System.out.println(num1+"<"+num2+" => "+(num1<num2));
		System.out.println(num1+"<="+num2+" => "+(num1<=num2));
		//Third Question Sum of digits
		int num3= 123;
		System.out.println("Sum of digits of "+num3+" is :"+WorkShopQuestions.sumOfDigits(num3));
		//Forth Question
		System.out.println("Addition of "+num1+" "+num2+" is: "+WorkShopQuestions.addition(num1, num2));
		System.out.println("Subtraction of "+num1+" "+num2+" is: "+WorkShopQuestions.subtraction(num1, num2));
		System.out.println("Multiplication of "+num1+" "+num2+" is: "+WorkShopQuestions.multiply(num1, num2));
		System.out.println("Division of "+num1+" "+num2+" is: "+WorkShopQuestions.division(num1, num2));
		System.out.println("Modulus of "+num1+" "+num2+" is: "+WorkShopQuestions.modulus(num1, num2));
		//Swapping 
		WorkShopQuestions.swapping(num1, num2);
	}

}
