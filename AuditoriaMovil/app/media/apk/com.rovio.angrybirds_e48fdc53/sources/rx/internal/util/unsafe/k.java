package rx.internal.util.unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class k<E> extends m<E> {
    protected static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(k.class, "consumerIndex");
    private volatile long consumerIndex;

    public k(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean casHead(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }
}
