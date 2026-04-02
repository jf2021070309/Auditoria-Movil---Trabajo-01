package com.amazon.aps.iva.p6;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.amazon.aps.iva.a6.g1;
import com.amazon.aps.iva.o6.g;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.o6.r;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.a;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.i;
import com.amazon.aps.iva.w5.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: AdsMediaSource.java */
/* loaded from: classes.dex */
public final class b extends g<v.b> {
    public static final v.b x = new v.b(new Object());
    public final v k;
    public final b0.e l;
    public final v.a m;
    public final com.amazon.aps.iva.p6.a n;
    public final com.amazon.aps.iva.q5.d o;
    public final i p;
    public final Object q;
    public final Handler r;
    public final r0.b s;
    public d t;
    public r0 u;
    public com.amazon.aps.iva.q5.c v;
    public C0605b[][] w;

    /* compiled from: AdsMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
        public a(Exception exc) {
            super(exc);
        }
    }

    /* compiled from: AdsMediaSource.java */
    /* renamed from: com.amazon.aps.iva.p6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0605b {
        public final v.b a;
        public final ArrayList b = new ArrayList();
        public Uri c;
        public v d;
        public r0 e;

        public C0605b(v.b bVar) {
            this.a = bVar;
        }
    }

    /* compiled from: AdsMediaSource.java */
    /* loaded from: classes.dex */
    public final class c implements r.a {
        public final Uri a;

        public c(Uri uri) {
            this.a = uri;
        }
    }

    /* compiled from: AdsMediaSource.java */
    /* loaded from: classes.dex */
    public final class d implements a.InterfaceC0604a {
        public final Handler a = g0.m(null);
        public volatile boolean b;

        public d() {
        }

