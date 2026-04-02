package com.google.android.gms.internal.consent_sdk;

import e.d.b.f.b;
import e.d.b.f.f;
import e.d.b.f.g;
import e.d.b.f.h;
/* loaded from: classes.dex */
public final class zzax implements g, h {
    private final h zza;
    private final g zzb;

    private zzax(h hVar, g gVar) {
        this.zza = hVar;
        this.zzb = gVar;
    }

    @Override // e.d.b.f.g
    public final void onConsentFormLoadFailure(f fVar) {
        this.zzb.onConsentFormLoadFailure(fVar);
    }

    @Override // e.d.b.f.h
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
