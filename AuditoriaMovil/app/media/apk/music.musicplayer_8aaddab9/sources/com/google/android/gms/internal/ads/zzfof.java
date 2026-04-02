package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class zzfof<K, V> extends zzfne<K, V> implements Serializable {
    public final K zza;
    public final V zzb;

    public zzfof(K k2, V v) {
        this.zza = k2;
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
