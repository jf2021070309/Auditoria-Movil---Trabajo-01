package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zznj {
    public static final zznj zza = new zznj(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zznj(int i2, long j2, long j3) {
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zznj zzd(long j2, long j3) {
        return new zznj(-1, j2, j3);
    }

    public static zznj zze(long j2, long j3) {
        return new zznj(-2, j2, j3);
    }

    public static zznj zzf(long j2) {
        return new zznj(0, -9223372036854775807L, j2);
    }
}
