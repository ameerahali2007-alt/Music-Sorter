import java.util.Iterator;

/**
 * Represents a music playlist that extends MusicPlaylistSecondary.
 * MusicPlaylist class extends MusicPlaylistSecondary.
 *
 */
public class MusicPlaylist1 extends MusicPlaylistSecondary {

    @Override
    public final void enqueueSong(Song x) {
        // TODO Auto-generated method stub
        this.enqueueSong(x);

    }

    @Override
    public final Song dequeueSong() {
        // TODO Auto-generated method stub
        return this.dequeueSong();

    }

    @Override
    public final int length() {
        // TODO Auto-generated method stub
        return this.length();
    }

    @Override
    public final void clear() {
        // TODO Auto-generated method stub
        this.clear();

    }

    @Override
    public final MusicPlaylist newInstance() {
        // TODO Auto-generated method stub
        return new MusicPlaylist1();

    }

    @Override
    public final void transferFrom(MusicPlaylist arg0) {
        // TODO Auto-generated method stub
        this.transferFrom(arg0);

    }

    @Override
    public final Iterator<Song> iterator() {
        // TODO Auto-generated method stub
        return this.iterator();
    }

}