package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzcsi implements zzcsc {
    private final zzdyc zza;

    public zzcsi(zzdyc zzdycVar) {
        this.zza = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        char c2;
        String str = map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("flick")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            this.zza.zze(zzdxy.SHAKE);
        } else if (c2 != 1) {
            this.zza.zze(zzdxy.NONE);
        } else {
            this.zza.zze(zzdxy.FLICK);
        }
    }
}
