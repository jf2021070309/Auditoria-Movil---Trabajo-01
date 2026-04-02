package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class w<E> extends t<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(w.class, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public w(int i) {
        super(i);
    }
}
