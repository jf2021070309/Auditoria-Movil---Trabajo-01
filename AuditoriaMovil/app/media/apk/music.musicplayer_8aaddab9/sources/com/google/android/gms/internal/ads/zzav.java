package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzav {
    private final Map<String, String> zza = new HashMap();
    private Map<String, String> zzb;

    public final synchronized Map<String, String> zza() {
        if (this.zzb == null) {
            this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
        }
        return this.zzb;
    }
}
