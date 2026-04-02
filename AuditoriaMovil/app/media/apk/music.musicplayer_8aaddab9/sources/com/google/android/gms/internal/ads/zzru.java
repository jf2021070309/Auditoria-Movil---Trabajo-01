package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzru {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzafv zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzrv[] zzk;

    public zzru(int i2, int i3, long j2, long j3, long j4, zzafv zzafvVar, int i4, zzrv[] zzrvVarArr, int i5, long[] jArr, long[] jArr2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = zzafvVar;
        this.zzg = i4;
        this.zzk = zzrvVarArr;
        this.zzj = i5;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzrv zza(int i2) {
        zzrv[] zzrvVarArr = this.zzk;
        if (zzrvVarArr == null) {
            return null;
        }
        return zzrvVarArr[i2];
    }
}