        @Override // com.amazon.aps.iva.p6.a.InterfaceC0604a
        public final void a(a aVar, i iVar) {
            if (this.b) {
                return;
            }
            b bVar = b.this;
            v.b bVar2 = b.x;
            bVar.o(null).j(new q(q.a(), iVar, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        @Override // com.amazon.aps.iva.p6.a.InterfaceC0604a
        public final void b(com.amazon.aps.iva.q5.c cVar) {
            if (this.b) {
                return;
            }
            this.a.post(new com.amazon.aps.iva.o4.b(4, this, cVar));
        }
    }

    public b(v vVar, i iVar, Object obj, v.a aVar, com.amazon.aps.iva.p6.a aVar2, com.amazon.aps.iva.q5.d dVar) {
        this.k = vVar;
        b0.g gVar = vVar.b().c;
        gVar.getClass();
        this.l = gVar.d;
        this.m = aVar;
        this.n = aVar2;
        this.o = dVar;
        this.p = iVar;
        this.q = obj;
        this.r = new Handler(Looper.getMainLooper());
        this.s = new r0.b();
        this.w = new C0605b[0];
        aVar2.b(aVar.c());
    }

    public final void A() {
        boolean z;
        long j;
        r0 r0Var;
        r0 r0Var2 = this.u;
        com.amazon.aps.iva.q5.c cVar = this.v;
        if (cVar != null && r0Var2 != null) {
            if (cVar.c == 0) {
                s(r0Var2);
            } else {
                long[][] jArr = new long[this.w.length];
                int i = 0;
                int i2 = 0;
                while (true) {
                    C0605b[][] c0605bArr = this.w;
                    if (i2 >= c0605bArr.length) {
                        break;
                    }
                    jArr[i2] = new long[c0605bArr[i2].length];
                    int i3 = 0;
                    while (true) {
                        C0605b[] c0605bArr2 = this.w[i2];
                        if (i3 < c0605bArr2.length) {
                            C0605b c0605b = c0605bArr2[i3];
                            long[] jArr2 = jArr[i2];
                            if (c0605b == null || (r0Var = c0605b.e) == null) {
                                j = -9223372036854775807L;
                            } else {
                                j = r0Var.h(0, b.this.s, false).e;
                            }
                            jArr2[i3] = j;
                            i3++;
                        }
                    }
                    i2++;
                }
                if (cVar.f == 0) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                c.a[] aVarArr = cVar.g;
                c.a[] aVarArr2 = (c.a[]) g0.S(aVarArr, aVarArr.length);
                while (i < cVar.c) {
                    c.a aVar = aVarArr2[i];
                    long[] jArr3 = jArr[i];
                    aVar.getClass();
                    int length = jArr3.length;
                    Uri[] uriArr = aVar.e;
                    if (length < uriArr.length) {
                        jArr3 = c.a.a(jArr3, uriArr.length);
                    } else if (aVar.c != -1 && jArr3.length > uriArr.length) {
                        jArr3 = Arrays.copyOf(jArr3, uriArr.length);
                    }
                    aVarArr2[i] = new c.a(aVar.b, aVar.c, aVar.d, aVar.f, aVar.e, jArr3, aVar.h, aVar.i);
                    i++;
                    r0Var2 = r0Var2;
                }
                this.v = new com.amazon.aps.iva.q5.c(cVar.b, aVarArr2, cVar.d, cVar.e, cVar.f);
                s(new com.amazon.aps.iva.p6.c(r0Var2, this.v));
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final b0 b() {
        return this.k.b();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        boolean z;
        r rVar = (r) uVar;
        v.b bVar = rVar.b;
        if (bVar.a()) {
            C0605b[][] c0605bArr = this.w;
            int i = bVar.b;
            C0605b[] c0605bArr2 = c0605bArr[i];
            int i2 = bVar.c;
            C0605b c0605b = c0605bArr2[i2];
            c0605b.getClass();
            ArrayList arrayList = c0605b.b;
            arrayList.remove(rVar);
            rVar.i();
            if (arrayList.isEmpty()) {
                if (c0605b.d != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    g.b bVar2 = (g.b) b.this.h.remove(c0605b.a);
                    bVar2.getClass();
                    v vVar = bVar2.a;
                    vVar.n(bVar2.b);
                    g<T>.a aVar = bVar2.c;
                    vVar.f(aVar);
                    vVar.i(aVar);
                }
                this.w[i][i2] = null;
                return;
            }
            return;
        }
        rVar.i();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        com.amazon.aps.iva.q5.c cVar = this.v;
        cVar.getClass();
        if (cVar.c > 0 && bVar.a()) {
            C0605b[][] c0605bArr = this.w;
            int i = bVar.b;
            C0605b[] c0605bArr2 = c0605bArr[i];
            int length = c0605bArr2.length;
            int i2 = bVar.c;
            if (length <= i2) {
                c0605bArr[i] = (C0605b[]) Arrays.copyOf(c0605bArr2, i2 + 1);
            }
            C0605b c0605b = this.w[i][i2];
            if (c0605b == null) {
                c0605b = new C0605b(bVar);
                this.w[i][i2] = c0605b;
                z();
            }
            r rVar = new r(bVar, bVar2, j);
            c0605b.b.add(rVar);
            v vVar = c0605b.d;
            if (vVar != null) {
                rVar.l(vVar);
                Uri uri = c0605b.c;
                uri.getClass();
                rVar.h = new c(uri);
            }
            r0 r0Var = c0605b.e;
            if (r0Var != null) {
                rVar.g(new v.b(bVar.d, r0Var.n(0)));
            }
            return rVar;
        }
        r rVar2 = new r(bVar, bVar2, j);
        rVar2.l(this.k);
        rVar2.g(bVar);
        return rVar2;
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(y yVar) {
        this.j = yVar;
        this.i = g0.m(null);
        d dVar = new d();
        this.t = dVar;
        y(x, this.k);
        this.r.post(new com.amazon.aps.iva.n4.d(6, this, dVar));
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.a
    public final void t() {
        super.t();
        d dVar = this.t;
        dVar.getClass();
        this.t = null;
        dVar.b = true;
        dVar.a.removeCallbacksAndMessages(null);
        this.u = null;
        this.v = null;
        this.w = new C0605b[0];
        this.r.post(new g1(3, this, dVar));
    }

    @Override // com.amazon.aps.iva.o6.g
    public final v.b u(v.b bVar, v.b bVar2) {
        v.b bVar3 = bVar;
        if (bVar3.a()) {
            return bVar3;
        }
        return bVar2;
    }

    @Override // com.amazon.aps.iva.o6.g
    public final void x(v.b bVar, v vVar, r0 r0Var) {
        v.b bVar2 = bVar;
        boolean z = true;
        int i = 0;
        if (bVar2.a()) {
            C0605b c0605b = this.w[bVar2.b][bVar2.c];
            c0605b.getClass();
            if (r0Var.j() != 1) {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            if (c0605b.e == null) {
                Object n = r0Var.n(0);
                while (true) {
                    ArrayList arrayList = c0605b.b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    r rVar = (r) arrayList.get(i);
                    rVar.g(new v.b(rVar.b.d, n));
                    i++;
                }
            }
            c0605b.e = r0Var;
        } else {
            if (r0Var.j() != 1) {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            this.u = r0Var;
        }
        A();
    }

    public final void z() {
        boolean z;
        Uri uri;
        b bVar;
        com.amazon.aps.iva.q5.c cVar = this.v;
        if (cVar == null) {
            return;
        }
        for (int i = 0; i < this.w.length; i++) {
            int i2 = 0;
            while (true) {
                C0605b[] c0605bArr = this.w[i];
                if (i2 < c0605bArr.length) {
                    C0605b c0605b = c0605bArr[i2];
                    c.a a2 = cVar.a(i);
                    if (c0605b != null) {
                        if (c0605b.d != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Uri[] uriArr = a2.e;
                            if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                                b0.b bVar2 = new b0.b();
                                bVar2.b = uri;
                                b0.e eVar = this.l;
                                if (eVar != null) {
                                    bVar2.e = new b0.e.a(eVar);
                                }
                                v d2 = this.m.d(bVar2.a());
                                c0605b.d = d2;
                                c0605b.c = uri;
                                int i3 = 0;
                                while (true) {
                                    ArrayList arrayList = c0605b.b;
                                    int size = arrayList.size();
                                    bVar = b.this;
                                    if (i3 >= size) {
                                        break;
                                    }
                                    r rVar = (r) arrayList.get(i3);
                                    rVar.l(d2);
                                    rVar.h = new c(uri);
                                    i3++;
                                }
                                bVar.y(c0605b.a, d2);
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }
}
