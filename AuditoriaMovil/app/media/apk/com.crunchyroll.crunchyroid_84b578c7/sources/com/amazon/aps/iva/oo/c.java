package com.amazon.aps.iva.oo;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PlayerContentAvailabilityProvideImpl.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ij.g {
    public final com.amazon.aps.iva.at.a a;

    public c(com.amazon.aps.iva.at.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "availabilityProvider");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.ij.g
    public final String a(com.amazon.aps.iva.kj.e eVar) {
        Object obj = eVar.t;
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.model.PlayableAsset");
        return this.a.a((PlayableAsset) obj);
    }
}
