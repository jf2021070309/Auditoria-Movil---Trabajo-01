package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcsk implements zzcsc {
    private final zzdyc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsk(zzdyc zzdycVar) {
        this.zza = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgF)).booleanValue()) {
            String str = map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.zzl(str);
        }
    }
}
