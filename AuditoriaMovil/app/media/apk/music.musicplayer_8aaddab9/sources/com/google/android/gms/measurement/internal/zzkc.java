package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzkc {
    public final /* synthetic */ zzkd zza;

    public zzkc(zzkd zzkdVar) {
        this.zza = zzkdVar;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                a.G(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j2, boolean z) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j2)) {
            this.zza.zzs.zzm().zzg.zza(true);
        }
        this.zza.zzs.zzm().zzj.zzb(j2);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j2, z);
        }
    }

    @VisibleForTesting
    public final void zzc(long j2, boolean z) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j2);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.zza.zzs.zzq().zzZ("auto", "_sid", valueOf, j2);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzs.zzf().zzs(null, zzdy.zzad) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzH("auto", "_s", j2, bundle);
            zznu.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzdy.zzah)) {
                String zza = this.zza.zzs.zzm().zzo.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzs.zzq().zzH("auto", "_ssr", j2, bundle2);
            }
        }
    }
}
