public class Dog {
        String name;
        int weight;
        String breed;
        int mood;

        Dog() {
            weight = 10;
            breed =  "Terrier";
            mood = 5;
        }

        void eat(int quantity) {
            mood += quantity;
            if(mood > 10)
                mood = 10;
        }
        void bark() {
            if(mood > 5)
                System.out.println("Woof Woof");
            else
                System.out.println("Woof");
        }
        void walk() {
            mood++;
            if(mood > 10)
                mood = 10;
        }
    }

