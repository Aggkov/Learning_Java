import java.util.Arrays;
import java.util.Random;


public class Playlist {
    public String title;
    public String[] videos;
    public int nVideos;

    Playlist(String title) {
        this.title = title;
        videos = new String[10];
        nVideos = 0;
    }

    //add video
    public void addVideo(String video) {
        if(nVideos == 10)
            System.out.println("Playlist is full");
        else {
            videos[nVideos] = video;
            nVideos++;
        }
    }

    //recommendation
    public String recommendation() {
        Random r = new Random();
        if(nVideos == 0) {
            System.out.println("No recommendation");
            return null;
        }
        else
            return videos[r.nextInt(nVideos)];


    }

    @Override
    public String toString() {
        String s = "";
        s += title + "\n";
        s += "==================" + "\n";
        for(int i = 0; i < nVideos; i++)
            s += videos[i] + "\n";

        return s;
    }
    /*
        System.out.println(title);
        System.out.println("============");
        for(int i =0; i < nVideos; i++)
            System.out.println(videos[i]);
    }
    */
}