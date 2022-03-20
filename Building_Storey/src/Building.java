public class Building {
    //declare reference to array
    private Storey[] storeys;

    //constructor with amount of storeys and flats that the building will have
    Building(int cStoreys, int cFlats) {
        storeys = new Storey[cStoreys];             //commits memory for array (and stores it to above reference)
        for(int i =0; i < cStoreys; i++)
            storeys[i] = new Storey(cFlats);

    }
    //method Adds people in a Flat of a Storey
    void addPeople(int storey,int flat, int people) {
        storeys[storey].addPeopleToFlats(flat, people);
    }
    void printPeople() {
        for(int i = 0; i < storeys.length; i++) {
            System.out.println("Storey " + i);
            storeys[i].printPeople();
            System.out.println();
        }

    }


}
