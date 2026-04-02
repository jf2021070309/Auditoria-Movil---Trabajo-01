package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzje implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzab zzc;
    public final /* synthetic */ zzab zzd;
    public final /* synthetic */ zzjo zze;

    public zzje(zzjo zzjoVar, boolean z, zzp zzpVar, boolean z2, zzab zzabVar, zzab zzabVar2) {
        this.zze = zzjoVar;
        this.zza = zzpVar;
        this.zzb = z2;
        this.zzc = zzabVar;
        this.zzd = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zze.zzb;
        if (zzebVar == null) {
            a.F(this.zze.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzebVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
