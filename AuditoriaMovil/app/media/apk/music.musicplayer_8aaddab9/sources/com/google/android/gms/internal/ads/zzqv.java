package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzqv extends zzqx {
    public final long zza;
    public final List<zzqw> zzb;
    public final List<zzqv> zzc;

    public zzqv(int i2, long j2) {
        super(i2);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final String toString() {
        String zzf = zzqx.zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(zzf.length() + 22 + length + String.valueOf(arrays2).length());
        a.M(sb, zzf, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzqw zzqwVar) {
        this.zzb.add(zzqwVar);
    }

    public final void zzb(zzqv zzqvVar) {
        this.zzc.add(zzqvVar);
    }

    public final zzqw zzc(int i2) {
        int size = this.zzb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzqw zzqwVar = this.zzb.get(i3);
            if (zzqwVar.zzd == i2) {
                return zzqwVar;
            }
        }
        return null;
    }

    public final zzqv zzd(int i2) {
        int size = this.zzc.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzqv zzqvVar = this.zzc.get(i3);
            if (zzqvVar.zzd == i2) {
                return zzqvVar;
            }
        }
        return null;
    }
}
