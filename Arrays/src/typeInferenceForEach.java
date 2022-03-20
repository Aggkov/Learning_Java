public class typeInferenceForEach {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4};
        for (var elem: myArray)
            System.out.println(elem);

        System.out.println(" ");

        int[][] myArray2 = {{1,2},{3,4}};
        for (var row: myArray2) {
            for (var elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
