import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("data_stream.bin");

        String[] strings;
        int[] numbers;
        double[] doubles;

        try(DataInputStream ds = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(f)))) {

            //initialize strings array to hold inside N elements read by ds.readInt()
            strings = new String[ds.readInt()];

            for (int i=0; i<strings.length; i++) {
                strings[i] = ds.readUTF();
                System.out.print(strings[i] + " ");
            }
            System.out.println();

            numbers = new int[ds.readInt()];
            for (int i=0; i<numbers.length; i++) {
                numbers[i] = ds.readInt();
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            doubles = new double[ds.readInt()];
            for (int i=0; i<doubles.length; i++) {
                doubles[i] = ds.readDouble();
                System.out.print(doubles[i] + " ");
            }
            System.out.println();

        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}