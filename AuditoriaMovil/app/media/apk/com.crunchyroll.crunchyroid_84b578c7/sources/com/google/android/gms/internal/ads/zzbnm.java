package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbnm {
    private static zzbnm zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbnm zza() {
        if (zza == null) {
            zza = new zzbnm();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnl
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                zzbbf.zza(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().zzb(zzbbf.zzah)).booleanValue());
                if (((Boolean) zzba.zzc().zzb(zzbbf.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcgq) zzbzs.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbnk
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzbzq
                        public final Object zza(Object obj) {
                            return zzcgp.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbnj(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | zzbzr | NullPointerException e) {
                    zzbzo.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
