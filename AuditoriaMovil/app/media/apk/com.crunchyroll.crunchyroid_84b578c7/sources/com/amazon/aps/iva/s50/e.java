package com.amazon.aps.iva.s50;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.showrating.ratingview.ShowRatingLayout;
/* compiled from: ShowRatingPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<g> {
    public final h b;
    public final com.amazon.aps.iva.l60.a c;

    /* compiled from: ShowRatingPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends f>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends f> gVar) {
            com.amazon.aps.iva.ez.g<? extends f> gVar2 = gVar;
            e eVar = e.this;
            gVar2.c(new com.amazon.aps.iva.s50.b(eVar));
            gVar2.e(new c(eVar));
            gVar2.b(new d(eVar));
            return q.a;
        }
    }

    /* compiled from: ShowRatingPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
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

    public e(ShowRatingLayout showRatingLayout, j jVar, com.amazon.aps.iva.l60.b bVar) {
        super(showRatingLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = jVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.a().e(getView(), new b(new a()));
    }

    public final void q6(com.amazon.aps.iva.m50.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "showRatingInput");
        this.b.m(bVar);
    }

    public final void r6() {
        getView().kg();
        getView().O5();
    }
}
