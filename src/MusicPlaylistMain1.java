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
            out.println(
                    "What would you like to do next? (add, remove, view, length, exit)");
            nextMove = in.nextLine();

            if (nextMove.equals("add")) {
                //Add a song to the playlist
                out.println("Please enter the song you would like to add: ");
                String newSong = in.nextLine();

                out.println(
                        "Please enter the artist of the song you would like to add: ");
                String newSongArtist = in.nextLine();
                Song newSongAdded = new Song(newSong, newSongArtist);
                playlist.enqueueSong(newSongAdded);

            } else if (nextMove.equals("remove")) {
                //Remove a song from the playlist
                if (playlist.length() == 0) {
                    out.println("The playlist is empty. No song to remove.");
                } else {
                    Song removedSong = playlist.dequeueSong();
                    out.println("Removed song: " + removedSong);
                }
            } else if (nextMove.equals("view")) {
                //View the current playlist
                out.println("Current playlist: ");
                for (int i = 0; i < playlist.length(); i++) {
                    Song currectSong = playlist.dequeueSong();
                    out.println(currectSong);
                    playlist.enqueueSong(currectSong);
                }

            } else if (nextMove.equals("length")) {
                out.println("Current playlist length: " + playlist.length());

            } else if (!nextMove.equals("exit")) {
                out.println(
                        "Thank you for using the City Pop Playlist. Goodbye!");
            }
        }
    }
}
