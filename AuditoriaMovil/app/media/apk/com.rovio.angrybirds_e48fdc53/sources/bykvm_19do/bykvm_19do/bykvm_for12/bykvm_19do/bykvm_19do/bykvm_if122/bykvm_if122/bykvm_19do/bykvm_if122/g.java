package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.f;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.c0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.j;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
/* loaded from: classes.dex */
public final class g {
    static final /* synthetic */ boolean o = true;
    public final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a a;
    private f.a b;
    private c0 c;
    private final j d;
    public final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e e;
    public final p f;
    private final Object g;
    private final f h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c n;

    /* loaded from: classes.dex */
    public static final class a extends WeakReference<g> {
        public final Object a;

        a(g gVar, Object obj) {
            super(gVar);
            this.a = obj;
        }
    }

    public g(j jVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a aVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar, Object obj) throws IOException {
        this.d = jVar;
        this.a = aVar;
        this.e = eVar;
        this.f = pVar;
        this.h = new f(aVar, g(), eVar, pVar);
        this.g = obj;
    }

    private c a(int i, int i2, int i3, boolean z) throws IOException {
        c cVar;
        Socket f;
        c cVar2;
        Socket socket;
        c0 c0Var;
        boolean z2;
        boolean z3;
        f.a aVar;
        synchronized (this.d) {
            if (this.l) {
                throw new IllegalStateException("released");
            }
            if (this.n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.m) {
                throw new IOException("Canceled");
            }
            cVar = this.j;
            f = f();
            cVar2 = this.j;
            socket = null;
            if (cVar2 != null) {
                cVar = null;
            } else {
                cVar2 = null;
            }
            if (!this.k) {
                cVar = null;
            }
            if (cVar2 == null) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.d, this.a, this, null);
                c cVar3 = this.j;
                if (cVar3 != null) {
                    z2 = true;
                    cVar2 = cVar3;
                    c0Var = null;
                } else {
                    c0Var = this.c;
                }
            } else {
                c0Var = null;
            }
            z2 = false;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(f);
        if (cVar != null) {
            this.f.b(this.e, cVar);
        }
        if (z2) {
            this.f.a(this.e, cVar2);
        }
        if (cVar2 == null) {
            if (c0Var != null || ((aVar = this.b) != null && aVar.b())) {
                z3 = false;
            } else {
                this.b = this.h.b();
                z3 = true;
            }
            synchronized (this.d) {
                if (this.m) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    List<c0> a2 = this.b.a();
                    int size = a2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        c0 c0Var2 = a2.get(i4);
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.d, this.a, this, c0Var2);
                        c cVar4 = this.j;
                        if (cVar4 != null) {
                            this.c = c0Var2;
                            z2 = true;
                            cVar2 = cVar4;
                            break;
                        }
                        i4++;
                    }
                }
                if (!z2) {
                    if (c0Var == null) {
                        c0Var = this.b.c();
                    }
                    this.c = c0Var;
                    this.i = 0;
                    c cVar5 = new c(this.d, c0Var);
                    a(cVar5, false);
                    cVar2 = cVar5;
                }
            }
            if (!z2) {
                cVar2.a(i, i2, i3, z, this.e, this.f);
                g().a(cVar2.a());
                synchronized (this.d) {
                    this.k = true;
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.b(this.d, cVar2);
                    if (cVar2.c()) {
                        socket = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.d, this.a, this);
                        cVar2 = this.j;
                    }
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(socket);
            }
            this.f.a(this.e, cVar2);
        }
        return cVar2;
    }

    private c a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        c a2;
        while (true) {
            a2 = a(i, i2, i3, z);
            synchronized (this.d) {
                if (a2.l != 0) {
                    if (a2.a(z2)) {
                        break;
                    }
                    d();
                } else {
                    break;
                }
            }
        }
        return a2;
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (o || Thread.holdsLock(this.d)) {
            if (z3) {
                this.n = null;
            }
            if (z2) {
                this.l = true;
            }
            c cVar = this.j;
            if (cVar != null) {
                if (z) {
                    cVar.k = true;
                }
                if (this.n == null) {
                    if (this.l || this.j.k) {
                        b(this.j);
                        if (this.j.n.isEmpty()) {
                            this.j.o = System.nanoTime();
                            if (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.d, this.j)) {
                                socket = this.j.e();
                                this.j = null;
                                return socket;
                            }
                        }
                        socket = null;
                        this.j = null;
                        return socket;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new AssertionError();
    }

    private void b(c cVar) {
        int size = cVar.n.size();
        for (int i = 0; i < size; i++) {
            if (cVar.n.get(i).get() == this) {
                cVar.n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket f() {
        if (o || Thread.holdsLock(this.d)) {
            c cVar = this.j;
            if (cVar == null || !cVar.k) {
                return null;
            }
            return a(false, false, true);
        }
        throw new AssertionError();
    }

    private d g() {
        return bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.d);
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c a() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c cVar;
        synchronized (this.d) {
            cVar = this.n;
        }
        return cVar;
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c a(v vVar, t.a aVar, boolean z) {
        try {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c a2 = a(aVar.c(), aVar.d(), aVar.a(), vVar.v(), z).a(vVar, aVar, this);
            synchronized (this.d) {
                this.n = a2;
            }
            return a2;
        } catch (IOException e) {
            throw new e(e);
        }
    }

    public Socket a(c cVar) {
        if (o || Thread.holdsLock(this.d)) {
            if (this.n == null && this.j.n.size() == 1) {
                Socket a2 = a(true, false, false);
                this.j = cVar;
                cVar.n.add(this.j.n.get(0));
                return a2;
            }
            throw new IllegalStateException();
        }
        throw new AssertionError();
    }

    public void a(c cVar, boolean z) {
        if (!o && !Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        this.j = cVar;
        this.k = z;
        cVar.n.add(new a(this, this.g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r6.i <= 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: all -> 0x0065, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0012, B:9:0x0017, B:11:0x001d, B:28:0x0047, B:30:0x0051, B:34:0x0057, B:13:0x0021, B:14:0x0024, B:16:0x0028, B:18:0x002e, B:20:0x0032, B:22:0x0038, B:25:0x003e), top: B:42:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.IOException r7) {
        /*
            r6 = this;
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.j r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r7 instanceof bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.o     // Catch: java.lang.Throwable -> L65
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L24
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.o r7 = (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.o) r7     // Catch: java.lang.Throwable -> L65
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b r1 = r7.a     // Catch: java.lang.Throwable -> L65
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b r5 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L65
            if (r1 != r5) goto L17
            int r1 = r6.i     // Catch: java.lang.Throwable -> L65
            int r1 = r1 + r4
            r6.i = r1     // Catch: java.lang.Throwable -> L65
        L17:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b r7 = r7.a     // Catch: java.lang.Throwable -> L65
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L65
            if (r7 != r1) goto L21
            int r7 = r6.i     // Catch: java.lang.Throwable -> L65
            if (r7 <= r4) goto L46
        L21:
            r6.c = r3     // Catch: java.lang.Throwable -> L65
            goto L44
        L24:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c r1 = r6.j     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L46
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L32
            boolean r1 = r7 instanceof bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.a     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L46
        L32:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c r1 = r6.j     // Catch: java.lang.Throwable -> L65
            int r1 = r1.l     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L44
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.c0 r1 = r6.c     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L21
            if (r7 == 0) goto L21
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.f r5 = r6.h     // Catch: java.lang.Throwable -> L65
            r5.a(r1, r7)     // Catch: java.lang.Throwable -> L65
            goto L21
        L44:
            r7 = r4
            goto L47
        L46:
            r7 = r2
        L47:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c r1 = r6.j     // Catch: java.lang.Throwable -> L65
            java.net.Socket r7 = r6.a(r7, r2, r4)     // Catch: java.lang.Throwable -> L65
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c r2 = r6.j     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L57
            boolean r2 = r6.k     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L56
            goto L57
        L56:
            r3 = r1
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(r7)
            if (r3 == 0) goto L64
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p r7 = r6.f
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e r0 = r6.e
            r7.b(r0, r3)
        L64:
            return
        L65:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g.a(java.io.IOException):void");
    }

    public void a(boolean z, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c cVar, long j, IOException iOException) {
        c cVar2;
        Socket a2;
        boolean z2;
        this.f.b(this.e, j);
        synchronized (this.d) {
            if (cVar != null) {
                if (cVar == this.n) {
                    if (!z) {
                        this.j.l++;
                    }
                    cVar2 = this.j;
                    a2 = a(z, false, true);
                    if (this.j != null) {
                        cVar2 = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + cVar);
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(a2);
        if (cVar2 != null) {
            this.f.b(this.e, cVar2);
        }
        if (iOException != null) {
            this.f.a(this.e, iOException);
        } else if (z2) {
            this.f.a(this.e);
        }
    }

    public c b() {
        c cVar;
        synchronized (this) {
            cVar = this.j;
        }
        return cVar;
    }

    public boolean c() {
        f.a aVar;
        return this.c != null || ((aVar = this.b) != null && aVar.b()) || this.h.a();
    }

    public void d() {
        c cVar;
        Socket a2;
        synchronized (this.d) {
            cVar = this.j;
            a2 = a(true, false, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(a2);
        if (cVar != null) {
            this.f.b(this.e, cVar);
        }
    }

    public void e() {
        c cVar;
        Socket a2;
        synchronized (this.d) {
            cVar = this.j;
            a2 = a(false, true, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(a2);
        if (cVar != null) {
            this.f.b(this.e, cVar);
        }
    }

    public String toString() {
        c b = b();
        return b != null ? b.toString() : this.a.toString();
    }
}
