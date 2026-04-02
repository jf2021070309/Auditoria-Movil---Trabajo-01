package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zznn implements zzot {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zznn(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i = length - 1;
        this.zzf = jArr2[i] + jArr3[i];
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        int zzD = zzamq.zzD(this.zze, j, true, true);
        zzou zzouVar = new zzou(this.zze[zzD], this.zzc[zzD]);
        if (zzouVar.zzb >= j || zzD == this.zza - 1) {
            return new zzor(zzouVar, zzouVar);
        }
        int i = zzD + 1;
        return new zzor(zzouVar, new zzou(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzf;
    }
}
