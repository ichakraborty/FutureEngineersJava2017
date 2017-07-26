import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// go over Scanner and various methods

public class ReadDataTypealong
{
	 private Scanner inFile; // local vs global variables
	 private int number;

	public static void main(String[] args)
	{
		  ReadData rd = new ReadData();
		  rd.run();

	}

	public void run()
	{
		String fileName = "data.txt";
		File inputFile = new File(fileName);

		try
		{
					inFile = new Scanner( inputFile );
		}

		catch (FileNotFoundException e)
		{
					System.err.printf("ERROR: Cannot open %s\n", fileName);
					System.exit(1);
		}

		while (inFile.hasNext())
		{
				number = inFile.nextInt();
				System.out.print(number + "   ");
		}
		inFile.close();

	}
}
