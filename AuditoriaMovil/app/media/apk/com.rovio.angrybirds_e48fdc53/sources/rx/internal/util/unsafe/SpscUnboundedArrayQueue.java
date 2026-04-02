package rx.internal.util.unsafe;

import java.util.Iterator;
/* loaded from: classes4.dex */
public class SpscUnboundedArrayQueue<E> extends y<E> implements QueueProgressIndicators {
    private static final long b;
    private static final long c;
    private static final long d;
    private static final int e;
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object f = new Object();

    static {
        int arrayIndexScale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            e = 2;
        } else if (8 == arrayIndexScale) {
            e = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        d = UnsafeAccess.UNSAFE.arrayBaseOffset(Object[].class);
        try {
            b = UnsafeAccess.UNSAFE.objectFieldOffset(ab.class.getDeclaredField("producerIndex"));
            try {
                c = UnsafeAccess.UNSAFE.objectFieldOffset(y.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e2) {
                InternalError internalError = new InternalError();
                internalError.initCause(e2);
                throw internalError;
            }
        } catch (NoSuchFieldException e3) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e3);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = roundToPowerOfTwo - 1;
        E[] eArr = (E[]) new Object[roundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j;
        a(roundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        this.producerLookAhead = j - 1;
        a(0L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.producerBuffer;
        long j = this.producerIndex;
        long j2 = this.producerMask;
        long a2 = a(j, j2);
        if (j < this.producerLookAhead) {
            return a(eArr, e2, j, a2);
        }
        int i = this.producerLookAheadStep;
        if (a(eArr, a(i + j, j2)) == null) {
            this.producerLookAhead = (i + j) - 1;
            return a(eArr, e2, j, a2);
        } else if (a(eArr, a(1 + j, j2)) != null) {
            return a(eArr, e2, j, a2);
        } else {
            a(eArr, j, a2, e2, j2);
            return true;
        }
    }

    private boolean a(E[] eArr, E e2, long j, long j2) {
        a(eArr, j2, e2);
        a(1 + j);
        return true;
    }

    private void a(E[] eArr, long j, long j2, E e2, long j3) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j + j3) - 1;
        a(eArr2, j2, e2);
        a(eArr, eArr2);
        a(eArr, j2, f);
        a(j + 1);
    }

    private void a(E[] eArr, E[] eArr2) {
        a(eArr, c(eArr.length - 1), eArr2);
    }

    private E[] a(E[] eArr) {
        return (E[]) ((Object[]) a(eArr, c(eArr.length - 1)));
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long a2 = a(j, j2);
        E e2 = (E) a(eArr, a2);
        boolean z = e2 == f;
        if (e2 != null && !z) {
            a(eArr, a2, (Object) null);
            b(j + 1);
            return e2;
        } else if (z) {
            return a(a(eArr), j, j2);
        } else {
            return null;
        }
    }

    private E a(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        long a2 = a(j, j2);
        E e2 = (E) a(eArr, a2);
        if (e2 == null) {
            return null;
        }
        a(eArr, a2, (Object) null);
        b(1 + j);
        return e2;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E e2 = (E) a(eArr, a(j, j2));
        if (e2 == f) {
            return b(a(eArr), j, j2);
        }
        return e2;
    }

    private E b(E[] eArr, long j, long j2) {
        this.consumerBuffer = eArr;
        return (E) a(eArr, a(j, j2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long b2 = b();
        while (true) {
            long a2 = a();
            long b3 = b();
            if (b2 == b3) {
                return (int) (a2 - b3);
            }
            b2 = b3;
        }
    }

    private void a(int i) {
        this.producerLookAheadStep = Math.min(i / 4, a);
    }

    private long a() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, b);
    }

    private long b() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, c);
    }

    private void a(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, b, j);
    }

    private void b(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, c, j);
    }

    private static long a(long j, long j2) {
        return c(j & j2);
    }

    private static long c(long j) {
        return d + (j << e);
    }

    private static void a(Object[] objArr, long j, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j, obj);
    }

    private static <E> Object a(E[] eArr, long j) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return a();
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return b();
    }
}
