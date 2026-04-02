package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public class zznl {
    public final zznf zza;
    public final zznk zzb;
    public zznh zzc;
    private final int zzd;

    public zznl(zzni zzniVar, zznk zznkVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.zzb = zznkVar;
        this.zzd = i2;
        this.zza = new zznf(zzniVar, j2, 0L, j4, j5, j6, j7);
    }

    public static final int zzf(zznv zznvVar, long j2, zzoq zzoqVar) {
        if (j2 == zznvVar.zzn()) {
            return 0;
        }
        zzoqVar.zza = j2;
        return 1;
    }

    public static final boolean zzg(zznv zznvVar, long j2) throws IOException {
        long zzn = j2 - zznvVar.zzn();
        if (zzn < 0 || zzn > 262144) {
            return false;
        }
        ((zznp) zznvVar).zzd((int) zzn, false);
        return true;
    }

    public final zzot zza() {
        return this.zza;
    }

    public final void zzb(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zznh zznhVar = this.zzc;
        if (zznhVar != null) {
            j7 = zznhVar.zza;
            if (j7 == j2) {
                return;
            }
        }
        long zzh = this.zza.zzh(j2);
        j3 = this.zza.zzc;
        j4 = this.zza.zzd;
        j5 = this.zza.zze;
        j6 = this.zza.zzf;
        this.zzc = new zznh(j2, zzh, 0L, j3, j4, j5, j6);
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zznv zznvVar, zzoq zzoqVar) throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        while (true) {
            zznh zznhVar = this.zzc;
            zzakt.zze(zznhVar);
            j2 = zznhVar.zzf;
            j3 = zznhVar.zzg;
            j4 = zznhVar.zzh;
            if (j3 - j2 <= this.zzd) {
                zze(false, j2);
                return zzf(zznvVar, j2, zzoqVar);
            } else if (!zzg(zznvVar, j4)) {
                return zzf(zznvVar, j4, zzoqVar);
            } else {
                zznvVar.zzl();
                zznk zznkVar = this.zzb;
                j5 = zznhVar.zzb;
                zznj zza = zznkVar.zza(zznvVar, j5);
                i2 = zza.zzb;
                if (i2 == -3) {
                    zze(false, j4);
                    return zzf(zznvVar, j4, zzoqVar);
                } else if (i2 == -2) {
                    j11 = zza.zzc;
                    j12 = zza.zzd;
                    zznh.zzf(zznhVar, j11, j12);
                } else if (i2 != -1) {
                    j6 = zza.zzd;
                    zzg(zznvVar, j6);
                    j7 = zza.zzd;
                    zze(true, j7);
                    j8 = zza.zzd;
                    return zzf(zznvVar, j8, zzoqVar);
                } else {
                    j9 = zza.zzc;
                    j10 = zza.zzd;
                    zznh.zzg(zznhVar, j9, j10);
                }
            }
        }
    }

    public final void zze(boolean z, long j2) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
