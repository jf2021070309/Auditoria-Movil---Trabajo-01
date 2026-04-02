package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzcso implements zzcsc {
    private final zzezy zza;

    public zzcso(zzezy zzezyVar) {
        this.zza = zzezyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
