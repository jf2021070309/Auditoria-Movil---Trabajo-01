package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zztw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzamn zza = new zzamn(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzamf zzb = new zzamf();

    public static long zze(zzamf zzamfVar) {
        int zzg = zzamfVar.zzg();
        if (zzamfVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzamfVar.zzm(bArr, 0, 9);
        zzamfVar.zzh(zzg);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            byte b = bArr[1];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    private final int zzf(zznv zznvVar) {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
        this.zzc = true;
        zznvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzamn zzb() {
        return this.zza;
    }

    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zznvVar.zzo();
            int min = (int) Math.min(20000L, zzo);
            long j2 = zzo - min;
            if (zznvVar.zzn() != j2) {
                zzoqVar.zza = j2;
                return 1;
            }
            this.zzb.zza(min);
            zznvVar.zzl();
            ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min, false);
            zzamf zzamfVar = this.zzb;
            int zzg = zzamfVar.zzg();
            int zze = zzamfVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzamfVar.zzi(), zze) == 442) {
                    zzamfVar.zzh(zze + 4);
                    long zze2 = zze(zzamfVar);
                    if (zze2 != -9223372036854775807L) {
                        j = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zznvVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zznvVar);
                return 0;
            }
            long zze3 = this.zza.zze(this.zzg) - this.zza.zze(j3);
            this.zzh = zze3;
            if (zze3 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(zze3);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.zzh = -9223372036854775807L;
            }
            zzf(zznvVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zznvVar.zzo());
            if (zznvVar.zzn() != 0) {
                zzoqVar.zza = 0L;
                return 1;
            }
            this.zzb.zza(min2);
            zznvVar.zzl();
            ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min2, false);
            zzamf zzamfVar2 = this.zzb;
            int zzg2 = zzamfVar2.zzg();
            int zze4 = zzamfVar2.zze();
            while (true) {
                if (zzg2 >= zze4 - 3) {
                    break;
                }
                if (zzg(zzamfVar2.zzi(), zzg2) == 442) {
                    zzamfVar2.zzh(zzg2 + 4);
                    long zze5 = zze(zzamfVar2);
                    if (zze5 != -9223372036854775807L) {
                        j = zze5;
                        break;
                    }
                }
                zzg2++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzd() {
        return this.zzh;
    }
}
