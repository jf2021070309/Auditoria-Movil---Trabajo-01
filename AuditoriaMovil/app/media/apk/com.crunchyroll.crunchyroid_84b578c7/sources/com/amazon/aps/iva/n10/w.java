package com.amazon.aps.iva.n10;

import com.amazon.aps.iva.ks.n;
import com.amazon.aps.iva.n10.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: GenrePresenter.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.wy.b<z> implements s {
    public final com.amazon.aps.iva.l10.a b;
    public final h c;
    public final com.amazon.aps.iva.ws.d d;
    public final com.amazon.aps.iva.n60.b e;
    public final com.amazon.aps.iva.k50.h f;
    public final com.ellation.crunchyroll.watchlist.a g;
    public final com.amazon.aps.iva.oh.g h;

    /* compiled from: GenrePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n10.b>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n10.b>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n10.b>> gVar2 = gVar;
            w wVar = w.this;
            gVar2.c(new t(wVar));
            gVar2.e(new u(wVar));
            gVar2.b(new v(wVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: GenrePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            w.this.c.K5();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: GenrePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, Integer, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Integer num, Integer num2) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            w wVar = w.this;
            if (!w.q6(wVar).q0()) {
                w.q6(wVar).n9(intValue, intValue2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: GenrePresenter.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, com.amazon.aps.iva.l10.a aVar, i iVar, com.amazon.aps.iva.ws.f fVar, com.amazon.aps.iva.n60.c cVar, j.e eVar, com.ellation.crunchyroll.watchlist.a aVar2, com.amazon.aps.iva.oh.g gVar) {
        super(zVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(zVar, "view");
        this.b = aVar;
        this.c = iVar;
        this.d = fVar;
        this.e = cVar;
        this.f = eVar;
        this.g = aVar2;
        this.h = gVar;
    }

    public static final /* synthetic */ z q6(w wVar) {
        return wVar.getView();
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.c.W5(jVar, new c());
    }

    @Override // com.amazon.aps.iva.n10.s
    public final void b() {
        this.c.K5();
    }

    @Override // com.amazon.aps.iva.n10.s
    public final void e2(Panel panel, int i, int i2, String str) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(str, "subcategoryId");
        this.f.t(panel);
        com.amazon.aps.iva.l10.a aVar = this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "parentGenre");
        this.d.b(new com.amazon.aps.iva.ws.e(i, i2, com.amazon.aps.iva.js.v.GENRE_BROWSE, com.amazon.aps.iva.js.t.CAROUSEL, new n.b(com.amazon.aps.iva.e.w.w(panel), aVar.b, str)));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.l10.a aVar = this.b;
        getView().Wd(aVar.c);
        List<Image> list = aVar.d;
        if (!list.isEmpty()) {
            getView().Gf(list);
            getView().w1();
        } else {
            getView().k1();
        }
        this.c.t7().e(getView(), new d(new a()));
        this.g.a(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        getView().ib();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.e.b(new b());
    }
}
