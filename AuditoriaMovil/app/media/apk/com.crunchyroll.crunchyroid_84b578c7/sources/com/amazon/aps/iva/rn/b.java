package com.amazon.aps.iva.rn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.g;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SortAndFiltersHeaderPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> {
    public final i b;

    /* compiled from: SortAndFiltersHeaderPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<g, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            j.f(gVar2, "it");
            boolean z = !gVar2.b.b().isEmpty();
            b bVar = b.this;
            if (z) {
                bVar.getView().qh();
            } else {
                bVar.getView().M7();
            }
            bVar.getView().setCurrentSort(gVar2.a.a.getCriteria());
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, i iVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        j.f(iVar, "interactor");
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a aVar = new a();
        this.b.u0(getView(), aVar);
    }
}
