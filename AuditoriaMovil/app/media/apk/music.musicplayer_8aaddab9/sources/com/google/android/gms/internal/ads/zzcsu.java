package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzcsu implements zzcsc {
    private final zzdyc zza;

    public zzcsu(zzdyc zzdycVar) {
        this.zza = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}
