public class Main {

    public static void main(String[] args) {
        Object[] array = new Object[4];

        //Auto Boxing
        array[0] = 2;
        array[1] = 2.1;
        array[2] = true;
        array[3] = "a string";

        //Print 4 types of Objects with toString method
        for(var value :array)
            System.out.println(value);
    }
}
