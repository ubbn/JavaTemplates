package comp.template;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by ubbn on 11/26/15.
 *
 * Reads integers from a file using BufferedReader
 *
 */
public class ReadFileViaBuffer {
    static int[] numbers;

    public static void ReadFile (String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int i = 0;
        int totalNumber;
        try {
            totalNumber = Integer.parseInt(br.readLine());
            numbers = new int[totalNumber];
        }
        catch(Exception e){
            return;
        }

        while ((line = br.readLine()) != null && i < totalNumber) {
            try {
                numbers[i++] = Integer.parseInt(line);
                System.out.println(numbers[i-1]);
            }
            catch(NumberFormatException e){ }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String fileName= "resource/inputdata";
        ReadFile(fileName);
    }
}
