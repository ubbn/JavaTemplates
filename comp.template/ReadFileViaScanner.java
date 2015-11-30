package comp.template;

import java.io.File;
import java.util.Scanner;

/**
 * @author ubbn
 * 
 * Simple template to read integers from given file to int array
 * Yet, it is not fastest, but simple & quick for typing.
 *
 */
public class ReadFileViaScanner {
	static int[] numbers;
	
	public static void ReadFile(String fileName)
	{
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
			int totalNumbers = scanner.nextInt();
			numbers = new int[totalNumbers];
			System.out.println(totalNumbers);
			for (int i = 0; i < totalNumbers; i++){
				numbers[i] = scanner.nextInt();
				System.out.println(numbers[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
	}
	
	public static void main(String[] args) {
		String fileName= "resource/inputdata";
		ReadFile(fileName);
		
		/*
		 * Do processing
		 */
	}
}
