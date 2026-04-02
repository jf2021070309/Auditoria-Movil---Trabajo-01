package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.m;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.browse.BrowseSectionItem;
import com.ellation.crunchyroll.presentation.browse.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: BrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.j8.m<com.amazon.aps.iva.uz.h> implements com.amazon.aps.iva.jz.a, com.amazon.aps.iva.mf.a {
    public final m c;
    public final y0 d;
    public final com.amazon.aps.iva.mn.g e;
    public final List<com.amazon.aps.iva.l10.a> f;
    public final l0 g;
    public final com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> h;
    public final com.amazon.aps.iva.xb0.p<Integer, List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> i;
    public final com.amazon.aps.iva.xb0.p<Integer, Throwable, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ com.amazon.aps.iva.jz.b k;
    public final com.amazon.aps.iva.jz.d l;

    /* compiled from: BrowseAllDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, com.amazon.aps.iva.xb0.l<? super List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> lVar) {
            super(1);
            this.i = i;
            this.j = i2;
            this.k = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(v0 v0Var) {
            v0 v0Var2 = v0Var;
            com.amazon.aps.iva.yb0.j.f(v0Var2, "browsePanelModel");
            f fVar = f.this;
            l0 l0Var = fVar.g;
            int i = this.j;
            int i2 = this.i;
            ArrayList a = l0Var.a(i2, i, v0Var2.a);
            this.k.invoke(a);
            fVar.i.invoke(Integer.valueOf(i2), a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, f fVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
            super(1);
            this.h = lVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
            this.l = lVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            Throwable th2 = th;
            com.amazon.aps.iva.yb0.j.f(th2, "e");
            this.h.invoke(th2);
            f fVar = this.i;
            fVar.j.invoke(Integer.valueOf(this.j), th2);
            fVar.l.a.add(new g(this.k, this.j, fVar, this.l, this.h));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public f(m mVar, y0 y0Var, com.amazon.aps.iva.mn.g gVar, ArrayList arrayList, m0 m0Var, a.b bVar, a.c cVar, a.d dVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(y0Var, "sectionIndexer");
        this.c = mVar;
        this.d = y0Var;
        this.e = gVar;
        this.f = arrayList;
        this.g = m0Var;
        this.h = bVar;
        this.i = cVar;
        this.j = dVar;
        this.k = new com.amazon.aps.iva.jz.b(mVar);
        this.l = new com.amazon.aps.iva.jz.d();
    }

    @Override // com.amazon.aps.iva.jz.a
    public final void destroy() {
        this.k.destroy();
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void g(m.d dVar, m.c cVar) {
        this.d.a(com.amazon.aps.iva.ee0.f1.J(new BrowseSectionItem("", 0, 0, "")));
        List J = com.amazon.aps.iva.ee0.f1.J(new h.d("", ""));
        int i = dVar.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.h.invoke(com.amazon.aps.iva.lb0.x.L0(arrayList, J));
        com.amazon.aps.iva.mn.e eVar = this.e.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.amazon.aps.iva.mn.b bVar : eVar.b()) {
            linkedHashMap.putAll(bVar.getUrlParams());
        }
        int i3 = dVar.a;
        this.c.M(linkedHashMap, this.f, new com.amazon.aps.iva.tz.b(this, i, i3, cVar), new c(this, i3));
    }

    @Override // com.amazon.aps.iva.j8.m
    public final void h(m.g gVar, m.f fVar) {
        i(gVar.b, gVar.a, new d(fVar), new e(com.amazon.aps.iva.mf0.a.a));
    }

    public final void i(int i, int i2, com.amazon.aps.iva.xb0.l<? super List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar2) {
        int i3;
        y0 y0Var = this.d;
        int e = i - y0Var.e(i2, (i2 + i) - 1);
        int e2 = i2 - y0Var.e(0, i2 - 1);
        m mVar = this.c;
        if (e2 > 0) {
            i3 = e2;
        } else {
            i3 = 0;
        }
        mVar.h1(e, i3, this.e.b(), this.f, new a(i2, i, lVar), new b(i2, i, this, lVar2, lVar));
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.l.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
