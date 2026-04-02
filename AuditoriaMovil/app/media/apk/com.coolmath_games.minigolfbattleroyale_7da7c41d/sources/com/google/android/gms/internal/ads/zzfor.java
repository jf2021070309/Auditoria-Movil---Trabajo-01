package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfor<K, V> extends zzfnh<K, V> implements Serializable {
    final transient zzfon<K, ? extends zzfoe<V>> zzb;
    final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfor(zzfon<K, ? extends zzfoe<V>> zzfonVar, int i) {
        this.zzb = zzfonVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final int zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    @Deprecated
    public final boolean zzh(K k, V v) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    @Deprecated
    public final void zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final Set<K> zzk() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final /* bridge */ /* synthetic */ Collection zzn() {
        return new zzfoq(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final Map<K, Collection<V>> zzp() {
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
