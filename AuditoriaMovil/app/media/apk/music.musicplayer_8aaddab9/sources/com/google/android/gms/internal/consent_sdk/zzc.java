package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
/* loaded from: classes.dex */
public abstract class zzc {
    private static zzc zza;

    /* loaded from: classes.dex */
    public interface zza {
        zza zza(Application application);

        zzc zza();
    }

    public static zzc zza(Context context) {
        zzc zzcVar;
        synchronized (zzc.class) {
            if (zza == null) {
                zza = new zzai(null).zza((Application) context.getApplicationContext()).zza();
            }
            zzcVar = zza;
        }
        return zzcVar;
    }

    public abstract zzj zza();

    public abstract zzaz zzb();
}
