public abstract class Food implements StandardMethods, DoubleAdjustments{
    private String name;
    private double calories;

    //
    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    abstract double eat();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void doubleEverything() {
        this.calories *= 2;
    }

    @Override
    public void halfEverything() {
        this.calories /= 2;
    }

    //Getters Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
