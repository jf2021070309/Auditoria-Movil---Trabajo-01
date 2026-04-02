package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
/* loaded from: classes.dex */
public final class zzenp implements zzery<zzenq> {
    private final AppSetIdClient zza;

    public zzenp(Context context) {
        this.zza = AppSet.getClient(context);
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzenq> zza() {
        return ((Boolean) zzbet.zzc().zzc(zzbjl.zzbO)).booleanValue() ? zzfsd.zzj(zzflc.zza(this.zza.getAppSetIdInfo()), zzeno.zza, zzchg.zzf) : zzfsd.zza(new zzenq(null, -1));
    }
}
