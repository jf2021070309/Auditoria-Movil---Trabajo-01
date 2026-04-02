package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaqi extends zzaqk {
    public final long zza;
    public final List<zzaqj> zzb;
    public final List<zzaqi> zzc;

    public zzaqi(int i2, long j2) {
        super(i2);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final String toString() {
        String zzg = zzaqk.zzg(this.zzaR);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(zzg.length() + 22 + length + String.valueOf(arrays2).length());
        a.M(sb, zzg, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzaqj zzaqjVar) {
        this.zzb.add(zzaqjVar);
    }

    public final void zzb(zzaqi zzaqiVar) {
        this.zzc.add(zzaqiVar);
    }

    public final zzaqj zzc(int i2) {
        int size = this.zzb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzaqj zzaqjVar = this.zzb.get(i3);
            if (zzaqjVar.zzaR == i2) {
                return zzaqjVar;
            }
        }
        return null;
    }

    public final zzaqi zzd(int i2) {
        int size = this.zzc.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzaqi zzaqiVar = this.zzc.get(i3);
            if (zzaqiVar.zzaR == i2) {
                return zzaqiVar;
            }
        }
        return null;
    }
}
