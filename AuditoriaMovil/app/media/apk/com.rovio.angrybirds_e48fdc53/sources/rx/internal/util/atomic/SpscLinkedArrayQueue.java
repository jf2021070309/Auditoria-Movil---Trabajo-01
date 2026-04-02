package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;
/* loaded from: classes4.dex */
public final class SpscLinkedArrayQueue<T> implements Queue<T> {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    final AtomicLong b;
    int c;
    long d;
    int e;
    AtomicReferenceArray<Object> f;
    int g;
    AtomicReferenceArray<Object> h;
    final AtomicLong i;

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        a(roundToPowerOfTwo);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = i2 - 1;
        this.b = new AtomicLong();
        this.i = new AtomicLong();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long c = c();
        int i = this.e;
        int a2 = a(c, i);
        if (c < this.d) {
            return a(atomicReferenceArray, t, c, a2);
        }
        int i2 = this.c;
        if (a(atomicReferenceArray, a(i2 + c, i)) == null) {
            this.d = (i2 + c) - 1;
            return a(atomicReferenceArray, t, c, a2);
        } else if (a(atomicReferenceArray, a(1 + c, i)) == null) {
            return a(atomicReferenceArray, t, c, a2);
        } else {
            a(atomicReferenceArray, c, a2, t, i);
            return true;
        }
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        a(atomicReferenceArray, i, t);
        a(1 + j2);
        return true;
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + j3) - 1;
        a(atomicReferenceArray2, i, t);
        a(atomicReferenceArray, atomicReferenceArray2);
        a(atomicReferenceArray, i, j);
        a(j2 + 1);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        a(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) a(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long d = d();
        int i = this.g;
        int a2 = a(d, i);
        T t = (T) a(atomicReferenceArray, a2);
        boolean z = t == j;
        if (t != null && !z) {
            a(atomicReferenceArray, a2, (Object) null);
            b(1 + d);
            return t;
        } else if (z) {
            return a(a(atomicReferenceArray), d, i);
        } else {
            return null;
        }
    }

    private T a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        this.h = atomicReferenceArray;
        int a2 = a(j2, i);
        T t = (T) a(atomicReferenceArray, a2);
        if (t == null) {
            return null;
        }
        a(atomicReferenceArray, a2, (Object) null);
        b(1 + j2);
        return t;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long d = d();
        int i = this.g;
        T t = (T) a(atomicReferenceArray, a(d, i));
        if (t == j) {
            return b(a(atomicReferenceArray), d, i);
        }
        return t;
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    private T b(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        this.h = atomicReferenceArray;
        return (T) a(atomicReferenceArray, a(j2, i));
    }

    @Override // java.util.Collection
    public int size() {
        long b = b();
        while (true) {
            long a2 = a();
            long b2 = b();
            if (b == b2) {
                return (int) (a2 - b2);
            }
            b = b2;
        }
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a() == b();
    }

    private void a(int i) {
        this.c = Math.min(i / 4, a);
    }

    private long a() {
        return this.b.get();
    }

    private long b() {
        return this.i.get();
    }

    private long c() {
        return this.b.get();
    }

    private long d() {
        return this.i.get();
    }

    private void a(long j2) {
        this.b.lazySet(j2);
    }

    private void b(long j2) {
        this.i.lazySet(j2);
    }

    private static int a(long j2, int i) {
        return b(((int) j2) & i);
    }

    private static int b(int i) {
        return i;
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> Object a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long a2 = a();
        int i = this.e;
        if (a(atomicReferenceArray, a(a2 + 2, i)) == null) {
            int a3 = a(a2, i);
            a(atomicReferenceArray, a3 + 1, t2);
            a(atomicReferenceArray, a3, t);
            a(a2 + 2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        int a4 = a(a2, i);
        a(atomicReferenceArray2, a4 + 1, t2);
        a(atomicReferenceArray2, a4, t);
        a(atomicReferenceArray, atomicReferenceArray2);
        a(atomicReferenceArray, a4, j);
        a(a2 + 2);
        return true;
    }
}
