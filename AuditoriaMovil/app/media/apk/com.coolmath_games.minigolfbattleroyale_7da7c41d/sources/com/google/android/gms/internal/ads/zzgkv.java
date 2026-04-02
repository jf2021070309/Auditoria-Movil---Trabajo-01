package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzgkv<K, V, V2> {
    final LinkedHashMap<K, zzgln<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgkv(int i) {
        this.zza = zzgkx.zzc(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgkv<K, V, V2> zza(K k, zzgln<V> zzglnVar) {
        LinkedHashMap<K, zzgln<V>> linkedHashMap = this.zza;
        zzgli.zza(k, SDKConstants.PARAM_KEY);
        zzgli.zza(zzglnVar, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(k, zzglnVar);
        return this;
    }
}
