import java.util.Scanner;

public class MonthlyPayment {
	public static void monthlyPayment(float P,float Y,float R)
	{
		float n = 12 * Y;
		float r = R/(12*100);
		float payment = (float)((P*r)/(1-(Math.pow((1+r),(-n)))));
		System.out.println("the monthly payments you\r\n"
				+ "would have to make over "+Y+" years to pay off a "+P+" principal loan amount at "+R+" per cent\r\n"
				+ "interest compounded monthly is :"+payment);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of P");
		float p = sc.nextFloat();
		System.out.println("Enter value of Y");
		float y = sc.nextFloat();
		System.out.println("Enter value of R");
		float r = sc.nextFloat();
		monthlyPayment(p, y, r);
	}

}
