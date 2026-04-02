package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzff {
    private final zza zza;

    /* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
    /* loaded from: classes2.dex */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzff(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    public final void zza(Context context, Intent intent) {
        zzfu zzC = zzfu.zzC(context, null, null);
        zzem zzau = zzC.zzau();
        if (intent == null) {
            zzau.zze().zza("Receiver called with null intent");
            return;
        }
        zzC.zzat();
        String action = intent.getAction();
        zzau.zzk().zzb("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzau.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzau.zze().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}
