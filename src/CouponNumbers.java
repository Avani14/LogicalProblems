import java.util.Scanner;

public class CouponNumbers {
	public static void couponNumbers(int n)
	{
		int num;
		int[] temp=new int[n];
		for(int i =0;i<n;i++)
		{
			num = (int)Math.floor(Math.random()*10000);
			temp[i]=num;
			System.out.println("Coupon number "+i+" is "+num);
		}
		for(int i = 0;i<temp.length;i++)
		{
			for(int j = i+1;j<temp.length;j++)
			{
				if(temp[i] == temp[j])
				{
					System.out.println("Enter a number");
					temp[i] = (int)Math.floor(Math.random()*10000);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of coupon you want to genrate:");
		int n = sc.nextInt();
		couponNumbers(n);
	}

}
