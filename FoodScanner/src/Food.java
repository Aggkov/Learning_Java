import java.util.Scanner;

public abstract class Food implements StandardMethods, DoubleAdjustments{
    private String name;
    private double calories;

    //creating default constructor since we will get inputs from read()
    public Food() {

    }

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
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

    abstract double eat();

    @Override
    public void doubleEverything() {
        this.calories *= 2;
    }

    @Override
    public void halfEverything() {
        this.calories /= 2;
    }
    //method reads inputs from keyboard
    public void read(Scanner sc) {
        System.out.print("Give food name please: ");
        this.name = sc.nextLine();

        while(true) {
            System.out.print("Give calories please: ");
            if(sc.hasNextDouble()) {
                this.calories = sc.nextDouble();
                break;
            }
            else
                System.out.print("Need double! ");
                sc.next();
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
