package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzdlj implements zzbpr<Object> {
    private final WeakReference<zzdlm> zza;

    public /* synthetic */ zzdlj(zzdlm zzdlmVar, zzdll zzdllVar) {
        this.zza = new WeakReference<>(zzdlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        zzdim zzdimVar;
        zzdba unused;
        zzdlm zzdlmVar = this.zza.get();
        if (zzdlmVar == null) {
            return;
        }
        unused = zzdlmVar.zzh;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
            zzdimVar = zzdlmVar.zzi;
            zzdimVar.zzb();
        }
    }
}
