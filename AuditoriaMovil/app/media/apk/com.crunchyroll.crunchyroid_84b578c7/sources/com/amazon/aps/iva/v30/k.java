package com.amazon.aps.iva.v30;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
import java.util.List;
/* compiled from: SearchResultDetailPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.wy.b<m> implements g {
    public final n b;
    public final com.amazon.aps.iva.q30.k c;
    public final com.amazon.aps.iva.c00.f d;
    public final com.amazon.aps.iva.p30.f e;
    public final com.amazon.aps.iva.v30.a f;
    public final com.ellation.crunchyroll.watchlist.a g;
    public final com.amazon.aps.iva.k50.d h;
    public final com.amazon.aps.iva.oh.g i;

    /* compiled from: SearchResultDetailPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.s30.h>> gVar2 = gVar;
            k kVar = k.this;
            gVar2.c(new h(kVar));
            gVar2.e(new i(kVar));
            gVar2.b(new j(kVar));
            return q.a;
        }
    }

    /* compiled from: SearchResultDetailPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.oh.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.oh.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            k.this.i.H8(this.i);
            return q.a;
        }
    }

    /* compiled from: SearchResultDetailPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "positions");
            m q6 = k.q6(k.this);
            for (Number number : list2) {
                q6.s(number.intValue());
            }
            return q.a;
        }
    }

    /* compiled from: SearchResultDetailPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(a aVar) {
            this.a = aVar;
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

    public k(com.amazon.aps.iva.oh.g gVar, com.amazon.aps.iva.c00.g gVar2, com.amazon.aps.iva.p30.g gVar3, com.amazon.aps.iva.q30.m mVar, com.amazon.aps.iva.v30.a aVar, SearchResultDetailActivity searchResultDetailActivity, o oVar, com.amazon.aps.iva.ii.a aVar2, com.ellation.crunchyroll.watchlist.a aVar3) {
        super(searchResultDetailActivity, mVar);
        this.b = oVar;
        this.c = mVar;
        this.d = gVar2;
        this.e = gVar3;
        this.f = aVar;
        this.g = aVar3;
        this.h = aVar2;
        this.i = gVar;
    }

    public static final /* synthetic */ m q6(k kVar) {
        return kVar.getView();
    }

    @Override // com.amazon.aps.iva.r30.c
    public final void H4(com.amazon.aps.iva.s30.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "item");
        this.h.C1(new com.amazon.aps.iva.l50.c(jVar.a, jVar.c));
        com.amazon.aps.iva.q30.k kVar = this.c;
        MusicAsset musicAsset = jVar.l;
        kVar.B(musicAsset);
        this.e.E(this.b.o5(jVar, com.amazon.aps.iva.s30.j.class), musicAsset, this.f.b, false);
    }

    @Override // com.amazon.aps.iva.r30.c
    public final void Q4(com.amazon.aps.iva.s30.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        Panel a2 = kVar.a();
        this.d.a(a2, com.amazon.aps.iva.no.a.SEARCH_ITEM);
        this.c.B1(a2);
        this.e.s(this.b.o5(kVar, com.amazon.aps.iva.s30.k.class), a2, this.f.b, false);
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.b.a(jVar, new c());
    }

    @Override // com.amazon.aps.iva.v30.g
    public final void b() {
        getView().O0();
        this.b.y1();
    }

    @Override // com.amazon.aps.iva.v30.g
    public final void n(com.amazon.aps.iva.oh.a aVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        getView().e(str, new b(aVar), l.h);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.S7().e(getView(), new d(new a()));
        getView().Mb(this.f.c);
        this.g.a(this, getView());
    }

    @Override // com.amazon.aps.iva.v30.g
    public final void p3(int i, int i2) {
        boolean z = true;
        if (i < i2 - 1) {
            z = false;
        }
        if (z) {
            this.b.I5();
        }
    }

    @Override // com.amazon.aps.iva.v30.g
    public final void u() {
        getView().x();
    }
}
