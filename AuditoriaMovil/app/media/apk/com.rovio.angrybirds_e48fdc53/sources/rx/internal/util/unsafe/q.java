package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class q<E> extends o<E> {
    private volatile long a;

    public q(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long lvProducerIndexCache() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void svProducerIndexCache(long j) {
        this.a = j;
    }
}
