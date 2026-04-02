package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zziw implements Runnable {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ zzjo zzb;

    public zziw(zzjo zzjoVar, zzih zzihVar) {
        this.zzb = zzjoVar;
        this.zza = zzihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzb.zzb;
        if (zzebVar == null) {
            a.F(this.zzb.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zzih zzihVar = this.zza;
            if (zzihVar == null) {
                zzebVar.zzq(0L, null, null, this.zzb.zzs.zzau().getPackageName());
            } else {
                zzebVar.zzq(zzihVar.zzc, zzihVar.zza, zzihVar.zzb, this.zzb.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e2);
        }
    }
}
