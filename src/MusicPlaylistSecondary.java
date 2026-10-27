package components.queue;

/**
* Layered implementations of secondary methods for {@code Queue}.
*
* <p>
* Assuming execution-time performance of O(1) for method {@code iterator} and
* its return value's method {@code next}, execution-time performance of
* {@code front} as implemented in this class is O(1). Execution-time
* performance of {@code replaceFront} and {@code flip} as implemented in this
* class is O(|{@code this}|). Execution-time performance of {@code append} as
* implemented in this class is O(|{@code q}|). Execution-time performance of
* {@code sort} as implemented in this class is O(|{@code this}| log
* |{@code this}|) expected, O(|{@code this}|^2) worst case. Execution-time
* performance of {@code rotate} as implemented in this class is
* O({@code distance} mod |{@code this}|).
*
* @param <T>
 *            type of {@code Queue} entries
 */

public abstract class MusicPlaylistSecondary<T> implements MusicPlaylist<T> {
    ...

}