package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.application.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final x h = new x();

    public x() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.c.class, "bento");
            if (c != null) {
                return Boolean.valueOf(((com.amazon.aps.iva.cx.c) c).isEnabled());
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BentoConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
