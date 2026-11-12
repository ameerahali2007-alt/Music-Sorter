import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Main class for the Music Playlist application.
 */
public class MusicPlaylistMain1 {
    /**
     * Entry point for the Music Playlist application.
     *
     * @param args
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        //This version is for the me!:

        out.println("Welcome to the City Pop Playlist!");
        MusicPlaylist1 playlist = new MusicPlaylist1();
        playlist.enqueueSong(new Song("Plastic Love", "Mariya Takeuchi"));
        playlist.enqueueSong(new Song("Mayonaka no Door", "Miki Matsubara"));
        playlist.enqueueSong(new Song("Fly-day Chinatown", "Yasuha"));
        playlist.enqueueSong(new Song("4:00 AM", "Taeko Ohnuki"));
        playlist.enqueueSong(new Song("First Love", "Hikaru Utada"));
        playlist.enqueueSong(new Song("Movin'on without you", "Hikaru Utada"));
        playlist.enqueueSong(new Song("Automatic", "Hikaru Utada"));


        String nextMove = "";
        
        while (!nextMove.equals("exit")) {
            out.println("What would you like to do next? (add, remove, view, length, exit)");
            nextMove = in.nextLine();

            if (nextMove.equals("add")) {
                out.println("Please enter the song you would like to add: ");
                Song newSong = in.nextLine();
                playlist.enqueueSong(newSong);
            } else if (nextMove.equals("remove")) {
                Song removedSong = playlist.dequeueSong();
                out.println("Removed song: " + removedSong);
            } else if (nextMove.equals("view")) {
                out.println("Current playlist: ");
                for (Song song : playlist) {
                    out.println(song);
                }
            } else if (nextMove.equals("length")) {
                out.println("Current playlist length: " + playlist.length());
            } else if (!nextMove.equals("exit")) {
                out.println("Thank you for using the City Pop Playlist. Goodbye!");
            }
        }
    }
}
