package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzenp implements zzery<zzenq> {
    private final AppSetIdClient zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenp(Context context) {
        this.zza = AppSet.getClient(context);
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzenq> zza() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbO)).booleanValue()) {
            return zzfsd.zzj(zzflc.zza(this.zza.getAppSetIdInfo()), zzeno.zza, zzchg.zzf);
        }
        return zzfsd.zza(new zzenq(null, -1));
    }
}
