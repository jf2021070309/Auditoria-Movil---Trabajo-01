package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras implements NetworkExtras {
    private final HashMap<String, Object> zza = new HashMap<>();

    public Object getExtra(String str) {
        return this.zza.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.zza.put(str, obj);
    }
}
