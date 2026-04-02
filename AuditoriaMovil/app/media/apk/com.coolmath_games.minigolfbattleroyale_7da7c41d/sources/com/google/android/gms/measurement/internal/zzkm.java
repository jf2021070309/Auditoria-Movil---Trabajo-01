package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzkm {
    com.google.android.gms.internal.measurement.zzfw zza;
    List<Long> zzb;
    List<com.google.android.gms.internal.measurement.zzfo> zzc;
    long zzd;
    final /* synthetic */ zzkn zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkm(zzkn zzknVar, zzkg zzkgVar) {
        this.zze = zzknVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        return ((zzfoVar.zzf() / 1000) / 60) / 60;
    }

    public final boolean zza(long j, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        Preconditions.checkNotNull(zzfoVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() <= 0 || zzb(this.zzc.get(0)) == zzb(zzfoVar)) {
            long zzbw = this.zzd + zzfoVar.zzbw();
            this.zze.zzd();
            if (zzbw >= Math.max(0, zzea.zzh.zzb(null).intValue())) {
                return false;
            }
            this.zzd = zzbw;
            this.zzc.add(zzfoVar);
            this.zzb.add(Long.valueOf(j));
            int size = this.zzc.size();
            this.zze.zzd();
            return size < Math.max(1, zzea.zzi.zzb(null).intValue());
        }
        return false;
    }
}
