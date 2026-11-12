import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Main class for the Music Playlist application.
 */
public class MusicPlaylistMain2 {
    /**
     * Entry point for the Music Playlist application.
     *
     * @param args
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        //This version is for the clients:

        out.println(
                "Hello, to begin, please enter the name of the playlist you would like to create: ");
        String playlistName = in.nextLine();

        out.println("Welcome to the " + playlistName + " Playlist!");
        MusicPlaylist1 playlist = new MusicPlaylist1();

        out.println(
                "Please enter the first song you would like to add to the playlist: ");
        String firstSongName = in.nextLine();
        out.println("Please enter the name of the artis: ");
        String firstSongArtist = in.nextLine();
        Song firstSong = new Song(firstSongName, firstSongArtist);
        playlist.enqueueSong(firstSong);

        String nextMove = "";

        while (!nextMove.equals("exit")) {
            out.println(
                    "What would you like to do next? (add, remove, view, length, exit)");
            nextMove = in.nextLine();

            if (nextMove.equals("add")) {
                //Add a song to the playlist
                out.println("Please enter the song you would like to add: ");

                String newSongTitle = in.nextLine();
                out.println(
                        "Please enter the artist of the song you would like to add: ");
                String newSongArtist = in.nextLine();
                Song newSong = new Song(newSongTitle, newSongArtist);
                playlist.enqueueSong(newSong);

            } else if (nextMove.equals("remove")) {
                //Remove a song from the playlist
                Song removedSong = playlist.dequeueSong();
                if (playlist.length() == 0) {
                    out.println("The playlist is empty. No song to remove.");
                } else {
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
                //length of the current playlist
                out.println("Current playlist length: " + playlist.length());

            } else if (!nextMove.equals("exit")) {
                out.println("Thank you for using the " + playlistName
                        + " Playlist. Goodbye!");
            }
        }
    }
}
