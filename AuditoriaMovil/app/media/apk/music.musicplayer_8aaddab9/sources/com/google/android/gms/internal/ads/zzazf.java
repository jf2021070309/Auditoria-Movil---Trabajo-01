package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzazf {
    @VisibleForTesting
    public zzamu zza;
    @VisibleForTesting
    public boolean zzb;

    public zzazf() {
    }

    public zzazf(Context context) {
        zzbjl.zza(context);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdo)).booleanValue()) {
            try {
                this.zza = (zzamu) zzcgx.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzazc.zza);
                ObjectWrapper.wrap(context);
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcgw | NullPointerException unused) {
                zzcgt.zzd("Cannot dynamite load clearcut");
            }
        }
    }
}
