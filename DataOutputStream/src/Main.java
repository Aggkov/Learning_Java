import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("data_stream.bin");


        //Data
        String[] strings = {"these", "are", "some", "data"};
        int[] numbers = {1, 2};
        double[] doubles = {1.14, 4.12, 1.77};

        //prepare Pipe
        try(DataOutputStream ds = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {

            //We find out how many strings are in array (4)
            ds.writeInt(strings.length);
            for (String string : strings)
                ds.writeUTF(string);

            ds.writeInt(numbers.length);
            for (int number : numbers)
                ds.writeInt(number);

            ds.writeInt(doubles.length);
            for (double d : doubles)
                ds.writeDouble(d);

        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}