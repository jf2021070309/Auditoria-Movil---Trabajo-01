package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.w;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRating;
import com.ellation.crunchyroll.ui.userratingbar.UserRatingStarNumber;
/* compiled from: ShowRatingDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.wy.b<o> implements h {
    public final p b;
    public final s c;
    public final f d;
    public final com.amazon.aps.iva.m50.a e;

    /* compiled from: ShowRatingDialogPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends n>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends n> gVar) {
            com.amazon.aps.iva.ez.g<? extends n> gVar2 = gVar;
            k kVar = k.this;
            gVar2.c(new i(kVar));
            gVar2.e(new j(kVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowRatingDialogPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.n50.e>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.n50.e> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.n50.e> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            k kVar = k.this;
            gVar2.e(new l(kVar));
            gVar2.b(new m(kVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowRatingDialogPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowRatingDialogPresenter.kt */
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

    public k(com.amazon.aps.iva.p50.c cVar, r rVar, t tVar, g gVar, com.amazon.aps.iva.m50.a aVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = rVar;
        this.c = tVar;
        this.d = gVar;
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.p50.h
    public final void e() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.p50.h
    public final void m6() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        p pVar = this.b;
        getView().Z8(pVar.getInput().f.getPostersTall());
        getView().setShowTitle(pVar.getInput().d);
        pVar.e().e(getView(), new d(new a()));
        com.amazon.aps.iva.ez.e.a(pVar.c(), getView(), new b());
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.RatingBarActionListener
    public final void onRatingCancelled() {
        g.c a2;
        n nVar;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.e().d();
        if (gVar != null && (a2 = gVar.a()) != null && (nVar = (n) a2.a) != null) {
            getView().C5(nVar.d);
        }
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.RatingBarActionListener
    public final void onRatingTouchIntercept(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onTouchAttempt");
        this.e.G(new c(aVar));
    }

    @Override // com.ellation.crunchyroll.ui.userratingbar.RatingBarActionListener
    public final void onUserRatingClick(UserRatingStarNumber userRatingStarNumber) {
        Integer num;
        g.c a2;
        n nVar;
        com.amazon.aps.iva.yb0.j.f(userRatingStarNumber, "rating");
        p pVar = this.b;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) pVar.e().d();
        if (gVar != null && (a2 = gVar.a()) != null && (nVar = (n) a2.a) != null) {
            num = Integer.valueOf(nVar.d);
        } else {
            num = null;
        }
        int number = userRatingStarNumber.getNumber();
        if (num != null && number == num.intValue()) {
            getView().C5(num.intValue());
            return;
        }
        pVar.d();
        pVar.g0(ContentRating.Companion.fromNumericValue(userRatingStarNumber.getNumber()));
    }
}
