import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for kernel methods.
 *
 *
 */
public class SongTest1 {

@Test
public void enqueueSongTest1() { 
    MusicPlaylist1 ateezPlaylist = new MusicPlaylist1();
    Song dripAteez = new Song("Drip", "Ateez");
    ateezPlaylist.enqueueSong(dripAteez);


    MusicPlaylist1 expected = new MusicPlaylist1(new Song("Drip", "Ateez");  
    assertEquals(expected, ateezPlaylist); 
    }

@Test
public void dequeueSongTest1() { 
    MusicPlaylist1 ateezPlaylist = new MusicPlaylist1(new Song("Drip", "Ateez"));
    Song dripAteez = ateezPlaylist.dequeueSong();

    MusicPlaylist1 expected = new MusicPlaylist1();  
    assertEquals(expected, ateezPlaylist); 
}

@Test
public void lengthSongTest1() { 
    MusicPlaylist1 ateezPlaylist = new MusicPlaylist1(new Song("Drip", "Ateez"));
    int actualLength = ateezPlaylist.lengthSong();

    int expectedLength = 1;  
    assertEquals(expectedLength, actualLength); 
}

}
