package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgkw<K, V, V2> implements zzgla<Map<K, V2>> {
    private final Map<K, zzgln<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgkw(Map<K, zzgln<V>> map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, zzgln<V>> zza() {
        return this.zza;
    }
}
