package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzix implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzjo zzc;

    public zzix(zzjo zzjoVar, zzp zzpVar, Bundle bundle) {
        this.zzc = zzjoVar;
        this.zza = zzpVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzc.zzb;
        if (zzebVar == null) {
            a.F(this.zzc.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzebVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e2) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e2);
        }
    }
}
