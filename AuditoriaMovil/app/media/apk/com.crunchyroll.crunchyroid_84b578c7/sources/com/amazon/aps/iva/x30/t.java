package com.amazon.aps.iva.x30;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import java.util.List;
/* compiled from: SearchResultSummaryPresenter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.wy.b<v> implements p {
    public final String b;
    public final w c;
    public final com.amazon.aps.iva.q30.k d;
    public final com.amazon.aps.iva.c00.f e;
    public final com.amazon.aps.iva.p30.f f;
    public final com.amazon.aps.iva.ty.b g;
    public final com.ellation.crunchyroll.watchlist.a h;
    public final com.amazon.aps.iva.k50.d i;
    public final com.amazon.aps.iva.oh.g j;

    /* compiled from: SearchResultSummaryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>> gVar2 = gVar;
            t tVar = t.this;
            gVar2.c(new q(tVar));
            gVar2.e(new r(tVar));
            gVar2.b(new s(tVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.oh.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.oh.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            t.this.j.H8(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "positions");
            v view = t.this.getView();
            for (Number number : list2) {
                view.s(number.intValue());
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public t(com.amazon.aps.iva.oh.g gVar, com.amazon.aps.iva.ty.d dVar, com.amazon.aps.iva.c00.g gVar2, com.amazon.aps.iva.p30.g gVar3, com.amazon.aps.iva.q30.m mVar, com.ellation.crunchyroll.presentation.search.result.summary.c cVar, y yVar, com.amazon.aps.iva.ii.a aVar, com.ellation.crunchyroll.watchlist.a aVar2, String str) {
        super(cVar, mVar);
        this.b = str;
        this.c = yVar;
        this.d = mVar;
        this.e = gVar2;
        this.f = gVar3;
        this.g = dVar;
        this.h = aVar2;
        this.i = aVar;
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.r30.c
    public final void H4(com.amazon.aps.iva.s30.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "item");
        this.i.C1(new com.amazon.aps.iva.l50.c(jVar.a, jVar.c));
        com.amazon.aps.iva.q30.k kVar = this.d;
        MusicAsset musicAsset = jVar.l;
        kVar.B(musicAsset);
        w wVar = this.c;
        this.f.E(wVar.o5(jVar, com.amazon.aps.iva.s30.j.class), musicAsset, wVar.m1(), false);
    }

    @Override // com.amazon.aps.iva.r30.c
    public final void Q4(com.amazon.aps.iva.s30.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        Panel a2 = kVar.a();
        this.e.a(a2, com.amazon.aps.iva.no.a.SEARCH_ITEM);
        this.d.B1(a2);
        w wVar = this.c;
        this.f.s(wVar.o5(kVar, com.amazon.aps.iva.s30.k.class), a2, wVar.m1(), false);
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.c.a(jVar, new c());
    }

    @Override // com.amazon.aps.iva.x30.a0
    public final void W5(SearchItemsContainerType searchItemsContainerType) {
        com.amazon.aps.iva.yb0.j.f(searchItemsContainerType, "searchType");
        getView().Af(new com.amazon.aps.iva.v30.a(this.c.m1(), searchItemsContainerType));
    }

    @Override // com.amazon.aps.iva.x30.p
    public final void b() {
        getView().O0();
        this.c.A();
    }

    @Override // com.amazon.aps.iva.x30.p
    public final void l4(int i) {
        if (i > 0) {
            this.g.d();
        }
    }

    @Override // com.amazon.aps.iva.x30.p
    public final void n(com.amazon.aps.iva.oh.a aVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        getView().e(str, new b(aVar), u.h);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        boolean z;
        w wVar = this.c;
        wVar.S7().e(getView(), new d(new a()));
        this.h.a(this, getView());
        String str = this.b;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            wVar.i8(str);
        }
    }

    @Override // com.amazon.aps.iva.x30.p
    public final void y0(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "searchString");
        com.amazon.aps.iva.yb0.j.f(aVar, "onComplete");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        w wVar = this.c;
        if (z) {
            wVar.i8(str);
            return;
        }
        wVar.V();
        getView().Id();
        getView().O0();
    }
}
