package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class p<E> extends l<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(p.class, "producerIndex");
    private volatile long producerIndex;

    /* JADX INFO: Access modifiers changed from: protected */
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void soTail(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    public p(int i) {
        super(i);
    }
}
