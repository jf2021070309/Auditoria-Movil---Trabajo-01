package com.amazon.aps.iva.pi;

import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: MusicPlayerContentAvailabilityProvider.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.ij.g {
    public final com.amazon.aps.iva.at.d a;

    public a(com.amazon.aps.iva.at.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "availabilityProvider");
        this.a = fVar;
    }

    @Override // com.amazon.aps.iva.ij.g
    public final String a(com.amazon.aps.iva.kj.e eVar) {
        Object obj = eVar.t;
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.model.music.MusicAsset");
        return this.a.b((MusicAsset) obj);
    }
}
