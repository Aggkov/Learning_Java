public class Main {

    public static void main(String[] args) {
        cow molly = new cow();

        // hegge has now her own room in memory
        cow hegge = new cow();
        hegge.hunger = molly.hunger;
        hegge.weight = molly.weight;

        molly.weight = 300;
        hegge.weight = 600;

        System.out.println(molly.weight);
        System.out.println(hegge.weight);
    }
}
