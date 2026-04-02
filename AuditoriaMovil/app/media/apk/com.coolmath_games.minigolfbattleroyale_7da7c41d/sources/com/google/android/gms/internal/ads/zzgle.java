package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgle<K, V> extends zzgkw<K, V, V> {
    private static final zzgln<Map<Object, Object>> zza = zzglb.zza(Collections.emptyMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgle(Map map, zzglc zzglcVar) {
        super(map);
    }

    public static <K, V> zzgld<K, V> zzc(int i) {
        return new zzgld<>(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zzd */
    public final Map<K, V> zzb() {
        LinkedHashMap zzc = zzgkx.zzc(zza().size());
        for (Map.Entry<K, zzgln<V>> entry : zza().entrySet()) {
            zzc.put(entry.getKey(), entry.getValue().zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
