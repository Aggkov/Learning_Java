import java.util.Random;

public class cow {
    String name;
    int weight;
    int hunger;
    String eyes;
    String skin;

    cow(String name, int weight, int hunger, String eyes, String skin){  //constructor
        this.name=name;
        this.weight=weight;
        this.hunger=hunger;
        this.eyes=eyes;
        this.skin=skin;
    }

    cow(String name) {
        this.name = name;
    }


    // method of mating
    cow mate(cow m, String babyName) {
        // new object with parameter of babyName
        cow baby = new cow(babyName);
        baby.weight = 50;
        baby.hunger = 10;

        Random r = new Random();
        if(r.nextInt(2) == 0)
            baby.skin = this.skin;
        else
            baby.skin = m.skin;
        if(r.nextInt(2) == 0)
            baby.eyes = this.eyes;
        else
            baby.eyes = m.eyes;

        return baby;

    }
}
