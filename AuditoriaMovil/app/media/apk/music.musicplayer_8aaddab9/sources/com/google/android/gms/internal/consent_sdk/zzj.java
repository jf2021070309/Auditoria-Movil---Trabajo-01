package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import e.d.b.f.c;
import e.d.b.f.d;
import e.d.b.f.e;
/* loaded from: classes.dex */
public final class zzj {
    private final zzal zza;
    private final zzp zzb;
    private final zzaz zzc;

    public zzj(zzal zzalVar, zzp zzpVar, zzaz zzazVar) {
        this.zza = zzalVar;
        this.zzb = zzpVar;
        this.zzc = zzazVar;
    }

    public final int getConsentStatus() {
        return this.zza.zza();
    }

    public final int getConsentType() {
        return this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zza();
    }

    public final void requestConsentInfoUpdate(Activity activity, e eVar, d dVar, c cVar) {
        this.zzb.zza(activity, eVar, dVar, cVar);
    }

    public final void reset() {
        this.zzc.zza(null);
        this.zza.zzf();
    }
}
