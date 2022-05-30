import java.util.Scanner;
//not completed yet
public class FewestNotes {
	public static short[] notes = {1,2,5,10,50,100,500,1000};
	static short[] returnMoney = new short[8];
	static short i = 0;
	public static short returnValue(short amount)
	{
		if(amount == 0)
		{
			return 0;
		}
		else {
			if(amount >= notes[i])
			{
				returnMoney[i] = (short) (amount/notes[i]);
				amount-= returnMoney[i]*notes[i];
				
			}
			i++;
			return returnValue(amount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the return you want from the vending machine");
		short change = sc.nextShort();
		System.out.println(returnValue(change));
		System.out.println(returnMoney[0]);
	}

}
