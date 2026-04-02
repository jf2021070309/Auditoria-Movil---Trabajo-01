package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzst implements zznu {
    public static final zzoa zza = zzss.zza;
    private final zzsu zzb = new zzsu(null);
    private final zzamf zzc = new zzamf(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        zznp zznpVar;
        int i;
        zzamf zzamfVar = new zzamf(10);
        int i2 = 0;
        while (true) {
            zznpVar = (zznp) zznvVar;
            zznpVar.zzh(zzamfVar.zzi(), 0, 10, false);
            zzamfVar.zzh(0);
            if (zzamfVar.zzr() != 4801587) {
                break;
            }
            zzamfVar.zzk(3);
            int zzA = zzamfVar.zzA();
            i2 += zzA + 10;
            zznpVar.zzj(zzA, false);
        }
        zznvVar.zzl();
        zznpVar.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zznpVar.zzh(zzamfVar.zzi(), 0, 7, false);
            zzamfVar.zzh(0);
            int zzo = zzamfVar.zzo();
            if (zzo == 44096 || zzo == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzi = zzamfVar.zzi();
                int i6 = zznd.zza;
                if (zzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzi[2] & UByte.MAX_VALUE) << 8) | (zzi[3] & UByte.MAX_VALUE);
                    if (i7 == 65535) {
                        i7 = ((zzi[4] & UByte.MAX_VALUE) << 16) | ((zzi[5] & UByte.MAX_VALUE) << 8) | (zzi[6] & UByte.MAX_VALUE);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zznpVar.zzj(i - 7, false);
            } else {
                zznvVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zznpVar.zzj(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb.zzb(zznxVar, new zzun(Integer.MIN_VALUE, 0, 1));
        zznxVar.zzC();
        zznxVar.zzD(new zzos(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int zzg = zznvVar.zzg(this.zzc.zzi(), 0, 16384);
        if (zzg == -1) {
            return -1;
        }
        this.zzc.zzh(0);
        this.zzc.zzf(zzg);
        if (!this.zzd) {
            this.zzb.zzc(0L, 4);
            this.zzd = true;
        }
        this.zzb.zzd(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzd = false;
        this.zzb.zza();
    }
}
