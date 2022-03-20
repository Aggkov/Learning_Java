import java.util.Random;

public class exercise02 {
    public static void main(String[] args) {

        Random r = new Random();
        int N = 10, M = 4, K = 9;
        int[][][] myArray = new int[N][M][K];
        boolean check;


        // 1. initialize
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                for (int k = 0; k < K; k++)
                    myArray[i][j][k] = r.nextInt(5001);

        for (var array2d : myArray) {            // for each 2d array inside 3d array
            for (var array1d : array2d) {         // for each 1d array inside 2d array
                for (var elem : array1d) {      // we reach elements inside 1d array
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }

        // 3. Search for an element

        check = false;
        outer: for (var array2d : myArray)
            for (var array1d : array2d)
                for (var elem : array1d) {
                    if (elem == 1123)   {
                        System.out.print("Element found");
                        check = true;
                        break outer;
                }
            }

        if (!check)
            System.out.println("Element not found");
    }
}
