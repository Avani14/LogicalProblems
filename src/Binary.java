import java.util.Scanner;
//Not completed
public class Binary {
	public static int toBinary(int n) {
		//i>Swap nibbles
		
		System.out.println("First part "+(n & 0x0F));
		System.out.println("Second part "+(n & 0xF0>>4));
		return((n & 0x0F<<4)|(n & 0xF0>>4));
	}
	public static void powerOf2(int n) {
		if((int)toBinary(n)<=0)
		{
			System.out.println("The number is too small");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("The binary of "+num+" is "+Integer.toBinaryString(num));
		System.out.println("Swapping of nibbles "+toBinary(num));
//		System.out.println((int)toBinary(num));
	}

}
