public class Main {

    public static void main(String[] args) {

        // Now our arrayLists have a specific usage with the use of BoundedGeneric Classes
        MyArrayList<Integer> arInt = new MyArrayList<>();
        arInt.add(1); arInt.add(2); arInt.add(3);
        System.out.println(arInt.average());

        MyArrayList<Double> arD = new MyArrayList<>();
        arD.add(1.1); arD.add(2.0); arD.add(3.0);
        System.out.println(arD.average());
    }
}
