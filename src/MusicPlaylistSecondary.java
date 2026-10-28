import java.util.Comparator;

public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    /**
     *
     * No-argument constructor.
     *
     */

    public MusicPlaylistSecondary() {
        super();
    }

    @Override
    public void flipList(MusicPlaylist<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";

        // TODO - fill in body

        while (s.length() >= 0) {
        }

    }

    @Override
    public MusicPlaylist<T> frontOfList(MusicPlaylist<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";

        // TODO - fill in body

    }

    @Override
    public void sort(Comparator<T> order) {
        assert order != null : "Violation of: order is not null";

        // TODO - fill in body

    }

    @Override
    public MusicPlaylist<T> replaceFront(T x) {
        assert x != null : "Violation of: x is not null";

        // TODO - fill in body

    }

}