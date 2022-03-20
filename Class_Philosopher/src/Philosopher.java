public class Philosopher {

    String name;
    String era;
    String[] books;
    int nBooks;        // assisting variable that counts how many books philosopher has
    String school;

    Philosopher() {
        books = new String[5];
    }

    void print() {
        System.out.println("name: " + name);
        System.out.println("era: " + era);
        System.out.print("books: ");
        for(var item: books)
            System.out.print(item + " ");
        System.out.println();
        System.out.println("school: " + school);

    }



}
