import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        File f = new File("text_bufferedwriter.txt");

        String[] strings = {"these", "are", "some", "data"};
        int[] numbers = {1, 2, 3, 4};
        double[] doubles = {1.14, 4.12, 1.77, 1.94};

        try(PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(f)), true)) {
            for (int i = 0; i < numbers.length; i++) {
                pw.print(numbers[i] + "\t" + strings[i]);
                pw.printf(Locale.US, "\t%.2f\n",doubles[i]);
            }
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}