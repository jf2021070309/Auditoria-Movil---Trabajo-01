package com.amazon.aps.iva.m6;

import android.net.Uri;
import androidx.core.app.NotificationManagerCompat;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.m6.o;
import com.amazon.aps.iva.m6.q;
import com.amazon.aps.iva.q5.a0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.m0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.w;
import com.amazon.aps.iva.t6.m;
import com.amazon.aps.iva.x5.c;
import com.amazon.aps.iva.x5.i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: SegmentDownloader.java */
/* loaded from: classes.dex */
public abstract class u<M extends q<M>> implements o {
    public final com.amazon.aps.iva.w5.i a;
    public final m.a<M> b;
    public final ArrayList<p0> c;
    public final c.a d;
    public final com.amazon.aps.iva.x5.a e;
    public final a0 f;
    public final Executor g;
    public final long h;
    public final ArrayList<w<?, ?>> i;
    public volatile boolean j;

    /* compiled from: SegmentDownloader.java */
    /* loaded from: classes.dex */
    public static final class a implements i.a {
        public final o.a b;
        public final long c;
        public final int d;
        public long e;
        public int f;

        public a(o.a aVar, long j, int i, long j2, int i2) {
            this.b = aVar;
            this.c = j;
            this.d = i;
            this.e = j2;
            this.f = i2;
        }

        public final float a() {
            long j = this.c;
            if (j != -1 && j != 0) {
                return (((float) this.e) * 100.0f) / ((float) j);
            }
            int i = this.d;
            if (i != 0) {
                return (this.f * 100.0f) / i;
            }
            return -1.0f;
        }

        @Override // com.amazon.aps.iva.x5.i.a
        public final void b(long j, long j2, long j3) {
            long j4 = this.e + j3;
            this.e = j4;
            ((i.d) this.b).b(this.c, j4, a());
        }
    }

