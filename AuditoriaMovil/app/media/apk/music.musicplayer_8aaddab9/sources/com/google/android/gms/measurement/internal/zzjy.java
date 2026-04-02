package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzjy implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ zzjz zzc;

    public zzjy(zzjz zzjzVar, long j2, long j3) {
        this.zzc = zzjzVar;
        this.zza = j2;
        this.zzb = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjx
            @Override // java.lang.Runnable
            public final void run() {
                zzjy zzjyVar = zzjy.this;
                zzjz zzjzVar = zzjyVar.zzc;
                long j2 = zzjyVar.zza;
                long j3 = zzjyVar.zzb;
                zzjzVar.zza.zzg();
                zzjzVar.zza.zzs.zzay().zzc().zza("Application going to the background");
                boolean z = true;
                zzjzVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzjzVar.zza.zzs.zzf().zzu()) {
                    zzjzVar.zza.zzb.zzb(j3);
                    if (zzjzVar.zza.zzs.zzf().zzs(null, zzdy.zzaf)) {
                        zzkb zzkbVar = zzjzVar.zza.zzb;
                        long j4 = zzkbVar.zzb;
                        zzkbVar.zzb = j3;
                        bundle.putLong("_et", j3 - j4);
                        zzkz.zzJ(zzjzVar.zza.zzs.zzs().zzj(true), bundle, true);
                    } else {
                        z = false;
                    }
                    zzjzVar.zza.zzb.zzd(false, z, j3);
                }
                zzjzVar.zza.zzs.zzq().zzH("auto", "_ab", j2, bundle);
            }
        });
    }
}
