package rx.internal.util.unsafe;
/* loaded from: classes4.dex */
abstract class r<E> extends ConcurrentCircularArrayQueue<E> {
    private static final Integer a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public r(int i) {
        super(i);
        this.lookAheadStep = Math.min(i / 4, a.intValue());
    }
}
