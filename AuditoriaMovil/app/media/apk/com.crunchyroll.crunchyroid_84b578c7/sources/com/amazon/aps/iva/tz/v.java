package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.browse.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllPopularityDataSource.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.j8.f<Integer, com.amazon.aps.iva.uz.h> implements com.amazon.aps.iva.jz.a, com.amazon.aps.iva.mf.a {
    public final m f;
    public final y0 g;
    public final com.amazon.aps.iva.mn.g h;
    public final List<com.amazon.aps.iva.l10.a> i;
    public final com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> j;
    public final com.amazon.aps.iva.xb0.p<Integer, List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> k;
    public final com.amazon.aps.iva.xb0.p<Integer, Throwable, com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ com.amazon.aps.iva.jz.b m;
    public final com.amazon.aps.iva.jz.d n;

    /* compiled from: BrowseAllPopularityDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> h;
        public final /* synthetic */ Integer i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.a<Integer, com.amazon.aps.iva.uz.h> aVar, Integer num) {
            super(1);
            this.h = aVar;
            this.i = num;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(v0 v0Var) {
            Integer valueOf;
            v0 v0Var2 = v0Var;
            com.amazon.aps.iva.yb0.j.f(v0Var2, "browsePanelModel");
            List<Panel> list = v0Var2.a;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (Panel panel : list) {
                arrayList.add(new h.c.C0774c(panel));
            }
            if (arrayList.isEmpty()) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(this.i.intValue() + 1);
            }
            this.h.a(valueOf, arrayList);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllPopularityDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.C0407f<Integer> i;
        public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
            super(1);
            this.i = c0407f;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            com.amazon.aps.iva.yb0.j.f(th, "it");
            v vVar = v.this;
            com.amazon.aps.iva.jz.d dVar = vVar.n;
            dVar.a.add(new w(vVar, this.i, this.j));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public v(m mVar, y0 y0Var, com.amazon.aps.iva.mn.g gVar, ArrayList arrayList, a.b bVar, a.c cVar, a.d dVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(y0Var, "sectionIndexer");
        this.f = mVar;
        this.g = y0Var;
        this.h = gVar;
        this.i = arrayList;
        this.j = bVar;
        this.k = cVar;
        this.l = dVar;
        this.m = new com.amazon.aps.iva.jz.b(mVar);
        this.n = new com.amazon.aps.iva.jz.d();
    }

    @Override // com.amazon.aps.iva.jz.a
    public final void destroy() {
        this.m.destroy();
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void j(f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
        com.amazon.aps.iva.yb0.j.f(c0407f, "params");
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        Integer num = c0407f.a;
        if (num == null) {
            aVar.a(null, com.amazon.aps.iva.lb0.z.b);
        } else {
            this.f.h1(20, num.intValue() * 20, this.h.b(), this.i, new a(aVar, num), new b(c0407f, aVar));
        }
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void k(f.C0407f c0407f, f.b bVar) {
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void m(f.e eVar, f.d dVar) {
        this.g.a(com.amazon.aps.iva.lb0.z.b);
        int i = eVar.a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.j.invoke(arrayList);
        this.f.h1(eVar.a, 0, this.h.b(), this.i, new x(dVar, this), new y(dVar, this));
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.n.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
