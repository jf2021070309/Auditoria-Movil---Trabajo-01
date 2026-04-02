package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.similar.SimilarShowsLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: SimilarPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<m> implements d {
    public final n b;
    public final com.amazon.aps.iva.ws.d c;
    public final com.ellation.crunchyroll.watchlist.a d;
    public ContentContainer e;
    public List<? extends com.amazon.aps.iva.uz.h> f;

    /* compiled from: SimilarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.p40.a>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.p40.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.p40.a> gVar2 = gVar;
            h hVar = h.this;
            if (gVar2 != null) {
                gVar2.c(new e(hVar));
            }
            if (gVar2 != null) {
                gVar2.e(new f(hVar));
            }
            if (gVar2 != null) {
                gVar2.b(new g(hVar));
            }
            return q.a;
        }
    }

    /* compiled from: SimilarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "positions");
            m q6 = h.q6(h.this);
            for (Number number : list2) {
                q6.s(number.intValue());
            }
            return q.a;
        }
    }

    /* compiled from: SimilarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(a aVar) {
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

    public h(SimilarShowsLayout similarShowsLayout, n nVar, com.amazon.aps.iva.b50.w wVar, com.amazon.aps.iva.ws.f fVar, com.ellation.crunchyroll.watchlist.a aVar) {
        super(similarShowsLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = nVar;
        this.c = fVar;
        this.d = aVar;
        this.f = z.b;
    }

    public static final /* synthetic */ m q6(h hVar) {
        return hVar.getView();
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.b.q3(jVar, new b());
    }

    @Override // com.amazon.aps.iva.p40.d
    public final void Z1(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        this.e = contentContainer;
        this.b.s1(contentContainer.getId());
    }

    @Override // com.amazon.aps.iva.p40.d
    public final void b() {
        getView().m();
        n nVar = this.b;
        nVar.invalidate();
        ContentContainer contentContainer = this.e;
        if (contentContainer != null) {
            nVar.s1(contentContainer.getId());
        } else {
            com.amazon.aps.iva.yb0.j.m("contentContainer");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.p40.d
    public final void i(Panel panel, int i) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        getView().t(panel);
        d.b.a(this.c, panel, a.C0423a.a(com.amazon.aps.iva.js.k.COLLECTION, 0, i, f0.a(panel), s.c(panel), 32), panel.getFeedTitle(), null, null, 24);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.g3().e(getView(), new c(new a()));
        this.d.a(this, getView());
    }
}
