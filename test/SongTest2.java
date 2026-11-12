import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for MusicPlaylistSecondary.
 *
 *
 */
public class SongTest2 {

    @Test
    public void flipListTest1() {
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1();
        Song dripAteez = new Song("Drip", "Ateez");
        Song halaziaAteez = new Song("Halazia", "Ateez");
        ateezPlaylist.enqueueSong(dripAteez);
        ateezPlaylist.enqueueSong(halaziaAteez);

        ateezPlaylist.flipList();

        MusicPlaylist1 expected = new MusicPlaylist1();
        expected.enqueueSong(halaziaAteez);
        expected.enqueueSong(dripAteez);

        assertEquals(expected, ateezPlaylist);
    }

    @Test
    public void frontOfListTest1() {
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1();
        Song dripAteez = new Song("Drip", "Ateez");
        Song halaziaAteez = new Song("Halazia", "Ateez");
        ateezPlaylist.enqueueSong(dripAteez);
        ateezPlaylist.enqueueSong(halaziaAteez);

        Song frontSong = ateezPlaylist.frontOfList();

        Song expected = dripAteez;
        assertEquals(expected, frontSong);
    }

    @Test
    public void replaceFrontTest1() {
        MusicPlaylist1 ateezPlaylist = new MusicPlaylist1();
        Song dripAteez = new Song("Drip", "Ateez");
        ateezPlaylist.enqueueSong(dripAteez);

        Song halaziaAteez = new Song("Halazia", "Ateez");
        ateezPlaylist.replaceFront(halaziaAteez);

        MusicPlaylist1 expected = new MusicPlaylist1();
        expected.enqueueSong(halaziaAteez);

        assertEquals(expected, ateezPlaylist);
    }
}
