package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbps implements zzbpr<Object> {
    private final zzdyc zza;

    public zzbps(zzdyc zzdycVar) {
        Preconditions.checkNotNull(zzdycVar, "The Inspector Manager must not be null");
        this.zza = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j2 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi(map.get("extras"), j2);
    }
}
