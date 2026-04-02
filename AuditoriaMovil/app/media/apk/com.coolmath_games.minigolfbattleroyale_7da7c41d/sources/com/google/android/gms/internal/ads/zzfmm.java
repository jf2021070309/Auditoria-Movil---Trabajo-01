package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
class zzfmm<K, V> extends zzfnd<K, V> implements zzfoy<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzfmm(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfnd
    public final <E> Collection<E> zza(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfnd
    public final Collection<V> zzb(K k, Collection<V> collection) {
        return zzj(k, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfnd
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
