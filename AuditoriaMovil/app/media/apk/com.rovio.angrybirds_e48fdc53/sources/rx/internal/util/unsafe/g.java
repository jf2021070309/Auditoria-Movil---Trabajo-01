package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class g<E> extends i<E> {
    private static final long a = UnsafeAccess.addressOf(g.class, "consumerIndex");
    private volatile long consumerIndex;

    public g(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, a, j, j2);
    }
}
