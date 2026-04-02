package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzuf {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzamn zza = new zzamn(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzamf zzb = new zzamf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuf(int i) {
    }

    private final int zze(zznv zznvVar) {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
        this.zzc = true;
        zznvVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zznv zznvVar, zzoq zzoqVar, int i) throws IOException {
        if (i <= 0) {
            zze(zznvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zznvVar.zzo();
            int min = (int) Math.min(112800L, zzo);
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
            int zze = zzamfVar.zze();
            int i2 = zze - 188;
            while (true) {
                if (i2 < zzg) {
                    break;
                }
                byte[] zzi = zzamfVar.zzi();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < zzg || i5 >= zze || zzi[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long zzb = zzup.zzb(zzamfVar, i2, i);
                            if (zzb != -9223372036854775807L) {
                                j = zzb;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zznvVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zznvVar);
                return 0;
            }
            long zze2 = this.zza.zze(this.zzg) - this.zza.zze(j3);
            this.zzh = zze2;
            if (zze2 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(zze2);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.zzh = -9223372036854775807L;
            }
            zze(zznvVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zznvVar.zzo());
            if (zznvVar.zzn() != 0) {
                zzoqVar.zza = 0L;
                return 1;
            }
            this.zzb.zza(min2);
            zznvVar.zzl();
            ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min2, false);
            zzamf zzamfVar2 = this.zzb;
            int zzg2 = zzamfVar2.zzg();
            int zze3 = zzamfVar2.zze();
            while (true) {
                if (zzg2 >= zze3) {
                    break;
                }
                if (zzamfVar2.zzi()[zzg2] == 71) {
                    long zzb2 = zzup.zzb(zzamfVar2, zzg2, i);
                    if (zzb2 != -9223372036854775807L) {
                        j = zzb2;
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

    public final long zzc() {
        return this.zzh;
    }

    public final zzamn zzd() {
        return this.zza;
    }
}
