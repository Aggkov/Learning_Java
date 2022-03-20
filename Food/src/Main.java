public class Main {

    public static void main(String[] args) {
        Food[] array = new Food[5];


          for (int i = 0; i < array.length; i++)
            /*array[0] = new Snack("sn1", 100);
            array[1] = new Snack("sn1", 100);
            array[2] = new TropicalFruit("trf1", 70,"Mango");
            array[3] = new TropicalFruit("trf2", 150, "Banana");
            array[4] = new Snack("sn2", 120);*/

          // or populate array with Switch
            switch (r.nextInt(5)) {

               case 0:
                   array[i] = new Snack("Popcorn", 50);
                        break;
               case 1:
                    array[i] = new TropicalFruit("Pop", 60, "X");
                    break
               case 2:
                    array[i] = new TropicalFruit("Mango", 50, "XX");/
                    break;
               case 3:
                    array[i] = new Snack("Popcorn", 50);
                    break;
               case 4:
                   array[i] = new TropicalFruit("Apple", 40, "XXX");
                   break;
    }

        // Eat snacks and calculate sum of Calories
        double sum = 0.0;

        for (var x: array)
            sum += x.eat();

        System.out.println("Total Calories are :" + sum);

        System.out.println("=======================================");
        System.out.println("=======================================");

        //array[2] is a reference to an object Tropical Fruit and since it implements the Interface inherited from superclass Food it can use its methods.
        //It will use the interface methods via reference to Interface
        StandardMethods i = array[2];
        i.print();

        i = array[3];
        i.print();

        System.out.println("=========================");
        // Reference to Interface
        DoubleAdjustments in = array[1];
        in.doubleEverything();
        array[1].print();

        in.halfEverything();
        array[1].print();
        System.out.println("=========================");

        // Using override equals method
        System.out.println(array[0] == array[1]);  //comparing references ==> false
        System.out.println(array[0].equals(array[1])); //comparing values ==> true

        // Another example is by referencing an object to master Class Object. The object does not change values only reference changes.
        Object o = array[1];    // or Food f = array[1];
        System.out.println(array[0].equals(o));



    }
}