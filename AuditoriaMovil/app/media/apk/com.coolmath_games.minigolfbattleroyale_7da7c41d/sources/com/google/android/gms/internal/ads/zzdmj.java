package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
