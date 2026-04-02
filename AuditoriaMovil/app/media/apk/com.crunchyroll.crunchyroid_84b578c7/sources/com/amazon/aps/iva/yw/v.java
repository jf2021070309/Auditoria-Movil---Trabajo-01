package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.application.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vw.a> {
    public static final v h = new v();

    public v() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.vw.a invoke() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.d.class, "billing_notifications");
            if (c != null) {
                return (com.amazon.aps.iva.cx.d) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BillingNotificationsConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
