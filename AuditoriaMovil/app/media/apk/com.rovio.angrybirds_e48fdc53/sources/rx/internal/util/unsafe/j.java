package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class j<E> extends h<E> {
    private static final long a = UnsafeAccess.addressOf(j.class, "producerIndex");
    private volatile long producerIndex;

    public j(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, a, j, j2);
    }
}
