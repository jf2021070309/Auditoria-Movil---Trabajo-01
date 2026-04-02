package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
/* loaded from: classes.dex */
public final class zzbil extends zzbgv {
    private final OnPaidEventListener zza;

    public zzbil(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zze(zzbdn zzbdnVar) {
        if (this.zza != null) {
            this.zza.onPaidEvent(AdValue.zza(zzbdnVar.zzb, zzbdnVar.zzc, zzbdnVar.zzd));
        }
    }
}
