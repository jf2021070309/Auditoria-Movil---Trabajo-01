package com.amazon.aps.iva.z5;

import com.amazon.aps.iva.z5.e;
import com.amazon.aps.iva.z5.f;
import com.amazon.aps.iva.z5.g;
import java.util.ArrayDeque;
/* compiled from: SimpleDecoder.java */
/* loaded from: classes.dex */
public abstract class h<I extends f, O extends g, E extends e> implements d<I, O, E> {
    public final a a;
    public final Object b = new Object();
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;
    public I i;
    public com.amazon.aps.iva.q7.f j;
    public boolean k;
    public boolean l;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: classes.dex */
    public class a extends Thread {
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.q7.c cVar) {
            super("ExoPlayer:SimpleDecoder");
            this.b = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            h hVar = this.b;
            hVar.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (hVar.f());
        }
    }

    public h(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new com.amazon.aps.iva.q7.g();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new com.amazon.aps.iva.q7.b((com.amazon.aps.iva.q7.c) this);
        }
        a aVar = new a((com.amazon.aps.iva.q7.c) this);
        this.a = aVar;
        aVar.start();
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void a(com.amazon.aps.iva.q7.g gVar) throws e {
        boolean z;
        synchronized (this.b) {
            try {
                com.amazon.aps.iva.q7.f fVar = this.j;
                if (fVar == null) {
                    boolean z2 = true;
                    if (gVar == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.cq.b.t(z);
                    this.c.addLast(gVar);
                    if (this.c.isEmpty() || this.h <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.aps.iva.z5.d
    public final Object c() throws e {
        synchronized (this.b) {
            try {
                com.amazon.aps.iva.q7.f fVar = this.j;
                if (fVar == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return this.d.removeFirst();
                }
                throw fVar;
            } finally {
            }
        }
    }

    @Override // com.amazon.aps.iva.z5.d
    public final Object d() throws e {
        boolean z;
        I i;
        synchronized (this.b) {
            try {
                com.amazon.aps.iva.q7.f fVar = this.j;
                if (fVar == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.cq.b.C(z);
                    int i2 = this.g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.e;
                        int i3 = i2 - 1;
                        this.g = i3;
                        i = iArr[i3];
                    }
                    this.i = i;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public abstract com.amazon.aps.iva.q7.f e(f fVar, g gVar, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque<I extends com.amazon.aps.iva.z5.f> r1 = r7.c     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1a
            int r1 = r7.h     // Catch: java.lang.Throwable -> L17
            if (r1 <= 0) goto L1a
            r1 = r3
            goto L1b
        L17:
            r1 = move-exception
            goto Laf
        L1a:
            r1 = r2
        L1b:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r7.b     // Catch: java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.Throwable -> L17
            goto L3
        L23:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L29:
            java.util.ArrayDeque<I extends com.amazon.aps.iva.z5.f> r1 = r7.c     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L17
            com.amazon.aps.iva.z5.f r1 = (com.amazon.aps.iva.z5.f) r1     // Catch: java.lang.Throwable -> L17
            O extends com.amazon.aps.iva.z5.g[] r4 = r7.f     // Catch: java.lang.Throwable -> L17
            int r5 = r7.h     // Catch: java.lang.Throwable -> L17
            int r5 = r5 - r3
            r7.h = r5     // Catch: java.lang.Throwable -> L17
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L17
            boolean r5 = r7.k     // Catch: java.lang.Throwable -> L17
            r7.k = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = 4
            boolean r6 = r1.i(r0)
            if (r6 == 0) goto L4a
            r4.h(r0)
            goto L83
        L4a:
            boolean r0 = r1.j()
            if (r0 == 0) goto L55
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.h(r0)
        L55:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.i(r0)
            if (r6 == 0) goto L60
            r4.h(r0)
        L60:
            com.amazon.aps.iva.q7.f r0 = r7.e(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L65 java.lang.RuntimeException -> L6e
            goto L77
        L65:
            r0 = move-exception
            com.amazon.aps.iva.q7.f r5 = new com.amazon.aps.iva.q7.f
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L76
        L6e:
            r0 = move-exception
            com.amazon.aps.iva.q7.f r5 = new com.amazon.aps.iva.q7.f
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L76:
            r0 = r5
        L77:
            if (r0 == 0) goto L83
            java.lang.Object r5 = r7.b
            monitor-enter(r5)
            r7.j = r0     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r2
        L80:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r0
        L83:
            java.lang.Object r2 = r7.b
            monitor-enter(r2)
            boolean r0 = r7.k     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L8e
            r4.k()     // Catch: java.lang.Throwable -> Lac
            goto L9d
        L8e:
            boolean r0 = r4.j()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L98
            r4.k()     // Catch: java.lang.Throwable -> Lac
            goto L9d
        L98:
            java.util.ArrayDeque<O extends com.amazon.aps.iva.z5.g> r0 = r7.d     // Catch: java.lang.Throwable -> Lac
            r0.addLast(r4)     // Catch: java.lang.Throwable -> Lac
        L9d:
            r1.k()     // Catch: java.lang.Throwable -> Lac
            int r0 = r7.g     // Catch: java.lang.Throwable -> Lac
            int r4 = r0 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> Lac
            I extends com.amazon.aps.iva.z5.f[] r4 = r7.e     // Catch: java.lang.Throwable -> Lac
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lac
            return r3
        Lac:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lac
            throw r0
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z5.h.f():boolean");
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            I i = this.i;
            if (i != null) {
                i.k();
                int i2 = this.g;
                this.g = i2 + 1;
                this.e[i2] = i;
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                I removeFirst = this.c.removeFirst();
                removeFirst.k();
                int i3 = this.g;
                this.g = i3 + 1;
                this.e[i3] = removeFirst;
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().k();
            }
        }
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
