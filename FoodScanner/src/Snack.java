public class Snack extends Food implements StandardMethods{

    public Snack() {
    }

    Snack(String name, double calories) {
        super(name,calories);
    }
    @Override
    double eat() {
        System.out.println("I am eating Snack : " + getName());
        return getCalories();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;             //checks if references are equal
        if (obj == null || getClass() != obj.getClass()) return false;
        Snack that = (Snack) obj;
        return getName().equals(that.getName()) &&       //here we compare two strings so remove (==) and put .equals()
                getCalories() == that.getCalories();
    }

    // object of Snack will return a copy of itself
    @Override
    public Object copy() {
        return new Snack(this.getName(),this.getCalories());
    }

    @Override
    public String toString() {
        return "Snack: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

}