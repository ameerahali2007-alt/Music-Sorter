import java.util.Comparator;

/**
 *
 * MusicPlaylistStandard.
 *
 * @param <T>
 */
public interface MusicPlaylist<T> extends MusicPlaylistKernel<T> {

    /**
     * Flips the order of the songs in the given playlist.
     *
     * @param s
     */
    void flipList(MusicPlaylist<T> s);

    /**
     *
     * @param s
     * @return
     */
    MusicPlaylist<T> frontOfList(MusicPlaylist<T> s);

    /**
     *
     * @param order
     */
    void sort(Comparator<T> order);

    /**
     *
     * @param x
     * @return
     */
    MusicPlaylist1<T> replaceFront(T x);

}
