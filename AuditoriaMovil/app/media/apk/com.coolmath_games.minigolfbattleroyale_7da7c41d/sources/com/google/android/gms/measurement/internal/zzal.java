package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class zzal {
    private static volatile Handler zzb;
    private final zzgp zza;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzgp zzgpVar) {
        Preconditions.checkNotNull(zzgpVar);
        this.zza = zzgpVar;
        this.zzc = new zzak(this, zzgpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long zze(zzal zzalVar, long j) {
        zzalVar.zzd = 0L;
        return 0L;
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzal.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.measurement.zzby(this.zza.zzax().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j) {
        zzd();
        if (j >= 0) {
            this.zzd = this.zza.zzay().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            this.zza.zzau().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }
}
