package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.y0.m;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public abstract class h {
    public k a;
    public int b;
    public boolean c;
    public int d;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static Object a(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.a aVar) {
            b bVar;
            h k0Var;
            com.amazon.aps.iva.yb0.j.f(aVar, "block");
            if (lVar == null) {
                return aVar.invoke();
            }
            h hVar = (h) m.b.a();
            if (hVar != null && !(hVar instanceof b)) {
                if (lVar == null) {
                    return aVar.invoke();
                }
                k0Var = hVar.t(lVar);
            } else {
                if (hVar instanceof b) {
                    bVar = (b) hVar;
                } else {
                    bVar = null;
                }
                k0Var = new k0(bVar, lVar, null, true, false);
            }
            try {
                h j = k0Var.j();
                Object invoke = aVar.invoke();
                h.p(j);
                return invoke;
            } finally {
                k0Var.c();
            }
        }
    }

    public h(int i, k kVar) {
        int i2;
        int n;
        this.a = kVar;
        this.b = i;
        if (i != 0) {
            k e = e();
            m.a aVar = m.a;
            com.amazon.aps.iva.yb0.j.f(e, "invalid");
            int[] iArr = e.e;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = e.c;
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                int i4 = e.d;
                if (i3 != 0) {
                    n = com.amazon.aps.iva.cq.b.n(j);
                } else {
                    long j2 = e.b;
                    if (j2 != 0) {
                        i4 += 64;
                        n = com.amazon.aps.iva.cq.b.n(j2);
                    }
                }
                i = n + i4;
            }
            synchronized (m.c) {
                i2 = m.f.a(i);
            }
        } else {
            i2 = -1;
        }
        this.d = i2;
    }

    public static void p(h hVar) {
        m.b.e(hVar);
    }

    public final void a() {
        synchronized (m.c) {
            b();
            o();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public void b() {
        m.d = m.d.d(d());
    }

    public void c() {
        this.c = true;
        synchronized (m.c) {
            int i = this.d;
            if (i >= 0) {
                m.v(i);
                this.d = -1;
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public int d() {
        return this.b;
    }

    public k e() {
        return this.a;
    }

    public abstract com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i();

    public final h j() {
        n3 n3Var = m.b;
        h hVar = (h) n3Var.a();
        n3Var.e(this);
        return hVar;
    }

    public abstract void k(h hVar);

    public abstract void l(h hVar);

    public abstract void m();

    public abstract void n(h0 h0Var);

    public void o() {
        int i = this.d;
        if (i >= 0) {
            m.v(i);
            this.d = -1;
        }
    }

    public void q(int i) {
        this.b = i;
    }

    public void r(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<set-?>");
        this.a = kVar;
    }

    public void s(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar);
}
