package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.xd0.b;
import com.amazon.aps.iva.xd0.i;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes4.dex */
public final class z extends p implements com.amazon.aps.iva.oc0.j0 {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(z.class), "fragments", "getFragments()Ljava/util/List;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(z.class), "empty", "getEmpty()Z"))};
    public final g0 d;
    public final com.amazon.aps.iva.nd0.c e;
    public final com.amazon.aps.iva.de0.i f;
    public final com.amazon.aps.iva.de0.i g;
    public final com.amazon.aps.iva.xd0.h h;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            z zVar = z.this;
            g0 g0Var = zVar.d;
            g0Var.A0();
            return Boolean.valueOf(f1.F((o) g0Var.l.getValue(), zVar.e));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.oc0.f0>> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.oc0.f0> invoke() {
            z zVar = z.this;
            g0 g0Var = zVar.d;
            g0Var.A0();
            return f1.O((o) g0Var.l.getValue(), zVar.e);
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd0.i> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xd0.i invoke() {
            z zVar = z.this;
            if (zVar.isEmpty()) {
                return i.b.b;
            }
            List<com.amazon.aps.iva.oc0.f0> p = zVar.p();
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(p));
            for (com.amazon.aps.iva.oc0.f0 f0Var : p) {
                arrayList.add(f0Var.l());
            }
            g0 g0Var = zVar.d;
            com.amazon.aps.iva.nd0.c cVar = zVar.e;
            ArrayList M0 = com.amazon.aps.iva.lb0.x.M0(arrayList, new q0(g0Var, cVar));
            return b.a.a("package view scope for " + cVar + " in " + g0Var.getName(), M0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.de0.l lVar) {
        super(h.a.a, cVar.g());
        com.amazon.aps.iva.yb0.j.f(g0Var, "module");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.d = g0Var;
        this.e = cVar;
        this.f = lVar.g(new b());
        this.g = lVar.g(new a());
        this.h = new com.amazon.aps.iva.xd0.h(lVar, new c());
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.g(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.j0
    public final com.amazon.aps.iva.nd0.c c() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.nd0.c cVar = this.e;
        if (cVar.d()) {
            return null;
        }
        com.amazon.aps.iva.nd0.c e = cVar.e();
        com.amazon.aps.iva.yb0.j.e(e, "fqName.parent()");
        return this.d.y(e);
    }

    public final boolean equals(Object obj) {
        com.amazon.aps.iva.oc0.j0 j0Var;
        if (obj instanceof com.amazon.aps.iva.oc0.j0) {
            j0Var = (com.amazon.aps.iva.oc0.j0) obj;
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.e, j0Var.c())) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.d, j0Var.x0())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.oc0.j0
    public final boolean isEmpty() {
        return ((Boolean) com.amazon.aps.iva.ab.x.T(this.g, i[1])).booleanValue();
    }

    @Override // com.amazon.aps.iva.oc0.j0
    public final com.amazon.aps.iva.xd0.i l() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oc0.j0
    public final List<com.amazon.aps.iva.oc0.f0> p() {
        return (List) com.amazon.aps.iva.ab.x.T(this.f, i[0]);
    }

    @Override // com.amazon.aps.iva.oc0.j0
    public final g0 x0() {
        return this.d;
    }
}
