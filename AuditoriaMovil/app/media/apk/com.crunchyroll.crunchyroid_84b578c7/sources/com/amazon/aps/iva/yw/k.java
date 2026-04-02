package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.sf.c {
    public final ContentReviewsService a;
    public final a b;

    /* compiled from: FeaturesProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.fragment.app.h, j> {
        public final /* synthetic */ d0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var) {
            super(1);
            this.h = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(androidx.fragment.app.h hVar) {
            androidx.fragment.app.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
            return new j(this.h, hVar2);
        }
    }

    public k(d0 d0Var) {
        this.a = d0Var.b.getContentReviewService();
        this.b = new a(d0Var);
    }

    @Override // com.amazon.aps.iva.sf.c
    public final com.amazon.aps.iva.xb0.l<androidx.fragment.app.h, com.amazon.aps.iva.sf.b> a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.sf.c
    public final ContentReviewsService getContentReviewService() {
        return this.a;
    }
}
