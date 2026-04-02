package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqt implements zzqs {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzqt(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzqt zza(long j, long j2, zzon zzonVar, zzamf zzamfVar) {
        int zzn;
        zzamfVar.zzk(10);
        int zzv = zzamfVar.zzv();
        if (zzv <= 0) {
            return null;
        }
        int i = zzonVar.zzd;
        long zzH = zzamq.zzH(zzv, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzamfVar.zzo();
        int zzo2 = zzamfVar.zzo();
        int zzo3 = zzamfVar.zzo();
        zzamfVar.zzk(2);
        long j3 = j2 + zzonVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzo) {
            int i3 = zzo2;
            long j5 = j3;
            jArr[i2] = (i2 * zzH) / zzo;
            jArr2[i2] = Math.max(j4, j5);
            if (zzo3 == 1) {
                zzn = zzamfVar.zzn();
            } else if (zzo3 == 2) {
                zzn = zzamfVar.zzo();
            } else if (zzo3 == 3) {
                zzn = zzamfVar.zzr();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzn = zzamfVar.zzB();
            }
            j4 += zzn * i3;
            i2++;
            j3 = j5;
            zzo2 = i3;
        }
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
            Log.w("VbriSeeker", sb.toString());
        }
        return new zzqt(jArr, jArr2, zzH, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j) {
        return this.zza[zzamq.zzD(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        int zzD = zzamq.zzD(this.zza, j, true, true);
        zzou zzouVar = new zzou(this.zza[zzD], this.zzb[zzD]);
        if (zzouVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzD != jArr.length - 1) {
                int i = zzD + 1;
                return new zzor(zzouVar, new zzou(jArr[i], this.zzb[i]));
            }
        }
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
