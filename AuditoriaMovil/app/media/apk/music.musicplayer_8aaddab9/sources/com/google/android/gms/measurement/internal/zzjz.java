package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* loaded from: classes2.dex */
public final class zzjz {
    public final /* synthetic */ zzkd zza;
    private zzjy zzb;

    public zzjz(zzkd zzkdVar) {
        this.zza = zzkdVar;
    }

    public final void zza(long j2) {
        Handler handler;
        this.zzb = new zzjy(this, this.zza.zzs.zzav().currentTimeMillis(), j2);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        if (this.zzb != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
