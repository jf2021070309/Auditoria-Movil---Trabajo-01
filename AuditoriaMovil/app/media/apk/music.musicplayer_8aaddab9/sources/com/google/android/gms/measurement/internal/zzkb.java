package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzod;
/* loaded from: classes2.dex */
public final class zzkb {
    @VisibleForTesting
    public long zza;
    @VisibleForTesting
    public long zzb;
    public final /* synthetic */ zzkd zzc;
    private final zzam zzd;

    public zzkb(zzkd zzkdVar) {
        this.zzc = zzkdVar;
        this.zzd = new zzka(this, zzkdVar.zzs);
        long elapsedRealtime = zzkdVar.zzs.zzav().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j2) {
        this.zzd.zzb();
    }

    public final void zzc(long j2) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j2;
        this.zzb = j2;
    }

    public final boolean zzd(boolean z, boolean z2, long j2) {
        this.zzc.zzg();
        this.zzc.zza();
        zzod.zzc();
        if (!this.zzc.zzs.zzf().zzs(null, zzdy.zzai)) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        } else if (this.zzc.zzs.zzJ()) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        }
        long j3 = j2 - this.zza;
        if (!z && j3 < 1000) {
            this.zzc.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z2) {
            j3 = j2 - this.zzb;
            this.zzb = j2;
        }
        this.zzc.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        zzkz.zzJ(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        zzaf zzf = this.zzc.zzs.zzf();
        zzdx<Boolean> zzdxVar = zzdy.zzT;
        if (!zzf.zzs(null, zzdxVar) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.zzc.zzs.zzf().zzs(null, zzdxVar) || !z2) {
            this.zzc.zzs.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j2;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
