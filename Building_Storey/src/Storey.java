public class Storey {
    private Flat[] flats;

    Storey(int cFlats) {
        flats = new Flat[cFlats];           //initialize flats array
        for(int i = 0; i < cFlats; i++)
            flats[i] = new Flat();
    }

    //method adds people to flat array
    public void addPeopleToFlats(int flat, int people) {
        flats[flat].addPeople(people);
    }

    public void printPeople() {
        for(int i = 0; i < flats.length; i++)
            System.out.println("\tFlat " + i + ": " + flats[i].getPeople());
    }


}
