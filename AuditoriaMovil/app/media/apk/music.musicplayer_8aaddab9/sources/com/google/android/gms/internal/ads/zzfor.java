package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class zzfor<K, V> extends zzfnh<K, V> implements Serializable {
    public final transient zzfon<K, ? extends zzfoe<V>> zzb;
    public final transient int zzc;

    public zzfor(zzfon<K, ? extends zzfoe<V>> zzfonVar, int i2) {
        this.zzb = zzfonVar;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final int zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    @Deprecated
    public final boolean zzh(K k2, V v) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    @Deprecated
    public final void zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final Set<K> zzk() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final /* bridge */ /* synthetic */ Collection zzn() {
        return new zzfoq(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final Map<K, Collection<V>> zzp() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final boolean zzr(@CheckForNull Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    public final /* bridge */ /* synthetic */ Map zzu() {
        return this.zzb;
    }
}
