package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes4.dex */
public final class SpscAtomicArrayQueue<E> extends a<E> {
    private static final Integer e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final AtomicLong a;
    long b;
    final AtomicLong c;
    final int d;

    @Override // rx.internal.util.atomic.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public SpscAtomicArrayQueue(int i) {
        super(i);
        this.a = new AtomicLong();
        this.c = new AtomicLong();
        this.d = Math.min(i / 4, e.intValue());
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long j = this.a.get();
        int calcElementOffset = calcElementOffset(j, i);
        if (j >= this.b) {
            int i2 = this.d;
            if (lvElement(atomicReferenceArray, calcElementOffset(i2 + j, i)) == null) {
                this.b = i2 + j;
            } else if (lvElement(atomicReferenceArray, calcElementOffset) != null) {
                return false;
            }
        }
        soElement(atomicReferenceArray, calcElementOffset, e2);
        a(1 + j);
        return true;
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.c.get();
        int calcElementOffset = calcElementOffset(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E lvElement = lvElement(atomicReferenceArray, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(atomicReferenceArray, calcElementOffset, null);
        b(j + 1);
        return lvElement;
    }

    @Override // java.util.Queue
    public E peek() {
        return lvElement(calcElementOffset(this.c.get()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long a = a();
        while (true) {
            long b = b();
            long a2 = a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == a();
    }

    private void a(long j) {
        this.a.lazySet(j);
    }

    private void b(long j) {
        this.c.lazySet(j);
    }

    private long a() {
        return this.c.get();
    }

    private long b() {
        return this.a.get();
    }
}
