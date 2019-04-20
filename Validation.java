/**
 * 
 */
import java.util.Scanner;

/**
 * @author Gabriel Zacarias
 *
 */
public class Validation 
{
	
	public static void main(String[] args)
	{
		System.out.print("Validation by Gabriel Zacarias\n");
		Scanner in = new Scanner(System.in);
		String prompt = "Enter your name";
		int maxLength = 20;
		Validation.getString(in, prompt, maxLength);
		
		prompt = "Enter your age: ";
		int lower = 0;
		int upper = 80;
		Validation.getInteger(in, prompt, lower, upper);
	}
	
	public static String getString(Scanner in, String prompt, int maxLength)
	{
		boolean done = false;
		boolean valid = false;
		String s = "";
		
		while (done == false)
		{
			if (valid == false)
			{
				System.out.print(prompt);
				System.out.print(" : ");
				s = in.nextLine();
			
					
					
					 if (s.length() > 0 && s.length() <= maxLength)  // ignore blank lines 
					{
							valid = true;
							done = true;
					}
				
					else
					{
						System.out.print("Maximum length is " + maxLength + " characters. Try again.\n");
						valid = false;
					}
			}
		}
		
		return s;
	}

	public static int getInteger(Scanner in, String prompt, int lower, int upper)
	{
		boolean valid = false;
		boolean done = false;
		int input = -1;
		
		while (done == false)
		{
			if (valid == false)
			{
				System.out.print(prompt);
				System.out.printf(" [between %d and %d inclusive]", lower, upper);
				System.out.print(": ");
			
				input = in.nextInt();
			
				if (input >= lower && input <= upper) 
				{
					valid = true;
				}
				
				else
				{
					valid = false;
					System.out.print("Value is out of range.\n");
				}
			}
			
			else if (valid == true)
			{
				System.out.print("Please enter an integer: ");
				System.out.printf(" [between %d and %d inclusive]", lower, upper);
				System.out.print(": ");
				input = in.nextInt();
				
				if (input >= lower && input <= upper) 
				{
					done = true;
				}
				
				else
				{
					valid = true;
					System.out.print("Value is out of range.\n");
				}
			}
		}
			return input;
		}
}
