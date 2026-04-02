package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzud implements zznk {
    private final zzamn zza;
    private final zzamf zzb = new zzamf();
    private final int zzc;

    public zzud(int i, zzamn zzamnVar, int i2) {
        this.zzc = i;
        this.zza = zzamnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final zznj zza(zznv zznvVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzn = zznvVar.zzn();
        int min = (int) Math.min(112800L, zznvVar.zzo() - zzn);
        this.zzb.zza(min);
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min, false);
        zzamf zzamfVar = this.zzb;
        int zze = zzamfVar.zze();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzamfVar.zzd() >= 188 && (zza2 = (zza = zzup.zza(zzamfVar.zzi(), zzamfVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzup.zzb(zzamfVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zznj.zzd(zze2, zzn);
                    }
                    j2 = zzn + j4;
                } else if (100000 + zze2 > j) {
                    j2 = zzn + zza;
                } else {
                    j4 = zza;
                    j5 = zze2;
                }
                return zznj.zzf(j2);
            }
            zzamfVar.zzh(zza2);
            j3 = zza2;
        }
        return j5 != -9223372036854775807L ? zznj.zze(j5, zzn + j3) : zznj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzb() {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
    }
}
