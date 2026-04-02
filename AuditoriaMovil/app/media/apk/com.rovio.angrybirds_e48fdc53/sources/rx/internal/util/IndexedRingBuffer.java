package rx.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Subscription;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class IndexedRingBuffer<E> implements Subscription {
    static final int c;
    private static final ObjectPool<IndexedRingBuffer<?>> f = new ObjectPool<IndexedRingBuffer<?>>() { // from class: rx.internal.util.IndexedRingBuffer.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // rx.internal.util.ObjectPool
        /* renamed from: a */
        public IndexedRingBuffer<?> createObject() {
            return new IndexedRingBuffer<>();
        }
    };
    private final a<E> d = new a<>();
    private final b e = new b();
    final AtomicInteger a = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    static {
        int i = 128;
        if (PlatformDependent.isAndroid()) {
            i = 8;
        }
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        c = i;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return (IndexedRingBuffer<T>) f.borrowObject();
    }

    public void releaseToPool() {
        int i = this.a.get();
        a<E> aVar = this.d;
        int i2 = 0;
        loop0: while (aVar != null) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < c) {
                if (i3 >= i) {
                    break loop0;
                }
                aVar.a.set(i4, null);
                i4++;
                i3++;
            }
            aVar = aVar.b.get();
            i2 = i3;
        }
        this.a.set(0);
        this.b.set(0);
        f.returnObject(this);
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    IndexedRingBuffer() {
    }

    public int add(E e) {
        int a2 = a();
        if (a2 < c) {
            this.d.a.set(a2, e);
        } else {
            b(a2).a.set(a2 % c, e);
        }
        return a2;
    }

    public E remove(int i) {
        E andSet;
        if (i < c) {
            andSet = this.d.a.getAndSet(i, null);
        } else {
            andSet = b(i).a.getAndSet(i % c, null);
        }
        c(i);
        return andSet;
    }

    private b a(int i) {
        if (i < c) {
            return this.e;
        }
        int i2 = i / c;
        b bVar = this.e;
        int i3 = 0;
        while (i3 < i2) {
            i3++;
            bVar = bVar.a();
        }
        return bVar;
    }

    private a<E> b(int i) {
        if (i < c) {
            return this.d;
        }
        int i2 = i / c;
        a<E> aVar = this.d;
        int i3 = 0;
        while (i3 < i2) {
            i3++;
            aVar = aVar.a();
        }
        return aVar;
    }

    private synchronized int a() {
        int andIncrement;
        int b2 = b();
        if (b2 >= 0) {
            if (b2 < c) {
                andIncrement = this.e.a(b2, -1);
            } else {
                andIncrement = a(b2).a(b2 % c, -1);
            }
            if (andIncrement == this.a.get()) {
                this.a.getAndIncrement();
            }
        } else {
            andIncrement = this.a.getAndIncrement();
        }
        return andIncrement;
    }

    private synchronized int b() {
        int i;
        while (true) {
            int i2 = this.b.get();
            if (i2 <= 0) {
                i = -1;
                break;
            } else if (this.b.compareAndSet(i2, i2 - 1)) {
                i = i2 - 1;
                break;
            }
        }
        return i;
    }

    private synchronized void c(int i) {
        int andIncrement = this.b.getAndIncrement();
        if (andIncrement < c) {
            this.e.b(andIncrement, i);
        } else {
            a(andIncrement).b(andIncrement % c, i);
        }
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }

    public int forEach(Func1<? super E, Boolean> func1, int i) {
        int a2 = a(func1, i, this.a.get());
        if (i > 0 && a2 == this.a.get()) {
            return a(func1, 0, i);
        }
        if (a2 != this.a.get()) {
            return a2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r3 = r3.b.get();
        r1 = r2;
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(rx.functions.Func1<? super E, java.lang.Boolean> r6, int r7, int r8) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r5.a
            int r4 = r0.get()
            rx.internal.util.IndexedRingBuffer$a<E> r0 = r5.d
            int r1 = rx.internal.util.IndexedRingBuffer.c
            if (r7 < r1) goto L4f
            rx.internal.util.IndexedRingBuffer$a r0 = r5.b(r7)
            int r1 = rx.internal.util.IndexedRingBuffer.c
            int r1 = r7 % r1
            r3 = r0
            r0 = r1
            r1 = r7
        L17:
            if (r3 == 0) goto L4d
            r2 = r1
            r1 = r0
        L1b:
            int r0 = rx.internal.util.IndexedRingBuffer.c
            if (r1 >= r0) goto L40
            if (r2 >= r4) goto L23
            if (r2 < r8) goto L24
        L23:
            return r2
        L24:
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r3.a
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L33
        L2c:
            int r0 = r1 + 1
            int r1 = r2 + 1
            r2 = r1
            r1 = r0
            goto L1b
        L33:
            java.lang.Object r0 = r6.call(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2c
            goto L23
        L40:
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.IndexedRingBuffer$a<E>> r0 = r3.b
            java.lang.Object r0 = r0.get()
            rx.internal.util.IndexedRingBuffer$a r0 = (rx.internal.util.IndexedRingBuffer.a) r0
            r7 = 0
            r3 = r0
            r1 = r2
            r0 = r7
            goto L17
        L4d:
            r2 = r1
            goto L23
        L4f:
            r3 = r0
            r1 = r7
            r0 = r7
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.IndexedRingBuffer.a(rx.functions.Func1, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<E> {
        final AtomicReferenceArray<E> a = new AtomicReferenceArray<>(IndexedRingBuffer.c);
        final AtomicReference<a<E>> b = new AtomicReference<>();

        a() {
        }

        a<E> a() {
            if (this.b.get() != null) {
                return this.b.get();
            }
            a<E> aVar = new a<>();
            return !this.b.compareAndSet(null, aVar) ? this.b.get() : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b {
        private final AtomicIntegerArray a = new AtomicIntegerArray(IndexedRingBuffer.c);
        private final AtomicReference<b> b = new AtomicReference<>();

        b() {
        }

        public int a(int i, int i2) {
            return this.a.getAndSet(i, i2);
        }

        public void b(int i, int i2) {
            this.a.set(i, i2);
        }

        b a() {
            if (this.b.get() != null) {
                return this.b.get();
            }
            b bVar = new b();
            return !this.b.compareAndSet(null, bVar) ? this.b.get() : bVar;
        }
    }
}
