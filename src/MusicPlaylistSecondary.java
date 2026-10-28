import java.util.Comparator;

public abstract class MusicPlaylistSecondary implements MusicPlaylist<T> {

    @Override
    public void flipList(MusicPlaylist<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";

        // TODO - fill in body

        while (s.length() >= 0) {
        }

    }

    @Override
    MusicPlaylist<T> frontOfList(MusicPlaylist<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";

        return s.dequeueSong();
    }

    @Override
    public void sort(Comparator<T> order) {
        assert order != null : "Violation of: order is not null";

        MusicPlaylist1<T> sorted = this.newInstance();
        while (this.length() > 0) {
            T min = this.dequeueSong();

            for (int i = 0; i < sorted.length() - 1; i++) {
                //removing the new front
                T compareMin = sorted.dequeueSong();
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
    public MusicPlaylist1<T> replaceFront(T x) {
        assert x != null : "Violation of: x is not null";

        T oldFront = this.dequeueSong();
        this.enqueueSong(x);
        return oldFront;

    }

}