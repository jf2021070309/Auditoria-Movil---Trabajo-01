package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        boolean containsKey = map.containsKey("expires");
        long j = LongCompanionObject.MAX_VALUE;
        if (containsKey) {
            try {
                j = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi(map.get("extras"), j);
    }
}
