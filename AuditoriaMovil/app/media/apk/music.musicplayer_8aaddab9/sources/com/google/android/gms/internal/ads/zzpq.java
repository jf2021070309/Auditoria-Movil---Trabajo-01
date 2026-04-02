package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public abstract class zzpq {
    public final zzox zza;

    public zzpq(zzox zzoxVar) {
        this.zza = zzoxVar;
    }

    public abstract boolean zza(zzamf zzamfVar) throws zzaha;

    public abstract boolean zzb(zzamf zzamfVar, long j2) throws zzaha;

    public final boolean zzf(zzamf zzamfVar, long j2) throws zzaha {
        return zza(zzamfVar) && zzb(zzamfVar, j2);
    }
}
