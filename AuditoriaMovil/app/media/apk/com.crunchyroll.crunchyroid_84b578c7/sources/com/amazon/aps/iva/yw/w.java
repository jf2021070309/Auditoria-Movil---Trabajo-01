package com.amazon.aps.iva.yw;

import android.content.Context;
import com.ellation.crunchyroll.application.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> {
    public static final w h = new w();

    public w() {
        super(3);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.mh.j invoke(Context context, com.amazon.aps.iva.wy.h hVar, com.amazon.aps.iva.ls.a aVar) {
        Context context2 = context;
        com.amazon.aps.iva.wy.h hVar2 = hVar;
        com.amazon.aps.iva.ls.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(context2, "context");
        com.amazon.aps.iva.yb0.j.f(hVar2, "rootView");
        com.amazon.aps.iva.yb0.j.f(aVar2, "segmentAnalyticsScreen");
        com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
        if (aVar3 != null) {
            Object c = aVar3.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
            if (c != null) {
                return new com.amazon.aps.iva.mh.k(new com.amazon.aps.iva.mh.f(context2, (com.amazon.aps.iva.cx.b) c), new com.amazon.aps.iva.mh.i(com.amazon.aps.iva.ds.c.b, aVar2), hVar2);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
