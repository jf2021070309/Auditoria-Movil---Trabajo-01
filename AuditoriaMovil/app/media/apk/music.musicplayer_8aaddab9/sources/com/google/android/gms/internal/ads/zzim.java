package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzim {
    public final long zza;
    public final long zzb;
    public boolean zzc;
    public zzkb zzd;
    public zzim zze;

    public zzim(long j2, int i2) {
        this.zza = j2;
        this.zzb = j2 + 65536;
    }

    public final int zza(long j2) {
        long j3 = this.zza;
        int i2 = this.zzd.zzb;
        return (int) (j2 - j3);
    }

    public final zzim zzb() {
        this.zzd = null;
        zzim zzimVar = this.zze;
        this.zze = null;
        return zzimVar;
    }
}
