package com.amazon.aps.iva.tn;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mn.g;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.n;
import com.amazon.aps.iva.mn.o;
import com.amazon.aps.iva.tn.c;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: SortSelectionViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.ez.b implements d {
    public final i b;
    public o c;
    public final v<o> d;
    public final List<m> e;

    /* compiled from: SortSelectionViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<g, q> {
        public final /* synthetic */ com.amazon.aps.iva.i5.o i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<o, q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.i5.o oVar, c.b bVar) {
            super(1);
            this.i = oVar;
            this.j = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            j.f(gVar2, "sortAndFilters");
            o oVar = gVar2.a;
            e eVar = e.this;
            eVar.c = oVar;
            v<o> vVar = eVar.d;
            vVar.e(this.i, new b(this.j));
            o d = vVar.d();
            if (d == null && (d = eVar.c) == null) {
                j.m("initialSorting");
                throw null;
            }
            vVar.k(d);
            return q.a;
        }
    }

    /* compiled from: SortSelectionViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(com.amazon.aps.iva.xb0.l lVar) {
            j.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        j.f(iVar, "interactor");
        this.b = iVar;
        this.d = new v<>();
        this.e = iVar.p0();
    }

    @Override // com.amazon.aps.iva.tn.d
    public final boolean L() {
        o d = this.d.d();
        o oVar = this.c;
        if (oVar != null) {
            return !j.a(d, oVar);
        }
        j.m("initialSorting");
        throw null;
    }

    @Override // com.amazon.aps.iva.tn.d
    public final void W0(m mVar) {
        j.f(mVar, "option");
        this.d.k(new o(mVar, (n) x.v0(mVar.getOrderOptions())));
    }

    @Override // com.amazon.aps.iva.tn.d
    public final void f0(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xb0.l<? super o, q> lVar) {
        j.f(oVar, "lifecycleOwner");
        this.b.u0(oVar, new a(oVar, (c.b) lVar));
    }

    @Override // com.amazon.aps.iva.tn.d
    public final void h8(n nVar) {
        j.f(nVar, "order");
        v<o> vVar = this.d;
        o d = vVar.d();
        j.c(d);
        m mVar = d.a;
        j.f(mVar, "option");
        vVar.k(new o(mVar, nVar));
    }

    @Override // com.amazon.aps.iva.tn.d
    public final List<m> p0() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.tn.d
    public final void q4(c.a aVar) {
        v<o> vVar = this.d;
        o d = vVar.d();
        j.c(d);
        this.b.v0(d);
        o d2 = vVar.d();
        j.c(d2);
        aVar.invoke(d2);
    }
}
