public class Main {

    public static void main(String[] args) {

        cow molly = new cow("Molly", 500,10,"blue", "brown");
        cow angus = new cow("angus", 600,7,"black", "white");
        cow baby = molly.mate(angus, "clarabelle");
        System.out.println("baby" + baby.name + "has" + baby.eyes + "eyes," + baby.skin + "skin");
    }
}
