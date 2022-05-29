import java.util.Scanner;

public class StopWatch {
	public static long startTimer;
	public static long endTimer;
	public static void getStartTime()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start time is :"+startTimer);
	}
	public static void getStopTime()
	{
		endTimer=System.currentTimeMillis();
		System.out.println("Stop time is :"+endTimer);
	}
	public static long stopWatch()
	{
		long ans = endTimer - startTimer;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 to start the time:");
		int startingTime = sc.nextInt();
		getStartTime();
		System.out.println("Please enter 2 to stop the time");
		int stopTime = sc.nextInt();
		getStopTime();
		if(stopTime == 2) {
		long ans = stopWatch();
		System.out.println("The time elapsed is :"+ans);
		}
	}
}
