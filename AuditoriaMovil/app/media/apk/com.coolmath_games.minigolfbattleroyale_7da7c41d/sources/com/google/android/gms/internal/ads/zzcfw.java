package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcfw {
    public final zzfsm<AdvertisingIdClient.Info> zza(Context context, int i) {
        zzchl zzchlVar = new zzchl();
        zzber.zza();
        if (zzcgm.zzo(context)) {
            zzchg.zza.execute(new zzcfv(this, context, zzchlVar));
        }
        return zzchlVar;
    }
}
