import java.util.Scanner;

/**
 * 
 */

/**@author Gabriel Zacarias
 *
 */
public class HistogramGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String prompt = "Enter the number of items";
		int value = 0;
		boolean valid = false;
		
		System.out.print("Enter the histogram title: ");
		String title = input.nextLine();
		
		System.out.print(prompt + ": ");
				
		while (valid == false)
		{
			if (input.hasNextInt())
			{
				value = input.nextInt();
					
				if (value >= 0 && value < 10)
				{
					valid = true;
				}
					
				else
				{
					System.out.println("Value is out of range.");
					System.out.print(prompt);
					System.out.print(" [between 0 and 10 inclusive]: ");
							
					while (!input.hasNextInt())
					{
						System.out.println("Please enter an integer.");
						input.next();
					}
				}
			}
		}
			
		int item_value[] = new int[value];
		String item_name[] = new String[value];
				
			input.nextLine();
		
			for (int i = 0; i < value; i++)
			{

				System.out.print("Enter item " + (i + 1) + ": ");
				item_name[i] = input.nextLine();
					
				while (item_name[i].length() > 10)
				{
					System.out.println("Maximum length is 10 characters. Try again.");
					System.out.print("Enter item " + (i + 1) + ": ");
					item_name[i] = input.nextLine();
				}
	
				System.out.print("Enter value " + (i + 1) + ": ");
				
				while (!input.hasNextInt())
				{
					input.next();
					System.out.println("Please enter an integer. ");
				}
				item_value[i] = input.nextInt();
				input.nextLine();
				
				while (item_value[i] < 0 || item_value[i] > 25)
				{
					System.out.println("Value is out of range.");
					System.out.print("Enter value " + (i + 1) + " [between 0 and 25 inclusive]:  ");
					item_value[i] = input.nextInt();
					input.nextLine();
				}
			}
					
			System.out.println("\n" +  title + "\n");
					
			for (int i = 0; i < value; i++)
			{
				System.out.printf("%-15s", item_name[i]);
						
				for (int j = 0; j < item_value[i]; j++)
				{
					System.out.print("*");
				}
						
				System.out.println();
			}
	}

}