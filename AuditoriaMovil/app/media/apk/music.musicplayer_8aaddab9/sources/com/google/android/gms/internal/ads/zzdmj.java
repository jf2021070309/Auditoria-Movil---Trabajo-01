package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzdmj {
    private zzbme zza;

    public zzdmj(zzdly zzdlyVar) {
        this.zza = zzdlyVar;
    }

    public final synchronized zzbme zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbme zzbmeVar) {
        this.zza = zzbmeVar;
    }
}
