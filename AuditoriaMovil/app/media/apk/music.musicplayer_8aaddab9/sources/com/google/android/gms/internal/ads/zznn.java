package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
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
        int i2 = length - 1;
        this.zzf = jArr2[i2] + jArr3[i2];
    }

    public final String toString() {
        int i2 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(arrays);
        a.M(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return a.s(sb, ", durationsUs=", arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        int zzD = zzamq.zzD(this.zze, j2, true, true);
        zzou zzouVar = new zzou(this.zze[zzD], this.zzc[zzD]);
        if (zzouVar.zzb >= j2 || zzD == this.zza - 1) {
            return new zzor(zzouVar, zzouVar);
        }
        int i2 = zzD + 1;
        return new zzor(zzouVar, new zzou(this.zze[i2], this.zzc[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzf;
    }
}
