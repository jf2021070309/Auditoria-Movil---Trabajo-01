package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.application.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wh.c> {
    public static final n h = new n();

    public n() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.wh.c invoke() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.o.class, "preselected_tier");
            if (c != null) {
                return (com.amazon.aps.iva.cx.o) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.PreselectedTierConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
