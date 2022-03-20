public class Nestedloops {
    public static void main(String[] args) {

        final int N = 5;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (i + j < N - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");

            System.out.println(" ");
        }
    }
}
