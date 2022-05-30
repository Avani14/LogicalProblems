import java.util.Scanner;

public class StringEvalualtion {
	public int a = 12;
	static int b = 13;
	public static void printMiddleCharater(String s)
	{
		
		if(s.length()%2==0)
		{
			System.out.println("The string has even number of charaters ie no middle character");
		}
		else
		{
			
			int n = s.length()/2;
			System.out.println(s.charAt(n));
		}
	}
	public static void countVowels(String str)
	{
		String s = new String();
		s = str.toLowerCase();
		int count = 0;
		for(int i =0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("The number of vowels in the string are :"+count);
	}
	public static void countWords(String s)
	{
		int count = 1;
		  int i = 0;
		 while (i < s.length())
	        {
	            if (s.charAt(i) == ' ')
	            	{
	            		++count;
	            	}
	            i++;
	        }
		 
	      
		System.out.println("The number of words in the string "+s+" are :"+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Last three questions in comments0
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String num = sc.next();
		System.out.println(b);
		System.out.println(StringEvalualtion.a);
		
		printMiddleCharater(num);
		countVowels(num);
		countWords("The quick brown fox jumps over the lazy dog.");
	}

}
