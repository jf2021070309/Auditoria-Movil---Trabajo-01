package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
/* loaded from: classes.dex */
public final class zzd implements zzcp<zzb> {
    private final zzct<Application> zza;

    public zzd(zzct<Application> zzctVar) {
        this.zza = zzctVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzct
    public final /* synthetic */ Object zza() {
        return new zzb(this.zza.zza());
    }
}
