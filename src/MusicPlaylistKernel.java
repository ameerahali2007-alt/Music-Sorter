import components.standard.Standard;

/**
 * First-in-first-out (FIFO) Music Playlist Kernel component with primary
 * methods. (Note: by package-wide convention, all references are non-null.)
 *
 * @param <T>
 *            type of {@code MusicPlaylistKernel} entries
 * @mathmodel type MusicPlaylistKernel is modeled by string of T
 * @initially {@code
* ():
*  ensures
*   this = <>
* }
 * @iterator ~this.seen * ~this.unseen = this
 */

public interface MusicPlaylistKernel<T>
        extends Standard<MusicPlaylist<T>>, Iterable<T> {

    /**
     * Adds {@code x} to the end of {@code this}.
     *
     * @param x
     *            the entry to be added
     * @aliases reference {@code x}
     * @updates this
     * @ensures {@code this = #this * <x>}
     */

    void enqueueSong(T x);

    /**
     * Removes and returns the entry at the front of {@code this}.
     *
     * @return the entry removed
     * @updates this
     * @requires {@code this /= <>}
     * @ensures {@code #this = <dequeueSong> * this}
     */

    T dequeueSong();

    /**
     * Reports length of {@code this}.
     *
     * @return the length of {@code this}
     * @ensures length = |this|
     */
    int length();

}