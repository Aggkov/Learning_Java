public class cow {
    int weight;
    int hunger;

    cow() {
        weight = 500;
        hunger = 10;
    }

    void express() {
        if(hunger > 5)
            System.out.println("MOOOOOW");
        else
            System.out.println("MOOW");
    }
}
