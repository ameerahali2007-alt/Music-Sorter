import java.util.Comparator;

/**
 *
 * MusicPlaylistSecondary.
 */
public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    @Override
    public void flipList() {

        while (this.length() > 1) {
            Song song = this.dequeueSong();
            // recursively flip the list
            this.flipList();
            this.enqueueSong(song);
        }

    }

    @Override
    public Song frontOfList(MusicPlaylist s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";

        return s.dequeueSong();
    }

    @Override
    public void sort(Comparator<Song> order) {
        assert order != null : "Violation of: order is not null";

        MusicPlaylist sorted = this.newInstance();
        while (this.length() > 0) {
            Song min = this.dequeueSong();

            for (int i = 0; i < sorted.length() - 1; i++) {
                // removing the new front
                Song compareMin = sorted.dequeueSong();
                if (order.compare(min, compareMin) < 0) {
                    this.enqueueSong(min);
                    min = compareMin;
                } else {
                    this.enqueueSong(compareMin);
                }
                this.transferFrom(sorted);
            }

        }

    }

    @Override
    public Song replaceFront(Song x) {
        assert x != null : "Violation of: x is not null";

        Song oldFront = this.dequeueSong();
        this.enqueueSong(x);
        return oldFront;

    }

    // Think about Rotate.

}
