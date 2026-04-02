package com.amazon.aps.iva.di;

import com.amazon.aps.iva.kb0.q;
/* compiled from: FeaturedMusicPresenter.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "it");
        k kVar = this.h;
        kVar.getView().t0();
        kVar.getView().c();
        return q.a;
    }
}
