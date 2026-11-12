import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for kernel methods.
 *
 *
 */
public class SongTest1 {

    /**
     * Constructor for SongTest1.
     */
    public MusicPlaylist1(Song song) {

    }

    @Test
    public void enqueueSongTest1() {
        Song dripAteez = new Song("Drip", "Ateez");
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1(dripAteez);

        Song wonderlandAteez = new Song("Wonderland", "Ateez");
        ateezPlaylist.enqueueSong(wonderlandAteez);

        MusicPlaylist1 expected = new MusicPlaylist1(dripAteez,
                wonderlandAteez);
        assertEquals(expected, ateezPlaylist);
    }

    @Test
    public void dequeueSongTest1() {
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1(
                new Song("Drip", "Ateez"));
        Song dripAteez = ateezPlaylist.dequeueSong();

        MusicPlaylist1 expected = new MusicPlaylist1();
        assertEquals(expected, ateezPlaylist);
    }

    @Test
    public void lengthSongTest1() {
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1(
                new Song("Drip", "Ateez"));
        int actualLength = ateezPlaylist.lengthSong();

        int expectedLength = 1;
        assertEquals(expectedLength, actualLength);
    }

}
