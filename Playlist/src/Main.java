public class Main {

    public static void main(String[] args) {
        Playlist p = new Playlist("Music");
        PlaylistTutorial t = new PlaylistTutorial("Java", "Programming");

        p.addVideo("Rock");
        p.addVideo("Pop");
        p.addVideo("House");
        p.addVideo("Country");
        System.out.println(p);

        System.out.println("\nRecommendation");
        System.out.println(p.recommendation());

        //Subclass inherits method addVideo
        t.addVideo("Video 01");
        t.addVideo("Video 02");
        t.addVideo("Video 03");

        System.out.println("\nRecommendation for PlaylistTutorial");
        //method override
        System.out.println(t.recommendation());

    }
}