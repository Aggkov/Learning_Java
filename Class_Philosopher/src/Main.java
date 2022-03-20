public class Main {

    public static void main(String[] args) {
        Philosopher Plato;
        Plato = new Philosopher();

        Plato.name = "Plato";
        Plato.era = "Ancient Greek";
        Plato.books[0] = "The Republic";
        Plato.books[1] = "Phaedon";
        Plato.nBooks = 2;
        Plato.school = "Platonism";


        Philosopher spinoza;
        spinoza = new Philosopher();

        spinoza.name = "spinoza";
        spinoza.era = "netherlands";
        spinoza.books[0] = "ethics";
        spinoza.books[1] = "Political treatise";
        spinoza.nBooks = 2;
        spinoza.school = "rationalism";

        Plato.print();
        spinoza.print();
        
    }
}
