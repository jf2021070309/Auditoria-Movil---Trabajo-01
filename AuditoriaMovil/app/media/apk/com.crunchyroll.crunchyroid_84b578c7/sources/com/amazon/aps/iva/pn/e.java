package com.amazon.aps.iva.pn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: FiltersPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<h> implements com.amazon.aps.iva.pn.b {
    public final f b;
    public final com.amazon.aps.iva.mn.h c;
    public boolean d;

    /* compiled from: FiltersPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> {
        public final /* synthetic */ com.amazon.aps.iva.fs.b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.fs.b bVar) {
            super(1);
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.mn.e eVar) {
            com.amazon.aps.iva.mn.e eVar2 = eVar;
            j.f(eVar2, "filters");
            e.this.c.e(eVar2, this.i);
            return q.a;
        }
    }

    /* compiled from: FiltersPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.mn.e eVar) {
            com.amazon.aps.iva.mn.e eVar2 = eVar;
            j.f(eVar2, "filters");
            e eVar3 = e.this;
            if (!eVar3.d) {
                f fVar = eVar3.b;
                List<com.amazon.aps.iva.mn.c> r0 = fVar.r0();
                for (com.amazon.aps.iva.mn.c cVar : r0) {
                    if (cVar instanceof com.amazon.aps.iva.mn.d) {
                        eVar3.getView().Wa(cVar.getTitle(), cVar.getOptions(), (com.amazon.aps.iva.mn.b) x.s0(x.y0(cVar.getOptions(), eVar2.getAll())), new c(eVar3));
                    } else if (cVar instanceof com.amazon.aps.iva.mn.a) {
                        int title = cVar.getTitle();
                        List<com.amazon.aps.iva.mn.b> all = eVar2.getAll();
                        com.amazon.aps.iva.mn.b bVar = ((com.amazon.aps.iva.mn.a) cVar).b;
                        eVar3.getView().Dg(title, bVar, all.contains(bVar), new d(eVar3, cVar));
                    }
                    if (!j.a(cVar, x.D0(r0))) {
                        eVar3.getView().o5();
                    }
                    h view = eVar3.getView();
                    if (fVar.L()) {
                        view.u1();
                    } else {
                        view.V0();
                    }
                }
            }
            eVar3.d = true;
            return q.a;
        }
    }

    public e(com.amazon.aps.iva.pn.a aVar, g gVar, com.amazon.aps.iva.mn.h hVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
        this.c = hVar;
    }

    @Override // com.amazon.aps.iva.pn.b
    public final void N(com.amazon.aps.iva.fs.b bVar) {
        this.b.Y6(new a(bVar));
        getView().close();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().V0();
        b bVar = new b();
        this.b.f0(getView(), bVar);
    }
}
