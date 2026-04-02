package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzdlk implements zzbpr<Object> {
    private final WeakReference<zzdlm> zza;

    public /* synthetic */ zzdlk(zzdlm zzdlmVar, zzdll zzdllVar) {
        this.zza = new WeakReference<>(zzdlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        zzdlm zzdlmVar = this.zza.get();
        if (zzdlmVar == null) {
            return;
        }
        zzdlm.zza(zzdlmVar).zza();
    }
}
