package com.amazon.aps.iva.pn;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.pn.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: FilterstSelectionViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.ez.b implements f {
    public final i b;
    public com.amazon.aps.iva.mn.e c;
    public final v<com.amazon.aps.iva.mn.e> d;
    public final List<com.amazon.aps.iva.mn.c> e;

    /* compiled from: FilterstSelectionViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.g, q> {
        public final /* synthetic */ o i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, e.b bVar) {
            super(1);
            this.i = oVar;
            this.j = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.mn.g gVar) {
            com.amazon.aps.iva.mn.g gVar2 = gVar;
            j.f(gVar2, "sortAndFilters");
            com.amazon.aps.iva.mn.e eVar = gVar2.b;
            g gVar3 = g.this;
            gVar3.c = eVar;
            v<com.amazon.aps.iva.mn.e> vVar = gVar3.d;
            vVar.e(this.i, new b(this.j));
            com.amazon.aps.iva.mn.e d = vVar.d();
            if (d == null && (d = gVar3.c) == null) {
                j.m("initialFilters");
                throw null;
            }
            vVar.k(d);
            return q.a;
        }
    }

    /* compiled from: FilterstSelectionViewModel.kt */
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
    public g(i iVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        j.f(iVar, "interactor");
        this.b = iVar;
        this.d = new v<>();
        this.e = iVar.r0();
    }

    @Override // com.amazon.aps.iva.pn.f
    public final boolean L() {
        com.amazon.aps.iva.mn.e d = this.d.d();
        com.amazon.aps.iva.mn.e eVar = this.c;
        if (eVar != null) {
            return !j.a(d, eVar);
        }
        j.m("initialFilters");
        throw null;
    }

    @Override // com.amazon.aps.iva.pn.f
    public final void P3(com.amazon.aps.iva.mn.b bVar, boolean z) {
        com.amazon.aps.iva.mn.e a2;
        v<com.amazon.aps.iva.mn.e> vVar = this.d;
        if (z) {
            com.amazon.aps.iva.mn.e d = vVar.d();
            j.c(d);
            a2 = d.c(bVar);
        } else {
            com.amazon.aps.iva.mn.e d2 = vVar.d();
            j.c(d2);
            a2 = d2.a(bVar);
        }
        vVar.k(a2);
    }

    @Override // com.amazon.aps.iva.pn.f
    public final void Y6(e.a aVar) {
        v<com.amazon.aps.iva.mn.e> vVar = this.d;
        com.amazon.aps.iva.mn.e d = vVar.d();
        j.c(d);
        this.b.s0(d);
        com.amazon.aps.iva.mn.e d2 = vVar.d();
        j.c(d2);
        aVar.invoke(d2);
    }

    @Override // com.amazon.aps.iva.pn.f
    public final void f0(o oVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.mn.e, q> lVar) {
        j.f(oVar, "lifecycleOwner");
        this.b.u0(oVar, new a(oVar, (e.b) lVar));
    }

    @Override // com.amazon.aps.iva.pn.f
    public final void i6(com.amazon.aps.iva.mn.b bVar) {
        j.f(bVar, "option");
        v<com.amazon.aps.iva.mn.e> vVar = this.d;
        com.amazon.aps.iva.mn.e d = vVar.d();
        j.c(d);
        vVar.k(d.c(bVar));
    }

    @Override // com.amazon.aps.iva.pn.f
    public final List<com.amazon.aps.iva.mn.c> r0() {
        return this.e;
    }
}
