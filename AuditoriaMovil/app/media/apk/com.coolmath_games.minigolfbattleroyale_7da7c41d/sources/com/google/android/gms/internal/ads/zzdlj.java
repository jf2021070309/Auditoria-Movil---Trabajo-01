package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdlj implements zzbpr<Object> {
    private final WeakReference<zzdlm> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdlj(zzdlm zzdlmVar, zzdll zzdllVar) {
        this.zza = new WeakReference<>(zzdlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        zzdba zzdbaVar;
        zzdim zzdimVar;
        zzdlm zzdlmVar = this.zza.get();
        if (zzdlmVar == null) {
            return;
        }
        zzdbaVar = zzdlmVar.zzh;
        zzdbaVar.onAdClicked();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
            zzdimVar = zzdlmVar.zzi;
            zzdimVar.zzb();
        }
    }
}
