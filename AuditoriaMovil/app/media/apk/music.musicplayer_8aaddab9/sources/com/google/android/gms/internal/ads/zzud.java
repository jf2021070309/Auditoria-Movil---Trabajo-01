package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzud implements zznk {
    private final zzamn zza;
    private final zzamf zzb = new zzamf();
    private final int zzc;

    public zzud(int i2, zzamn zzamnVar, int i3) {
        this.zzc = i2;
        this.zza = zzamnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final zznj zza(zznv zznvVar, long j2) throws IOException {
        int zza;
        int zza2;
        long j3;
        long zzn = zznvVar.zzn();
        int min = (int) Math.min(112800L, zznvVar.zzo() - zzn);
        this.zzb.zza(min);
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min, false);
        zzamf zzamfVar = this.zzb;
        int zze = zzamfVar.zze();
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (zzamfVar.zzd() >= 188 && (zza2 = (zza = zzup.zza(zzamfVar.zzi(), zzamfVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzup.zzb(zzamfVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j2) {
                    if (j6 == -9223372036854775807L) {
                        return zznj.zzd(zze2, zzn);
                    }
                    j3 = zzn + j5;
                } else if (100000 + zze2 > j2) {
                    j3 = zzn + zza;
                } else {
                    j5 = zza;
                    j6 = zze2;
                }
                return zznj.zzf(j3);
            }
            zzamfVar.zzh(zza2);
            j4 = zza2;
        }
        return j6 != -9223372036854775807L ? zznj.zze(j6, zzn + j4) : zznj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzb() {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
    }
}
