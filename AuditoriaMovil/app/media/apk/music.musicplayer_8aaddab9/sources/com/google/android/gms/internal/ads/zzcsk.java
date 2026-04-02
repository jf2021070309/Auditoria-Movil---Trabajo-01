package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzcsk implements zzcsc {
    private final zzdyc zza;

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
