package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbuz {
    private static zzbuz zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbuz() {
    }

    public static zzbuz zza() {
        if (zza == null) {
            zza = new zzbuz();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzbux
                private final zzbuz zza;
                private final Context zzb;
                private final String zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = context;
                    this.zzc = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.zzb;
                    String str2 = this.zzc;
                    zzbjl.zza(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) zzbet.zzc().zzc(zzbjl.zzac)).booleanValue());
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaj)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcog) zzcgx.zza(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbuy.zza)).zze(ObjectWrapper.wrap(context2), new zzbuw(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | zzcgw | NullPointerException e) {
                        zzcgt.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
