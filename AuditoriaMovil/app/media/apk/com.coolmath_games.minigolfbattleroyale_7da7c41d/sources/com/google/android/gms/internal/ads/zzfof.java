package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfof<K, V> extends zzfne<K, V> implements Serializable {
    final K zza;
    final V zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfof(K k, V v) {
        this.zza = k;
        this.zzb = v;
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final K getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final V getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
