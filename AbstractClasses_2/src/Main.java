public class Main {

    public static void main(String[] args) {
        //check Scripts class
        Scripts s = new Scripts();

        Cat c = new Cat();
        PersianCat cc = new PersianCat();
        Dog d = new Dog();
        Doberman dd = new Doberman();
        KingDoberman kd = new KingDoberman();



        s.makeDoubleSound(c);
        s.makeDoubleSound(cc);
        s.makeDoubleSound(d);
        s.makeDoubleSound(kd);
    }

    /*
        c.makeSound();
        cc.makeSound();
        d.makeSound();
        dd.makeSound();
        kd.makeSound();

    }

        */
}
