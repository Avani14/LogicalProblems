import java.util.Scanner;

public class DayOfWeek {
	
	public static short dayOfWeek(short y, short m, short d)
	{
		y = (short) (y - (14 - m) / 12);
		short x = (short) (y + y/4 - y/100 + y/400);
		m = (short) (m + 12 * ((14 - m) / 12) - 2);
		d = (short) ((d + x + 31*m/ 12) % 7);
		return d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		short m = sc.nextShort();
		System.out.println("Enter day");
		short d = sc.nextShort();
		System.out.println("Enter year");
		short y = sc.nextShort();
		System.out.println(dayOfWeek(y, m, d));
	}
}
