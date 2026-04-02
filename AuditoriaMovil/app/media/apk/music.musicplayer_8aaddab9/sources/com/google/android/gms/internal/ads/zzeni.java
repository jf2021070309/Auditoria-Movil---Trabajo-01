package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzeni implements zzerx<Bundle> {
    private final zzbdr zza;
    private final zzcgz zzb;
    private final boolean zzc;

    public zzeni(zzbdr zzbdrVar, zzcgz zzcgzVar, boolean z) {
        this.zza = zzbdrVar;
        this.zzb = zzcgzVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzb.zzc >= ((Integer) zzbet.zzc().zzc(zzbjl.zzdC)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdD)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.zzc);
        }
        zzbdr zzbdrVar = this.zza;
        if (zzbdrVar != null) {
            int i2 = zzbdrVar.zza;
            if (i2 == 1) {
                bundle2.putString("avo", "p");
            } else if (i2 == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
