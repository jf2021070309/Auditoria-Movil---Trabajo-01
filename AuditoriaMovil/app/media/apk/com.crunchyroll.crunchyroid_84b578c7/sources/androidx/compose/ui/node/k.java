package androidx.compose.ui.node;

import androidx.compose.ui.node.f;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.s1.b0;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.e0;
import java.util.LinkedHashMap;
/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes.dex */
public abstract class k extends e0 implements c0 {
    public final o i;
    public long j;
    public LinkedHashMap k;
    public final b0 l;
    public com.amazon.aps.iva.s1.e0 m;
    public final LinkedHashMap n;

    public k(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinator");
        this.i = oVar;
        this.j = com.amazon.aps.iva.o2.h.b;
        this.l = new b0(this);
        this.n = new LinkedHashMap();
    }

    public static final void c1(k kVar, com.amazon.aps.iva.s1.e0 e0Var) {
        q qVar;
        boolean z;
        if (e0Var != null) {
            kVar.getClass();
            kVar.s0(com.amazon.aps.iva.o2.k.a(e0Var.getWidth(), e0Var.getHeight()));
            qVar = q.a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            kVar.s0(0L);
        }
        if (!com.amazon.aps.iva.yb0.j.a(kVar.m, e0Var) && e0Var != null) {
            LinkedHashMap linkedHashMap = kVar.k;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if ((!z || (!e0Var.c().isEmpty())) && !com.amazon.aps.iva.yb0.j.a(e0Var.c(), kVar.k)) {
                f.a aVar = kVar.i.i.A.o;
                com.amazon.aps.iva.yb0.j.c(aVar);
                aVar.q.g();
                LinkedHashMap linkedHashMap2 = kVar.k;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    kVar.k = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(e0Var.c());
            }
        }
        kVar.m = e0Var;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final e0 C0() {
        o oVar = this.i.j;
        if (oVar != null) {
            return oVar.p1();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final com.amazon.aps.iva.s1.q D0() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final boolean G0() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final e H0() {
        return this.i.i;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final com.amazon.aps.iva.s1.e0 M0() {
        com.amazon.aps.iva.s1.e0 e0Var = this.m;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.i.O0();
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final e0 Q0() {
        o oVar = this.i.k;
        if (oVar != null) {
            return oVar.p1();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final long W0() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final void a1() {
        r0(this.j, 0.0f, null);
    }

    @Override // com.amazon.aps.iva.s1.g0, com.amazon.aps.iva.s1.l
    public final Object b() {
        return this.i.b();
    }

    public void d1() {
        u0.a.C0692a c0692a = u0.a.a;
        int width = M0().getWidth();
        com.amazon.aps.iva.o2.l lVar = this.i.i.t;
        com.amazon.aps.iva.s1.q qVar = u0.a.d;
        c0692a.getClass();
        int i = u0.a.c;
        com.amazon.aps.iva.o2.l lVar2 = u0.a.b;
        u0.a.c = width;
        u0.a.b = lVar;
        boolean l = u0.a.C0692a.l(c0692a, this);
        M0().d();
        this.h = l;
        u0.a.c = i;
        u0.a.b = lVar2;
        u0.a.d = qVar;
    }

    public final long g1(k kVar) {
        long j = com.amazon.aps.iva.o2.h.b;
        k kVar2 = this;
        while (!com.amazon.aps.iva.yb0.j.a(kVar2, kVar)) {
            long j2 = kVar2.j;
            j = w.e(((int) (j >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(j));
            o oVar = kVar2.i.k;
            com.amazon.aps.iva.yb0.j.c(oVar);
            kVar2 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(kVar2);
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.i.getDensity();
    }

    @Override // com.amazon.aps.iva.s1.m
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return this.i.i.t;
    }

    @Override // com.amazon.aps.iva.s1.u0
    public final void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
        if (!com.amazon.aps.iva.o2.h.a(this.j, j)) {
            this.j = j;
            o oVar = this.i;
            f.a aVar = oVar.i.A.o;
            if (aVar != null) {
                aVar.D0();
            }
            e0.Y0(oVar);
        }
        if (this.g) {
            return;
        }
        d1();
    }
}
