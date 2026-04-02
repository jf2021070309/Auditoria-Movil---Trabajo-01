package com.amazon.aps.iva.pt;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.model.FmsImage;
/* compiled from: BentoCardPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final com.amazon.aps.iva.ft.a c;

    public e(c cVar, b bVar, com.amazon.aps.iva.ft.a aVar) {
        super(cVar, new j[0]);
        this.b = bVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.pt.d
    public final void E(com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.jt.a aVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "bentoGameCard");
        com.amazon.aps.iva.yb0.j.f(aVar, "feedAnalyticsData");
        this.c.E(dVar, aVar);
        boolean booleanValue = this.b.invoke().booleanValue();
        String str = dVar.e;
        if (!booleanValue) {
            getView().ne(dVar.b, str);
        } else {
            getView().P0(str);
        }
    }

    @Override // com.amazon.aps.iva.pt.d
    public final void V2(com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.jt.a aVar) {
        getView().setTitle(dVar.b);
        getView().setGenre(dVar.d);
        getView().K7(dVar, aVar);
        FmsImage mobileLarge = dVar.c.getMobileLarge();
        if (mobileLarge != null) {
            getView().loadImage(mobileLarge.getFullUrl());
        }
        if (dVar.f) {
            getView().b6();
        } else {
            getView().E2();
        }
    }
}
