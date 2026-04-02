package com.google.android.gms.internal.consent_sdk;

import e.d.b.f.d;
/* loaded from: classes.dex */
public final /* synthetic */ class zzr implements Runnable {
    private final zzp zza;
    private final d zzb;

    public zzr(zzp zzpVar, d dVar) {
        this.zza = zzpVar;
        this.zzb = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb);
    }
}
