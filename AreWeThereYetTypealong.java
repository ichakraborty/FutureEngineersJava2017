//Isha Chakraborty
//11-16-2015

public class AreWeThereYetTypealong
{
	public static void main(String [] Args)
	{
		int miles = 50;

		// try w do-while and while
		
		for(miles = 50; miles > 0; miles -=5)
		{
				System.out.println("Are we there yet?\n");
				System.out.println("No, please stop asking. We still have another "+ miles + " miles\n ");
		}

		System.out.println("We're here!\n");
		}
	}
