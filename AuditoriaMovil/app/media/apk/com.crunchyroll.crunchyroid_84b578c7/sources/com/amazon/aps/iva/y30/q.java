package com.amazon.aps.iva.y30;

import com.amazon.aps.iva.cx.k;
import com.ellation.crunchyroll.application.a;
/* compiled from: SettingsListFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class q extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.th.a> {
    public q(k.a aVar) {
        super(0, aVar, k.a.class, "get", "get()Lcom/crunchyroll/multitiersubscription/membershipcard/MembershipCardConfig;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.th.a invoke() {
        ((k.a) this.receiver).getClass();
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.k.class, "membership_card");
            if (c != null) {
                return (com.amazon.aps.iva.cx.k) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.MembershipCardConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
