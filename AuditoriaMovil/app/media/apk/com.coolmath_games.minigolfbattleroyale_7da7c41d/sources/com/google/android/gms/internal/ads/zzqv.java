package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqv extends zzqx {
    public final long zza;
    public final List<zzqw> zzb;
    public final List<zzqv> zzc;

    public zzqv(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final String toString() {
        String zzf = zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(zzf.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(zzf);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzqw zzqwVar) {
        this.zzb.add(zzqwVar);
    }

    public final void zzb(zzqv zzqvVar) {
        this.zzc.add(zzqvVar);
    }

    public final zzqw zzc(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzqw zzqwVar = this.zzb.get(i2);
            if (zzqwVar.zzd == i) {
                return zzqwVar;
            }
        }
        return null;
    }

    public final zzqv zzd(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzqv zzqvVar = this.zzc.get(i2);
            if (zzqvVar.zzd == i) {
                return zzqvVar;
            }
        }
        return null;
    }
}
