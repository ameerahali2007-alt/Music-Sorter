import java.util.Comparator;

/**
 *
 * MusicPlaylistStandard.
 *
 */
public interface MusicPlaylist extends MusicPlaylistKernel {

    /**
     * Flips the order of the songs in the given playlist.
     *
     */
    void flipList();

    /**
     *
     * @param s
     * @return T
     */
    Song frontOfList(MusicPlaylist s);

    /**
     *
     * @param order
     */
    void sort(Comparator<Song> order);

    /**
     *
     * @param x
     * @return T
     */
    Song replaceFront(Song x);

}
