package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzis implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzjo zzb;

    public zzis(zzjo zzjoVar, zzp zzpVar) {
        this.zzb = zzjoVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzb.zzb;
        if (zzebVar == null) {
            a.F(this.zzb.zzs, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzebVar.zzm(this.zza);
        } catch (RemoteException e2) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e2);
        }
        this.zzb.zzQ();
    }
}
