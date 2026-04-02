package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class s<E> extends u<E> {
    protected static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(s.class, "consumerIndex");
    protected long consumerIndex;

    public s(int i) {
        super(i);
    }
}
