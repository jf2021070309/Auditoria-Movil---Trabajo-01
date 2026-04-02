package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzn implements zzgv {
    public final com.google.android.gms.internal.measurement.zzci zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgv
    public final void interceptEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.zza.zze(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            zzfv zzfvVar = this.zzb.zza;
            if (zzfvVar != null) {
                zzfvVar.zzay().zzk().zzb("Event interceptor threw exception", e2);
            }
        }
    }
}
