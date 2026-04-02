package com.google.android.gms.internal.ads;

import android.util.Log;
/* loaded from: classes.dex */
public final class zzqt implements zzqs {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzqt(long[] jArr, long[] jArr2, long j2, long j3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzqt zza(long j2, long j3, zzon zzonVar, zzamf zzamfVar) {
        int zzn;
        zzamfVar.zzk(10);
        int zzv = zzamfVar.zzv();
        if (zzv <= 0) {
            return null;
        }
        int i2 = zzonVar.zzd;
        long zzH = zzamq.zzH(zzv, (i2 >= 32000 ? 1152 : 576) * 1000000, i2);
        int zzo = zzamfVar.zzo();
        int zzo2 = zzamfVar.zzo();
        int zzo3 = zzamfVar.zzo();
        zzamfVar.zzk(2);
        long j4 = j3 + zzonVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i3 = 0;
        long j5 = j3;
        while (i3 < zzo) {
            int i4 = zzo2;
            long j6 = j4;
            jArr[i3] = (i3 * zzH) / zzo;
            jArr2[i3] = Math.max(j5, j6);
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
            j5 += zzn * i4;
            i3++;
            j4 = j6;
            zzo2 = i4;
        }
        if (j2 != -1 && j2 != j5) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new zzqt(jArr, jArr2, zzH, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j2) {
        return this.zza[zzamq.zzD(this.zzb, j2, true, true)];
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
    public final zzor zzf(long j2) {
        int zzD = zzamq.zzD(this.zza, j2, true, true);
        zzou zzouVar = new zzou(this.zza[zzD], this.zzb[zzD]);
        if (zzouVar.zzb < j2) {
            long[] jArr = this.zza;
            if (zzD != jArr.length - 1) {
                int i2 = zzD + 1;
                return new zzor(zzouVar, new zzou(jArr[i2], this.zzb[i2]));
            }
        }
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
