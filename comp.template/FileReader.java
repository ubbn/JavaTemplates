package comp.template;

import java.io.File;
import java.util.Scanner;

/**
 * @author ubbn
 * 
 * Simple template to read integers from given file to int array
 *
 */
public class FileReader {
	static int[] numbers;
	
	public static void ReadFile(String fileName)
	{
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
			
			int i = 0;
			while(scanner.hasNextLine())
			{
				numbers[i++] = scanner.nextInt();
			}
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		finally
		{
			scanner.close();
		}
	}
	
	public static void main(String[] args) {
		String fileName= "input.in";
		ReadFile(fileName);
		
		/*
		 * Do processing
		 */
	}
}