    /* compiled from: SegmentDownloader.java */
    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {
        public final long b;
        public final com.amazon.aps.iva.w5.i c;

        public b(long j, com.amazon.aps.iva.w5.i iVar) {
            this.b = j;
            this.c = iVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            long j = bVar.b;
            int i = g0.a;
            int i2 = (this.b > j ? 1 : (this.b == j ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            if (i2 == 0) {
                return 0;
            }
            return 1;
        }
    }

    /* compiled from: SegmentDownloader.java */
    /* loaded from: classes.dex */
    public static final class c extends w<Void, IOException> {
        public final b i;
        public final com.amazon.aps.iva.x5.c j;
        public final a k;
        public final byte[] l;
        public final com.amazon.aps.iva.x5.i m;

        public c(b bVar, com.amazon.aps.iva.x5.c cVar, a aVar, byte[] bArr) {
            this.i = bVar;
            this.j = cVar;
            this.k = aVar;
            this.l = bArr;
            this.m = new com.amazon.aps.iva.x5.i(cVar, bVar.c, bArr, aVar);
        }

        @Override // com.amazon.aps.iva.t5.w
        public final void b() {
            this.m.j = true;
        }

        @Override // com.amazon.aps.iva.t5.w
        public final Void c() throws Exception {
            this.m.a();
            a aVar = this.k;
            if (aVar != null) {
                aVar.f++;
                ((i.d) aVar.b).b(aVar.c, aVar.e, aVar.a());
                return null;
            }
            return null;
        }
    }

    public u(b0 b0Var, m.a aVar, c.a aVar2, Executor executor) {
        b0Var.c.getClass();
        b0.g gVar = b0Var.c;
        this.a = c(gVar.b);
        this.b = aVar;
        this.c = new ArrayList<>(gVar.f);
        this.d = aVar2;
        this.g = executor;
        com.amazon.aps.iva.x5.a aVar3 = aVar2.a;
        aVar3.getClass();
        this.e = aVar3;
        this.f = aVar2.c;
        this.i = new ArrayList<>();
        this.h = g0.Q(20000L);
    }

    public static com.amazon.aps.iva.w5.i c(Uri uri) {
        Map emptyMap = Collections.emptyMap();
        com.amazon.aps.iva.cq.b.E(uri, "The uri must be set.");
        return new com.amazon.aps.iva.w5.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.List r18, com.amazon.aps.iva.q5.a0 r19, long r20) {
        /*
            r0 = r18
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3 = 0
            r4 = 0
        L9:
            int r5 = r18.size()
            if (r3 >= r5) goto Lc4
            java.lang.Object r5 = r0.get(r3)
            com.amazon.aps.iva.m6.u$b r5 = (com.amazon.aps.iva.m6.u.b) r5
            com.amazon.aps.iva.w5.i r6 = r5.c
            r7 = r19
            java.lang.String r6 = r7.b(r6)
            java.lang.Object r8 = r1.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L27
            r9 = 0
            goto L31
        L27:
            int r9 = r8.intValue()
            java.lang.Object r9 = r0.get(r9)
            com.amazon.aps.iva.m6.u$b r9 = (com.amazon.aps.iva.m6.u.b) r9
        L31:
            if (r9 == 0) goto Lac
            long r10 = r9.b
            long r12 = r10 + r20
            long r14 = r5.b
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 > 0) goto Lac
            com.amazon.aps.iva.w5.i r9 = r9.c
            android.net.Uri r12 = r9.a
            com.amazon.aps.iva.w5.i r13 = r5.c
            android.net.Uri r14 = r13.a
            boolean r12 = r12.equals(r14)
            r14 = -1
            r16 = r3
            long r2 = r9.g
            if (r12 == 0) goto L83
            int r12 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r12 == 0) goto L83
            long r14 = r9.f
            long r14 = r14 + r2
            r12 = r5
            r17 = r6
            long r5 = r13.f
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 != 0) goto L86
            java.lang.String r5 = r9.h
            java.lang.String r6 = r13.h
            boolean r5 = com.amazon.aps.iva.t5.g0.a(r5, r6)
            if (r5 == 0) goto L86
            int r5 = r9.i
            int r6 = r13.i
            if (r5 != r6) goto L86
            int r5 = r9.c
            int r6 = r13.c
            if (r5 != r6) goto L86
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.e
            java.util.Map<java.lang.String, java.lang.String> r6 = r13.e
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L86
            r5 = 1
            goto L87
        L83:
            r12 = r5
            r17 = r6
        L86:
            r5 = 0
        L87:
            if (r5 != 0) goto L8a
            goto Lb1
        L8a:
            long r5 = r13.g
            r12 = -1
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 != 0) goto L94
            r14 = r12
            goto L96
        L94:
            long r14 = r2 + r5
        L96:
            r2 = 0
            com.amazon.aps.iva.w5.i r2 = r9.b(r2, r14)
            r8.getClass()
            int r3 = r8.intValue()
            com.amazon.aps.iva.m6.u$b r5 = new com.amazon.aps.iva.m6.u$b
            r5.<init>(r10, r2)
            r0.set(r3, r5)
            goto Lc0
        Lac:
            r16 = r3
            r12 = r5
            r17 = r6
        Lb1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = r17
            r1.put(r3, r2)
            r5 = r12
            r0.set(r4, r5)
            int r4 = r4 + 1
        Lc0:
            int r3 = r16 + 1
            goto L9
        Lc4:
            int r1 = r18.size()
            com.amazon.aps.iva.t5.g0.V(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m6.u.e(java.util.List, com.amazon.aps.iva.q5.a0, long):void");
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void a(o.a aVar) throws IOException, InterruptedException {
        int i;
        a aVar2;
        int size;
        com.amazon.aps.iva.x5.c b2;
        byte[] bArr;
        int i2;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            com.amazon.aps.iva.x5.c b3 = this.d.b();
            q qVar = (q) b(new t(this, b3, this.a), false);
            if (!this.c.isEmpty()) {
                qVar = (q) qVar.a(this.c);
            }
            ArrayList d = d(b3, qVar, false);
            Collections.sort(d);
            e(d, this.f, this.h);
            int size2 = d.size();
            int i3 = 0;
            long j = 0;
            long j2 = 0;
            for (int size3 = d.size() - 1; size3 >= 0; size3 = i2 - 1) {
                com.amazon.aps.iva.w5.i iVar = ((b) d.get(size3)).c;
                String b4 = this.f.b(iVar);
                long j3 = iVar.g;
                if (j3 == -1) {
                    long a2 = com.amazon.aps.iva.x5.l.a(this.e.a(b4));
                    if (a2 != -1) {
                        j3 = a2 - iVar.f;
                    }
                }
                int i4 = size3;
                long f = this.e.f(iVar.f, j3, b4);
                j2 += f;
                if (j3 != -1) {
                    if (j3 == f) {
                        i3++;
                        i2 = i4;
                        d.remove(i2);
                    } else {
                        i2 = i4;
                    }
                    if (j != -1) {
                        j += j3;
                    }
                } else {
                    i2 = i4;
                    j = -1;
                }
            }
            if (aVar != null) {
                aVar2 = new a(aVar, j, size2, j2, i3);
            } else {
                aVar2 = null;
            }
            arrayDeque.addAll(d);
            while (!this.j && !arrayDeque.isEmpty()) {
                if (!arrayDeque2.isEmpty()) {
                    c cVar = (c) arrayDeque2.removeFirst();
                    b2 = cVar.j;
                    bArr = cVar.l;
                } else {
                    b2 = this.d.b();
                    bArr = new byte[131072];
                }
                c cVar2 = new c((b) arrayDeque.removeFirst(), b2, aVar2, bArr);
                synchronized (this.i) {
                    if (!this.j) {
                        this.i.add(cVar2);
                    } else {
                        throw new InterruptedException();
                    }
                }
                this.g.execute(cVar2);
                for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                    c cVar3 = (c) this.i.get(size4);
                    if (arrayDeque.isEmpty() || cVar3.isDone()) {
                        try {
                            cVar3.get();
                            f(size4);
                            arrayDeque2.addLast(cVar3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (cause instanceof m0) {
                                arrayDeque.addFirst(cVar3.i);
                                f(size4);
                                arrayDeque2.addLast(cVar3);
                            } else if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            } else {
                                throw cause;
                            }
                        }
                    }
                }
                cVar2.b.b();
            }
            while (true) {
                if (i >= size) {
                    break;
                }
            }
        } finally {
            for (i = 0; i < this.i.size(); i++) {
                this.i.get(i).cancel(true);
            }
            for (int size5 = this.i.size() - 1; size5 >= 0; size5--) {
                this.i.get(size5).a();
                f(size5);
            }
        }
    }

    public final <T> T b(w<T, ?> wVar, boolean z) throws InterruptedException, IOException {
        if (z) {
            wVar.run();
            try {
                return wVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = g0.a;
                throw e;
            }
        }
        while (!this.j) {
            synchronized (this.i) {
                if (!this.j) {
                    this.i.add(wVar);
                } else {
                    throw new InterruptedException();
                }
            }
            this.g.execute(wVar);
            try {
                try {
                    T t = wVar.get();
                    wVar.a();
                    synchronized (this.i) {
                        this.i.remove(wVar);
                    }
                    return t;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    if (cause2 instanceof m0) {
                        wVar.a();
                        synchronized (this.i) {
                            this.i.remove(wVar);
                        }
                    } else if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    } else {
                        int i2 = g0.a;
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                wVar.a();
                synchronized (this.i) {
                    this.i.remove(wVar);
                    throw th;
                }
            }
        }
        throw new InterruptedException();
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void cancel() {
        synchronized (this.i) {
            this.j = true;
            for (int i = 0; i < this.i.size(); i++) {
                this.i.get(i).cancel(true);
            }
        }
    }

    public abstract ArrayList d(com.amazon.aps.iva.x5.c cVar, q qVar, boolean z) throws IOException, InterruptedException;

    public final void f(int i) {
        synchronized (this.i) {
            this.i.remove(i);
        }
    }

    @Override // com.amazon.aps.iva.m6.o
    public final void remove() {
        a0 a0Var = this.f;
        com.amazon.aps.iva.x5.a aVar = this.e;
        com.amazon.aps.iva.w5.i iVar = this.a;
        com.amazon.aps.iva.x5.c c2 = this.d.c(null, 1, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        try {
            try {
                ArrayList d = d(c2, (q) b(new t(this, c2, iVar), true), true);
                for (int i = 0; i < d.size(); i++) {
                    aVar.j(a0Var.b(((b) d.get(i)).c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            aVar.j(a0Var.b(iVar));
        }
    }
}
