package com.google.android.gms.internal.ads;

import ch.qos.logback.core.joran.action.Action;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class zzgkv<K, V, V2> {
    public final LinkedHashMap<K, zzgln<V>> zza;

    public zzgkv(int i2) {
        this.zza = zzgkx.zzc(i2);
    }

    public final zzgkv<K, V, V2> zza(K k2, zzgln<V> zzglnVar) {
        LinkedHashMap<K, zzgln<V>> linkedHashMap = this.zza;
        zzgli.zza(k2, Action.KEY_ATTRIBUTE);
        zzgli.zza(zzglnVar, "provider");
        linkedHashMap.put(k2, zzglnVar);
        return this;
    }
}
