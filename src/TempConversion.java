import java.util.Scanner;

public class TempConversion {
	public static void convertToCelsius(int temp)
	{
		int ans = (temp - 32) * 5/9;
		System.out.println("The tempurature in Celsius is :"+ans+"°C");
	}
	public static void convertToFahrenheit(int temp)
	{
		int ans = (temp * 9/5) + 32;
		System.out.println("The tempurature in Farhrenheit is :"+ans+"°F");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the tempurature");
		int temp = sc.nextInt();
		System.out.println("Enter \'c\' if you want to convert the tempurature into Celsius or \'f\' if you want to convert the tempurature into Fahrenheit");
		String c = sc.next();
		if(c == "c")
		{
			convertToCelsius(temp);
		}
		else
		{
			convertToFahrenheit(temp);
		}
	}

}
