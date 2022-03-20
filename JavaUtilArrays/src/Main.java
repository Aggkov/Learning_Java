import java.util.Arrays;
import  java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(6);

        //print array
        for(int i = 0; i< array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();


        //sort array
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        //Binary Search
        System.out.println("Index of key 3 is: " + Arrays.binarySearch(array,3));



    }
}
