package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzjb implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzjo zzb;

    public zzjb(zzjo zzjoVar, zzp zzpVar) {
        this.zzb = zzjoVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzb.zzb;
        if (zzebVar == null) {
            a.F(this.zzb.zzs, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzebVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e2);
        }
    }
}
