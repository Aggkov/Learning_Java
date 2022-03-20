import java.util.Scanner;

public class TropicalFruit extends Food {
    String typeOfFruit;

    public TropicalFruit() {
    }

    TropicalFruit(String name, double calories, String typeOfFruit) {
        super(name,calories);
        this.typeOfFruit = typeOfFruit;
    }

    @Override
    double eat() {
        System.out.println("I am eating Tropical Fruit: " + getName());
        return getCalories();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;             //checks if references are equal
        if (obj == null || getClass() != obj.getClass()) return false;
        TropicalFruit that = (TropicalFruit) obj;
        return getName().equals(that.getName()) &&       //here we compare two strings so remove (==) and put .equals()
                getCalories() == that.getCalories() &&
                typeOfFruit.equals(that.typeOfFruit);


    }


    @Override
    public Object copy() {
        return new TropicalFruit(this.getName(), this.getCalories(), this.typeOfFruit);
    }

    @Override
    public void read(Scanner sc) {
        super.read(sc);
        this.typeOfFruit = sc.nextLine();
    }

    @Override
    public String toString() {
        return "TropicalFruit{" +
                "typeOfFruit='" + typeOfFruit + '\'' +
                '}' + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
