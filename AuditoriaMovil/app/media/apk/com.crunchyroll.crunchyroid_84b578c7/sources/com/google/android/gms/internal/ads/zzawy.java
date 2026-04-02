package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzawy {
    @VisibleForTesting
    zzato zza;
    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzawy() {
        this.zzc = zzbzd.zzb;
    }

    public zzawy(final Context context) {
        ExecutorService executorService = zzbzd.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawt
            @Override // java.lang.Runnable
            public final void run() {
                zzawy zzawyVar = zzawy.this;
                Context context2 = context;
                if (((Boolean) zzba.zzc().zzb(zzbbf.zzeA)).booleanValue()) {
                    try {
                        zzawyVar.zza = (zzato) zzbzs.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbzq() { // from class: com.google.android.gms.internal.ads.zzawu
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzbzq
                            public final Object zza(Object obj) {
                                return zzatn.zzb(obj);
                            }
                        });
                        zzawyVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzawyVar.zzb = true;
                    } catch (RemoteException | zzbzr | NullPointerException unused) {
                        zzbzo.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
