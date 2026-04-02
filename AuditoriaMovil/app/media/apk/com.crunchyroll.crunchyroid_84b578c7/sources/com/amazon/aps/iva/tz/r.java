package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
import com.ellation.crunchyroll.presentation.browse.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllNewestDataSource.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.j8.f<Integer, com.amazon.aps.iva.uz.h> implements com.amazon.aps.iva.jz.a, com.amazon.aps.iva.mf.a {
    public final m f;
    public final y0 g;
    public final com.amazon.aps.iva.mn.g h;
    public final List<com.amazon.aps.iva.l10.a> i;
    public final i0 j;
    public final com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> k;
    public final com.amazon.aps.iva.xb0.p<Integer, List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> l;
    public final com.amazon.aps.iva.xb0.p<Integer, Throwable, com.amazon.aps.iva.kb0.q> m;
    public final /* synthetic */ com.amazon.aps.iva.jz.b n;
    public final com.amazon.aps.iva.jz.d o;

    /* compiled from: BrowseAllNewestDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> i;
        public final /* synthetic */ Integer j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.a<Integer, com.amazon.aps.iva.uz.h> aVar, Integer num) {
            super(1);
            this.i = aVar;
            this.j = num;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(v0 v0Var) {
            v0 v0Var2 = v0Var;
            com.amazon.aps.iva.yb0.j.f(v0Var2, "browsePanelModel");
            ArrayList a = r.this.j.a(v0Var2.a);
            int size = a.size();
            f.a<Integer, com.amazon.aps.iva.uz.h> aVar = this.i;
            if (size < 20) {
                aVar.a(null, a);
            } else {
                aVar.a(Integer.valueOf(this.j.intValue() + 1), a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllNewestDataSource.kt */
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
            r rVar = r.this;
            com.amazon.aps.iva.jz.d dVar = rVar.o;
            dVar.a.add(new s(rVar, this.i, this.j));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r(m mVar, y0 y0Var, com.amazon.aps.iva.mn.g gVar, ArrayList arrayList, j0 j0Var, a.b bVar, a.c cVar, a.d dVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(y0Var, "sectionIndexer");
        this.f = mVar;
        this.g = y0Var;
        this.h = gVar;
        this.i = arrayList;
        this.j = j0Var;
        this.k = bVar;
        this.l = cVar;
        this.m = dVar;
        this.n = new com.amazon.aps.iva.jz.b(mVar);
        this.o = new com.amazon.aps.iva.jz.d();
    }

    @Override // com.amazon.aps.iva.jz.a
    public final void destroy() {
        this.n.destroy();
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void j(f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
        com.amazon.aps.iva.yb0.j.f(c0407f, "params");
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        Integer num = c0407f.a;
        if (num != null) {
            this.f.h1(20, num.intValue() * 20, this.h.b(), this.i, new a(aVar, num), new b(c0407f, aVar));
        } else {
            aVar.a(null, com.amazon.aps.iva.lb0.z.b);
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
        this.k.invoke(arrayList);
        this.f.h1(eVar.a, 0, this.h.b(), this.i, new t(this, dVar), new u(this, dVar));
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.o.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
