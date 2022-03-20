public class typeInference {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4};
        for (var i = 0; i < 4; i++)            // var takes care of type i
            System.out.println(myArray[i]);

        for (var v = 0.0; v < 1.0; v+=0.1)
            System.out.println(v);
    }
}
