package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zziq implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzkv zzc;
    public final /* synthetic */ zzjo zzd;

    public zziq(zzjo zzjoVar, zzp zzpVar, boolean z, zzkv zzkvVar) {
        this.zzd = zzjoVar;
        this.zza = zzpVar;
        this.zzb = z;
        this.zzc = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzd.zzb;
        if (zzebVar == null) {
            a.F(this.zzd.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzebVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
