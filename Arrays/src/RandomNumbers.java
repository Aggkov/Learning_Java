import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int N = 10;
        Random r = new Random();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {           // Initialize array with for loop
            array[i] = r.nextInt(200);
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        for(var elem: array)           // for each element in array
            sum += elem;

        double average = sum / (double)N;
        System.out.println("\nAverage is: " + average);
    }
}
