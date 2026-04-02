package com.amazon.aps.iva.o6;

import android.net.Uri;
import android.os.Handler;
import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.o6.p;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.x6.d0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes.dex */
public final class d0 implements u, com.amazon.aps.iva.x6.p, k.a<a>, k.e, g0.c {
    public static final Map<String, String> N;
    public static final com.amazon.aps.iva.q5.v O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public final Uri b;
    public final com.amazon.aps.iva.w5.f c;
    public final com.amazon.aps.iva.g6.f d;
    public final com.amazon.aps.iva.t6.j e;
    public final z.a f;
    public final e.a g;
    public final b h;
    public final com.amazon.aps.iva.t6.b i;
    public final String j;
    public final long k;
    public final c0 m;
    public u.a r;
    public com.amazon.aps.iva.h7.b s;
    public boolean v;
    public boolean w;
    public boolean x;
    public e y;
    public com.amazon.aps.iva.x6.d0 z;
    public final com.amazon.aps.iva.t6.k l = new com.amazon.aps.iva.t6.k("ProgressiveMediaPeriod");
    public final com.amazon.aps.iva.t5.f n = new com.amazon.aps.iva.t5.f();
    public final com.amazon.aps.iva.v1.p o = new com.amazon.aps.iva.v1.p(this, 5);
    public final com.amazon.aps.iva.e.i p = new com.amazon.aps.iva.e.i(this, 2);
    public final Handler q = com.amazon.aps.iva.t5.g0.m(null);
    public d[] u = new d[0];
    public g0[] t = new g0[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements k.d, p.a {
        public final Uri b;
        public final com.amazon.aps.iva.w5.w c;
        public final c0 d;
        public final com.amazon.aps.iva.x6.p e;
        public final com.amazon.aps.iva.t5.f f;
        public volatile boolean h;
        public long j;
        public g0 l;
        public boolean m;
        public final com.amazon.aps.iva.x6.c0 g = new com.amazon.aps.iva.x6.c0();
        public boolean i = true;
        public final long a = q.a();
        public com.amazon.aps.iva.w5.i k = c(0);

        public a(Uri uri, com.amazon.aps.iva.w5.f fVar, c0 c0Var, com.amazon.aps.iva.x6.p pVar, com.amazon.aps.iva.t5.f fVar2) {
            this.b = uri;
            this.c = new com.amazon.aps.iva.w5.w(fVar);
            this.d = c0Var;
            this.e = pVar;
            this.f = fVar2;
        }

        @Override // com.amazon.aps.iva.t6.k.d
        public final void a() throws IOException {
            com.amazon.aps.iva.w5.f fVar;
            int i;
            int i2 = 0;
            while (i2 == 0 && !this.h) {
                try {
                    long j = this.g.a;
                    com.amazon.aps.iva.w5.i c = c(j);
                    this.k = c;
                    long b = this.c.b(c);
                    if (b != -1) {
                        b += j;
                        d0 d0Var = d0.this;
                        d0Var.q.post(new com.amazon.aps.iva.e.k(d0Var, 3));
                    }
                    long j2 = b;
                    d0.this.s = com.amazon.aps.iva.h7.b.a(this.c.d());
                    com.amazon.aps.iva.w5.w wVar = this.c;
                    com.amazon.aps.iva.h7.b bVar = d0.this.s;
                    if (bVar != null && (i = bVar.g) != -1) {
                        fVar = new p(wVar, i, this);
                        d0 d0Var2 = d0.this;
                        d0Var2.getClass();
                        g0 C = d0Var2.C(new d(0, true));
                        this.l = C;
                        C.c(d0.O);
                    } else {
                        fVar = wVar;
                    }
                    long j3 = j;
                    ((com.amazon.aps.iva.o6.c) this.d).b(fVar, this.b, this.c.d(), j, j2, this.e);
                    if (d0.this.s != null) {
                        com.amazon.aps.iva.x6.n nVar = ((com.amazon.aps.iva.o6.c) this.d).b;
                        if (nVar instanceof com.amazon.aps.iva.n7.d) {
                            ((com.amazon.aps.iva.n7.d) nVar).r = true;
                        }
                    }
                    if (this.i) {
                        c0 c0Var = this.d;
                        long j4 = this.j;
                        com.amazon.aps.iva.x6.n nVar2 = ((com.amazon.aps.iva.o6.c) c0Var).b;
                        nVar2.getClass();
                        nVar2.c(j3, j4);
                        this.i = false;
                    }
                    while (true) {
                        long j5 = j3;
                        while (i2 == 0 && !this.h) {
                            try {
                                this.f.a();
                                c0 c0Var2 = this.d;
                                com.amazon.aps.iva.x6.c0 c0Var3 = this.g;
                                com.amazon.aps.iva.o6.c cVar = (com.amazon.aps.iva.o6.c) c0Var2;
                                com.amazon.aps.iva.x6.n nVar3 = cVar.b;
                                nVar3.getClass();
                                com.amazon.aps.iva.x6.i iVar = cVar.c;
                                iVar.getClass();
                                i2 = nVar3.h(iVar, c0Var3);
                                j3 = ((com.amazon.aps.iva.o6.c) this.d).a();
                                if (j3 > d0.this.k + j5) {
                                    com.amazon.aps.iva.t5.f fVar2 = this.f;
                                    synchronized (fVar2) {
                                        fVar2.a = false;
                                    }
                                    d0 d0Var3 = d0.this;
                                    d0Var3.q.post(d0Var3.p);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (((com.amazon.aps.iva.o6.c) this.d).a() != -1) {
                        this.g.a = ((com.amazon.aps.iva.o6.c) this.d).a();
                    }
                    com.amazon.aps.iva.n1.c.g(this.c);
                } catch (Throwable th) {
                    if (i2 != 1 && ((com.amazon.aps.iva.o6.c) this.d).a() != -1) {
                        this.g.a = ((com.amazon.aps.iva.o6.c) this.d).a();
                    }
                    com.amazon.aps.iva.n1.c.g(this.c);
                    throw th;
                }
            }
        }

        @Override // com.amazon.aps.iva.t6.k.d
        public final void b() {
            this.h = true;
        }

        public final com.amazon.aps.iva.w5.i c(long j) {
            Collections.emptyMap();
            String str = d0.this.j;
            Map<String, String> map = d0.N;
            Uri uri = this.b;
            com.amazon.aps.iva.cq.b.E(uri, "The uri must be set.");
            return new com.amazon.aps.iva.w5.i(uri, 0L, 1, null, map, j, -1L, str, 6, null);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class c implements h0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final void a() throws IOException {
            d0 d0Var = d0.this;
            d0Var.t[this.b].t();
            int a = d0Var.e.a(d0Var.C);
            com.amazon.aps.iva.t6.k kVar = d0Var.l;
            IOException iOException = kVar.c;
            if (iOException == null) {
                k.c<? extends k.d> cVar = kVar.b;
                if (cVar != null) {
                    if (a == Integer.MIN_VALUE) {
                        a = cVar.b;
                    }
                    IOException iOException2 = cVar.f;
                    if (iOException2 != null && cVar.g > a) {
                        throw iOException2;
                    }
                    return;
                }
                return;
            }
            throw iOException;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final boolean g() {
            d0 d0Var = d0.this;
            if (!d0Var.E() && d0Var.t[this.b].r(d0Var.L)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
            d0 d0Var = d0.this;
            if (d0Var.E()) {
                return -3;
            }
            int i2 = this.b;
            d0Var.A(i2);
            int v = d0Var.t[i2].v(g0Var, fVar, i, d0Var.L);
            if (v == -3) {
                d0Var.B(i2);
            }
            return v;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int o(long j) {
            d0 d0Var = d0.this;
            if (d0Var.E()) {
                return 0;
            }
            int i = this.b;
            d0Var.A(i);
            g0 g0Var = d0Var.t[i];
            int p = g0Var.p(j, d0Var.L);
            g0Var.y(p);
            if (p == 0) {
                d0Var.B(i);
                return p;
            }
            return p;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final o0 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(o0 o0Var, boolean[] zArr) {
            this.a = o0Var;
            this.b = zArr;
            int i = o0Var.b;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(hashMap);
        v.a aVar = new v.a();
        aVar.a = "icy";
        aVar.k = "application/x-icy";
        O = aVar.a();
    }

    public d0(Uri uri, com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.o6.c cVar, com.amazon.aps.iva.g6.f fVar2, e.a aVar, com.amazon.aps.iva.t6.j jVar, z.a aVar2, b bVar, com.amazon.aps.iva.t6.b bVar2, String str, int i) {
        this.b = uri;
        this.c = fVar;
        this.d = fVar2;
        this.g = aVar;
        this.e = jVar;
        this.f = aVar2;
        this.h = bVar;
        this.i = bVar2;
        this.j = str;
        this.k = i;
        this.m = cVar;
    }

    public final void A(int i) {
        g();
        e eVar = this.y;
        boolean[] zArr = eVar.d;
        if (!zArr[i]) {
            com.amazon.aps.iva.q5.v vVar = eVar.a.a(i).e[0];
            this.f.a(com.amazon.aps.iva.q5.g0.i(vVar.m), vVar, 0, null, this.H);
            zArr[i] = true;
        }
    }

    public final void B(int i) {
        g();
        boolean[] zArr = this.y.b;
        if (this.J && zArr[i] && !this.t[i].r(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (g0 g0Var : this.t) {
                g0Var.w(false);
            }
            u.a aVar = this.r;
            aVar.getClass();
            aVar.a(this);
        }
    }

    public final g0 C(d dVar) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.u[i])) {
                return this.t[i];
            }
        }
        com.amazon.aps.iva.g6.f fVar = this.d;
        fVar.getClass();
        e.a aVar = this.g;
        aVar.getClass();
        g0 g0Var = new g0(this.i, fVar, aVar);
        g0Var.f = this;
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.u, i2);
        dVarArr[length] = dVar;
        int i3 = com.amazon.aps.iva.t5.g0.a;
        this.u = dVarArr;
        g0[] g0VarArr = (g0[]) Arrays.copyOf(this.t, i2);
        g0VarArr[length] = g0Var;
        this.t = g0VarArr;
        return g0Var;
    }

    public final void D() {
        a aVar = new a(this.b, this.c, this.m, this, this.n);
        if (this.w) {
            com.amazon.aps.iva.cq.b.C(y());
            long j = this.A;
            if (j != -9223372036854775807L && this.I > j) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            com.amazon.aps.iva.x6.d0 d0Var = this.z;
            d0Var.getClass();
            long j2 = d0Var.d(this.I).a.b;
            long j3 = this.I;
            aVar.g.a = j2;
            aVar.j = j3;
            aVar.i = true;
            aVar.m = false;
            for (g0 g0Var : this.t) {
                g0Var.t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = w();
        this.f.m(new q(aVar.a, aVar.k, this.l.f(aVar, this, this.e.a(this.C))), 1, -1, null, 0, null, aVar.j, this.A);
    }

    public final boolean E() {
        if (!this.E && !y()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.o6.g0.c
    public final void a() {
        this.q.post(this.o);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        g();
        if (!this.z.f()) {
            return 0L;
        }
        d0.a d2 = this.z.d(j);
        return s1Var.a(j, d2.a.a, d2.b.a);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        return s();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    @Override // com.amazon.aps.iva.t6.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.t6.k.b d(com.amazon.aps.iva.o6.d0.a r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.amazon.aps.iva.o6.d0$a r1 = (com.amazon.aps.iva.o6.d0.a) r1
            com.amazon.aps.iva.w5.w r2 = r1.c
            com.amazon.aps.iva.o6.q r10 = new com.amazon.aps.iva.o6.q
            long r4 = r1.a
            android.net.Uri r6 = r2.c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r2.d
            long r8 = r2.b
            r3 = r10
            r3.<init>(r4, r6, r7, r8)
            long r2 = r1.j
            com.amazon.aps.iva.t5.g0.e0(r2)
            long r2 = r0.A
            com.amazon.aps.iva.t5.g0.e0(r2)
            com.amazon.aps.iva.t6.j$c r2 = new com.amazon.aps.iva.t6.j$c
            r14 = r24
            r3 = r25
            r2.<init>(r10, r14, r3)
            com.amazon.aps.iva.t6.j r3 = r0.e
            long r2 = r3.c(r2)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            if (r6 != 0) goto L3c
            com.amazon.aps.iva.t6.k$b r2 = com.amazon.aps.iva.t6.k.f
            goto L97
        L3c:
            int r6 = r18.w()
            int r8 = r0.K
            r9 = 0
            if (r6 <= r8) goto L47
            r8 = r7
            goto L48
        L47:
            r8 = r9
        L48:
            boolean r11 = r0.G
            if (r11 != 0) goto L89
            com.amazon.aps.iva.x6.d0 r11 = r0.z
            if (r11 == 0) goto L59
            long r11 = r11.i()
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L59
            goto L89
        L59:
            boolean r4 = r0.w
            if (r4 == 0) goto L66
            boolean r4 = r18.E()
            if (r4 != 0) goto L66
            r0.J = r7
            goto L8c
        L66:
            boolean r4 = r0.w
            r0.E = r4
            r4 = 0
            r0.H = r4
            r0.K = r9
            com.amazon.aps.iva.o6.g0[] r6 = r0.t
            int r11 = r6.length
            r12 = r9
        L74:
            if (r12 >= r11) goto L7e
            r13 = r6[r12]
            r13.w(r9)
            int r12 = r12 + 1
            goto L74
        L7e:
            com.amazon.aps.iva.x6.c0 r6 = r1.g
            r6.a = r4
            r1.j = r4
            r1.i = r7
            r1.m = r9
            goto L8b
        L89:
            r0.K = r6
        L8b:
            r9 = r7
        L8c:
            if (r9 == 0) goto L95
            com.amazon.aps.iva.t6.k$b r4 = new com.amazon.aps.iva.t6.k$b
            r4.<init>(r8, r2)
            r2 = r4
            goto L97
        L95:
            com.amazon.aps.iva.t6.k$b r2 = com.amazon.aps.iva.t6.k.e
        L97:
            boolean r3 = r2.a()
            r15 = r3 ^ 1
            com.amazon.aps.iva.o6.z$a r3 = r0.f
            r5 = 1
            r6 = -1
            r7 = 0
            long r11 = r1.j
            long r8 = r0.A
            r4 = r10
            r16 = r8
            r1 = 0
            r8 = r1
            r1 = 0
            r9 = r1
            r10 = r11
            r12 = r16
            r14 = r24
            r3.i(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.d0.d(com.amazon.aps.iva.t6.k$d, long, long, java.io.IOException, int):com.amazon.aps.iva.t6.k$b");
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        boolean z;
        g();
        boolean[] zArr = this.y.b;
        if (!this.z.f()) {
            j = 0;
        }
        this.E = false;
        this.H = j;
        if (y()) {
            this.I = j;
            return j;
        }
        if (this.C != 7) {
            int length = this.t.length;
            for (int i = 0; i < length; i++) {
                if (!this.t[i].x(j, false) && (zArr[i] || !this.x)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.J = false;
        this.I = j;
        this.L = false;
        com.amazon.aps.iva.t6.k kVar = this.l;
        if (kVar.d()) {
            for (g0 g0Var : this.t) {
                g0Var.i();
            }
            kVar.b();
        } else {
            kVar.c = null;
            for (g0 g0Var2 : this.t) {
                g0Var2.w(false);
            }
        }
        return j;
    }

    public final void g() {
        com.amazon.aps.iva.cq.b.C(this.w);
        this.y.getClass();
        this.z.getClass();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        boolean z;
        com.amazon.aps.iva.s6.r rVar;
        boolean z2;
        boolean z3;
        g();
        e eVar = this.y;
        o0 o0Var = eVar.a;
        int i = this.F;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = rVarArr.length;
            zArr3 = eVar.c;
            if (i3 >= length) {
                break;
            }
            h0 h0Var = h0VarArr[i3];
            if (h0Var != null && (rVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) h0Var).b;
                com.amazon.aps.iva.cq.b.C(zArr3[i4]);
                this.F--;
                zArr3[i4] = false;
                h0VarArr[i3] = null;
            }
            i3++;
        }
        if (!this.D ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < rVarArr.length; i5++) {
            if (h0VarArr[i5] == null && (rVar = rVarArr[i5]) != null) {
                if (rVar.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.amazon.aps.iva.cq.b.C(z2);
                if (rVar.f(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.amazon.aps.iva.cq.b.C(z3);
                int b2 = o0Var.b(rVar.m());
                com.amazon.aps.iva.cq.b.C(!zArr3[b2]);
                this.F++;
                zArr3[b2] = true;
                h0VarArr[i5] = new c(b2);
                zArr2[i5] = true;
                if (!z) {
                    g0 g0Var = this.t[b2];
                    if (!g0Var.x(j, true) && g0Var.q + g0Var.s != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            com.amazon.aps.iva.t6.k kVar = this.l;
            if (kVar.d()) {
                g0[] g0VarArr = this.t;
                int length2 = g0VarArr.length;
                while (i2 < length2) {
                    g0VarArr[i2].i();
                    i2++;
                }
                kVar.b();
            } else {
                for (g0 g0Var2 : this.t) {
                    g0Var2.w(false);
                }
            }
        } else if (z) {
            j = e(j);
            while (i2 < h0VarArr.length) {
                if (h0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.D = true;
        return j;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void i(a aVar, long j, long j2, boolean z) {
        a aVar2 = aVar;
        com.amazon.aps.iva.w5.w wVar = aVar2.c;
        q qVar = new q(aVar2.a, wVar.c, wVar.d, wVar.b);
        this.e.getClass();
        this.f.d(qVar, 1, -1, null, 0, null, aVar2.j, this.A);
        if (!z) {
            for (g0 g0Var : this.t) {
                g0Var.w(false);
            }
            if (this.F > 0) {
                u.a aVar3 = this.r;
                aVar3.getClass();
                aVar3.a(this);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        boolean z;
        if (this.l.d()) {
            com.amazon.aps.iva.t5.f fVar = this.n;
            synchronized (fVar) {
                z = fVar.a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        if (this.E) {
            if (this.L || w() > this.K) {
                this.E = false;
                return this.H;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        this.r = aVar;
        this.n.c();
        D();
    }

    @Override // com.amazon.aps.iva.t6.k.e
    public final void l() {
        g0[] g0VarArr;
        for (g0 g0Var : this.t) {
            g0Var.w(true);
            com.amazon.aps.iva.g6.d dVar = g0Var.h;
            if (dVar != null) {
                dVar.e(g0Var.e);
                g0Var.h = null;
                g0Var.g = null;
            }
        }
        com.amazon.aps.iva.o6.c cVar = (com.amazon.aps.iva.o6.c) this.m;
        com.amazon.aps.iva.x6.n nVar = cVar.b;
        if (nVar != null) {
            nVar.release();
            cVar.b = null;
        }
        cVar.c = null;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void m(com.amazon.aps.iva.x6.d0 d0Var) {
        this.q.post(new com.amazon.aps.iva.o4.b(3, this, d0Var));
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        int a2 = this.e.a(this.C);
        com.amazon.aps.iva.t6.k kVar = this.l;
        IOException iOException = kVar.c;
        if (iOException == null) {
            k.c<? extends k.d> cVar = kVar.b;
            if (cVar != null) {
                if (a2 == Integer.MIN_VALUE) {
                    a2 = cVar.b;
                }
                IOException iOException2 = cVar.f;
                if (iOException2 != null && cVar.g > a2) {
                    throw iOException2;
                }
            }
            if (this.L && !this.w) {
                throw com.amazon.aps.iva.q5.h0.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void o() {
        this.v = true;
        this.q.post(this.o);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        if (!this.L) {
            com.amazon.aps.iva.t6.k kVar = this.l;
            if (!kVar.c() && !this.J) {
                if (!this.w || this.F != 0) {
                    boolean c2 = this.n.c();
                    if (!kVar.d()) {
                        D();
                        return true;
                    }
                    return c2;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        g();
        return this.y.a;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final com.amazon.aps.iva.x6.f0 r(int i, int i2) {
        return C(new d(i, false));
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        long j;
        boolean z;
        long j2;
        g();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        if (this.x) {
            int length = this.t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.y;
                if (eVar.b[i] && eVar.c[i]) {
                    g0 g0Var = this.t[i];
                    synchronized (g0Var) {
                        z = g0Var.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        g0 g0Var2 = this.t[i];
                        synchronized (g0Var2) {
                            j2 = g0Var2.v;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = x(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.H;
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
        g();
        if (y()) {
            return;
        }
        boolean[] zArr = this.y.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].h(z, zArr[i], j);
        }
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void u(a aVar, long j, long j2) {
        com.amazon.aps.iva.x6.d0 d0Var;
        long j3;
        a aVar2 = aVar;
        if (this.A == -9223372036854775807L && (d0Var = this.z) != null) {
            boolean f = d0Var.f();
            long x = x(true);
            if (x == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = x + NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
            }
            this.A = j3;
            ((e0) this.h).v(f, this.B, j3);
        }
        com.amazon.aps.iva.w5.w wVar = aVar2.c;
        q qVar = new q(aVar2.a, wVar.c, wVar.d, wVar.b);
        this.e.getClass();
        this.f.g(qVar, 1, -1, null, 0, null, aVar2.j, this.A);
        this.L = true;
        u.a aVar3 = this.r;
        aVar3.getClass();
        aVar3.a(this);
    }

    public final int w() {
        g0[] g0VarArr;
        int i = 0;
        for (g0 g0Var : this.t) {
            i += g0Var.q + g0Var.p;
        }
        return i;
    }

    public final long x(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.t.length; i++) {
            if (!z) {
                e eVar = this.y;
                eVar.getClass();
                if (!eVar.c[i]) {
                    continue;
                }
            }
            g0 g0Var = this.t[i];
            synchronized (g0Var) {
                j = g0Var.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        boolean z;
        com.amazon.aps.iva.q5.f0 a2;
        int i;
        if (!this.M && !this.w && this.v && this.z != null) {
            for (g0 g0Var : this.t) {
                if (g0Var.q() == null) {
                    return;
                }
            }
            com.amazon.aps.iva.t5.f fVar = this.n;
            synchronized (fVar) {
                fVar.a = false;
            }
            int length = this.t.length;
            s0[] s0VarArr = new s0[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                com.amazon.aps.iva.q5.v q = this.t[i2].q();
                q.getClass();
                String str = q.m;
                boolean k = com.amazon.aps.iva.q5.g0.k(str);
                if (!k && !com.amazon.aps.iva.q5.g0.m(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i2] = z;
                this.x = z | this.x;
                com.amazon.aps.iva.h7.b bVar = this.s;
                if (bVar != null) {
                    if (k || this.u[i2].b) {
                        com.amazon.aps.iva.q5.f0 f0Var = q.k;
                        if (f0Var == null) {
                            a2 = new com.amazon.aps.iva.q5.f0(bVar);
                        } else {
                            a2 = f0Var.a(bVar);
                        }
                        v.a aVar = new v.a(q);
                        aVar.i = a2;
                        q = new com.amazon.aps.iva.q5.v(aVar);
                    }
                    if (k && q.g == -1 && q.h == -1 && (i = bVar.b) != -1) {
                        v.a aVar2 = new v.a(q);
                        aVar2.f = i;
                        q = new com.amazon.aps.iva.q5.v(aVar2);
                    }
                }
                int c2 = this.d.c(q);
                v.a a3 = q.a();
                a3.F = c2;
                s0VarArr[i2] = new s0(Integer.toString(i2), a3.a());
            }
            this.y = new e(new o0(s0VarArr), zArr);
            this.w = true;
            u.a aVar3 = this.r;
            aVar3.getClass();
            aVar3.d(this);
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
    }
}
