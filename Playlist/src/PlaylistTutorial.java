public class PlaylistTutorial extends Playlist{
     String subject;

    PlaylistTutorial(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    public String recommendation() {
        if(nVideos == 0) {
            System.out.println("Cannot recommend");
            return null;
        }
        else
            return videos[0];
    }


}
