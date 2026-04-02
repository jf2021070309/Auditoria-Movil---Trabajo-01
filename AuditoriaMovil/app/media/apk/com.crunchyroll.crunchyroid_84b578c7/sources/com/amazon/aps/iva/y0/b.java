package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.i;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public class b extends h {
    public static final int[] n = new int[0];
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> e;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f;
    public int g;
    public com.amazon.aps.iva.p0.c<h0> h;
    public ArrayList i;
    public k j;
    public int[] k;
    public int l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, k kVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
        super(i, kVar);
        com.amazon.aps.iva.yb0.j.f(kVar, "invalid");
        this.e = lVar;
        this.f = lVar2;
        this.j = k.f;
        this.k = n;
        this.l = 1;
    }

    public b A(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
        c cVar;
        if (!this.c) {
            B();
            y(d());
            Object obj = m.c;
            synchronized (obj) {
                int i = m.e;
                m.e = i + 1;
                m.d = m.d.j(i);
                k e = e();
                r(e.j(i));
                cVar = new c(i, m.e(d() + 1, i, e), m.l(lVar, this.e, true), m.b(lVar2, this.f), this);
            }
            if (!this.m && !this.c) {
                int d = d();
                synchronized (obj) {
                    int i2 = m.e;
                    m.e = i2 + 1;
                    q(i2);
                    m.d = m.d.j(d());
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
                r(m.e(d + 1, d(), e()));
            }
            return cVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void B() {
        boolean z;
        boolean z2 = true;
        if (this.m) {
            if (this.d >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void b() {
        m.d = m.d.d(d()).b(this.j);
    }

    @Override // com.amazon.aps.iva.y0.h
    public void c() {
        if (!this.c) {
            super.c();
            l(this);
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.y0.h
    public boolean g() {
        return false;
    }

    @Override // com.amazon.aps.iva.y0.h
    public int h() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.y0.h
    public void k(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        this.l++;
    }

    @Override // com.amazon.aps.iva.y0.h
    public void l(h hVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        int i = this.l;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.l = i2;
            if (i2 == 0 && !this.m) {
                com.amazon.aps.iva.p0.c<h0> w = w();
                if (w != null) {
                    if (true ^ this.m) {
                        z(null);
                        int d = d();
                        Object[] objArr = w.c;
                        int i3 = w.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            Object obj = objArr[i4];
                            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            for (i0 n2 = ((h0) obj).n(); n2 != null; n2 = n2.b) {
                                int i5 = n2.a;
                                if (i5 == d || com.amazon.aps.iva.lb0.x.m0(this.j, Integer.valueOf(i5))) {
                                    n2.a = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.amazon.aps.iva.y0.h
    public void m() {
        if (!this.m && !this.c) {
            u();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public void n(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        com.amazon.aps.iva.p0.c<h0> w = w();
        if (w == null) {
            w = new com.amazon.aps.iva.p0.c<>();
            z(w);
        }
        w.add(h0Var);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void o() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            m.v(this.k[i]);
        }
        int i2 = this.d;
        if (i2 >= 0) {
            m.v(i2);
            this.d = -1;
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public void s(int i) {
        this.g = i;
    }

    @Override // com.amazon.aps.iva.y0.h
    public h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        d dVar;
        if (!this.c) {
            B();
            int d = d();
            y(d());
            Object obj = m.c;
            synchronized (obj) {
                int i = m.e;
                m.e = i + 1;
                m.d = m.d.j(i);
                dVar = new d(i, m.e(d + 1, i, e()), lVar, this);
            }
            if (!this.m && !this.c) {
                int d2 = d();
                synchronized (obj) {
                    int i2 = m.e;
                    m.e = i2 + 1;
                    q(i2);
                    m.d = m.d.j(d());
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
                r(m.e(d2 + 1, d(), e()));
            }
            return dVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void u() {
        y(d());
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        if (!this.m && !this.c) {
            int d = d();
            synchronized (m.c) {
                int i = m.e;
                m.e = i + 1;
                q(i);
                m.d = m.d.j(d());
            }
            r(m.e(d + 1, d(), e()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:8:0x002d, B:10:0x0034, B:13:0x0039, B:17:0x0059, B:28:0x009c, B:18:0x006f, B:20:0x0088, B:26:0x0094), top: B:78:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.y0.i v() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y0.b.v():com.amazon.aps.iva.y0.i");
    }

    public com.amazon.aps.iva.p0.c<h0> w() {
        return this.h;
    }

    public final i x(int i, HashMap hashMap, k kVar) {
        i0 t;
        i0 x;
        com.amazon.aps.iva.kb0.j jVar;
        k kVar2 = kVar;
        com.amazon.aps.iva.yb0.j.f(kVar2, "invalidSnapshots");
        k g = e().j(d()).g(this.j);
        com.amazon.aps.iva.p0.c<h0> w = w();
        com.amazon.aps.iva.yb0.j.c(w);
        Object[] objArr = w.c;
        int i2 = w.b;
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (i3 < i2) {
            Object obj = objArr[i3];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            h0 h0Var = (h0) obj;
            i0 n2 = h0Var.n();
            i0 t2 = m.t(n2, i, kVar2);
            if (t2 != null && (t = m.t(n2, d(), g)) != null && !com.amazon.aps.iva.yb0.j.a(t2, t)) {
                i0 t3 = m.t(n2, d(), e());
                if (t3 != null) {
                    if (hashMap == null || (x = (i0) hashMap.get(t2)) == null) {
                        x = h0Var.x(t, t2, t3);
                    }
                    if (x == null) {
                        return new i.a(this);
                    }
                    if (!com.amazon.aps.iva.yb0.j.a(x, t3)) {
                        if (com.amazon.aps.iva.yb0.j.a(x, t2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new com.amazon.aps.iva.kb0.j(h0Var, t2.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(h0Var);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!com.amazon.aps.iva.yb0.j.a(x, t)) {
                                jVar = new com.amazon.aps.iva.kb0.j(h0Var, x);
                            } else {
                                jVar = new com.amazon.aps.iva.kb0.j(h0Var, t.b());
                            }
                            arrayList.add(jVar);
                        }
                    }
                } else {
                    m.s();
                    throw null;
                }
            }
            i3++;
            kVar2 = kVar;
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                com.amazon.aps.iva.kb0.j jVar2 = (com.amazon.aps.iva.kb0.j) arrayList.get(i4);
                h0 h0Var2 = (h0) jVar2.b;
                i0 i0Var = (i0) jVar2.c;
                i0Var.a = d();
                synchronized (m.c) {
                    i0Var.b = h0Var2.n();
                    h0Var2.g(i0Var);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                w.remove((h0) arrayList2.get(i5));
            }
            ArrayList arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayList2 = com.amazon.aps.iva.lb0.x.L0(arrayList2, arrayList3);
            }
            this.i = arrayList2;
        }
        return i.b.a;
    }

    public final void y(int i) {
        synchronized (m.c) {
            this.j = this.j.j(i);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public void z(com.amazon.aps.iva.p0.c<h0> cVar) {
        this.h = cVar;
    }
}
