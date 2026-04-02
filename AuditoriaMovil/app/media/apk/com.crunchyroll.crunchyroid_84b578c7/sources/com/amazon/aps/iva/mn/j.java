package com.amazon.aps.iva.mn;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qn.b;
import java.util.List;
/* compiled from: SortAndFiltersInteractor.kt */
/* loaded from: classes2.dex */
public final class j implements i {
    public final List<m> a;
    public final List<c> b;
    public final o c;
    public final e d;
    public final v<g> e;

    /* compiled from: SortAndFiltersInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public a(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends m> list, List<? extends c> list2, o oVar, e eVar) {
        com.amazon.aps.iva.yb0.j.f(list2, "filterOptions");
        com.amazon.aps.iva.yb0.j.f(eVar, "defaultFilters");
        this.a = list;
        this.b = list2;
        this.c = oVar;
        this.d = eVar;
        this.e = new v<>(new g(oVar, eVar));
    }

    @Override // com.amazon.aps.iva.mn.i
    public final List<m> p0() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.mn.i
    public final List<c> r0() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mn.i
    public final void s0(e eVar) {
        v<g> vVar = this.e;
        g d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        vVar.k(g.a(d, null, eVar, 1));
    }

    @Override // com.amazon.aps.iva.mn.i
    public final void t0(b bVar, b.c cVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "filter");
        v<g> vVar = this.e;
        g d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        g gVar = d;
        vVar.k(g.a(gVar, null, gVar.b.a(bVar), 1));
        g d2 = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d2);
        cVar.invoke(d2.b);
    }

    @Override // com.amazon.aps.iva.mn.i
    public final void u0(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xb0.l<? super g, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.e.e(oVar, new a(lVar));
    }

    @Override // com.amazon.aps.iva.mn.i
    public final void v0(o oVar) {
        v<g> vVar = this.e;
        g d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        vVar.k(g.a(d, oVar, null, 2));
    }

    @Override // com.amazon.aps.iva.mn.i
    public final void w0(com.amazon.aps.iva.xb0.l<? super e, q> lVar) {
        v<g> vVar = this.e;
        com.amazon.aps.iva.yb0.j.c(vVar.d());
        o oVar = this.c;
        com.amazon.aps.iva.yb0.j.f(oVar, "sorting");
        e eVar = this.d;
        com.amazon.aps.iva.yb0.j.f(eVar, "filters");
        vVar.k(new g(oVar, eVar));
        g d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        lVar.invoke(d.b);
    }
}
