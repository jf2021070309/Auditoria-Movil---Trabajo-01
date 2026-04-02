package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kj.a;
import com.amazon.aps.iva.pj.b;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.yb0.e0;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerDataComponent.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.fj.f<a> {
    public final o c;
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> d;
    public com.amazon.aps.iva.xe0.d e;
    public final l0 f;

    public n(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "playerDataSource");
        this.c = oVar;
        this.d = f1.K(e0.a(com.amazon.aps.iva.pj.e.class), e0.a(com.amazon.aps.iva.pj.b.class));
        this.f = t.g(0, 0, null, 7);
    }

    public static final boolean j(n nVar, String str) {
        Object obj;
        String str2;
        nVar.getClass();
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            Iterator<T> it = hVar.i().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.kk.b) obj).a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.amazon.aps.iva.kk.b bVar = (com.amazon.aps.iva.kk.b) obj;
            if (bVar != null) {
                str2 = bVar.b;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                com.amazon.aps.iva.cj.h hVar2 = com.amazon.aps.iva.cj.n.e;
                if (hVar2 != null) {
                    if (((com.amazon.aps.iva.nk.j) hVar2.getState().getValue()).j == null) {
                        return false;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("player");
                    throw null;
                }
            }
            return true;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(com.amazon.aps.iva.xb0.l<? super a, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        lVar.invoke(new a());
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
        com.amazon.aps.iva.xe0.d dVar = this.e;
        if (dVar != null) {
            z.l(dVar, null);
        }
        this.e = null;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> f() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        boolean z = aVar instanceof e.p;
        l0 l0Var = this.f;
        if (z) {
            e.p pVar = (e.p) aVar;
            if (pVar.b == com.amazon.aps.iva.qj.i.NEXT) {
                String str = pVar.a.a;
                com.amazon.aps.iva.yb0.j.c(str);
                Object a = l0Var.a(new a.c(str), dVar);
                if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    return a;
                }
                return q.a;
            }
        } else if (aVar instanceof b.C0619b) {
            Object a2 = l0Var.a(a.C0445a.a, dVar);
            if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return a2;
            }
            return q.a;
        } else if (aVar instanceof e.C0623e) {
            Object a3 = l0Var.a(a.b.a, dVar);
            if (a3 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return a3;
            }
            return q.a;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
        com.amazon.aps.iva.xe0.d j = z.j();
        this.e = j;
        o oVar = this.c;
        com.amazon.aps.iva.dg.b.A(j, new a0(oVar.u3(), new h(this, null)));
        com.amazon.aps.iva.dg.b.A(j, new a0(oVar.f5(), new i(this, null)));
        com.amazon.aps.iva.dg.b.A(j, new a0(oVar.A4(), new j(this, null)));
        com.amazon.aps.iva.dg.b.A(j, new a0(new com.amazon.aps.iva.ve0.z(oVar.x2()), new k(this, null)));
        com.amazon.aps.iva.xe0.d dVar = this.e;
        com.amazon.aps.iva.yb0.j.c(dVar);
        com.amazon.aps.iva.dg.b.A(dVar, new a0(oVar.f2(), new l(this, null)));
        com.amazon.aps.iva.dg.b.A(dVar, new a0(oVar.V2(), new m(this, null)));
    }

    public final String k() {
        return n.class.getSimpleName();
    }
}
