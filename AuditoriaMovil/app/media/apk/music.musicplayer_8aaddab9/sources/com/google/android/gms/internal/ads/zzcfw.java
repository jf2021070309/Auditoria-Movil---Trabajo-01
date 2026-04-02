package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* loaded from: classes.dex */
public final class zzcfw {
    public final zzfsm<AdvertisingIdClient.Info> zza(Context context, int i2) {
        zzchl zzchlVar = new zzchl();
        zzber.zza();
        if (zzcgm.zzo(context)) {
            zzchg.zza.execute(new zzcfv(this, context, zzchlVar));
        }
        return zzchlVar;
    }
}
