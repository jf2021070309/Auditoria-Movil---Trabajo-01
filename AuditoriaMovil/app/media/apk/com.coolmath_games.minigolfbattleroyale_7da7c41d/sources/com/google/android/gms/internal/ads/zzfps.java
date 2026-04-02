package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfps<K, V> extends zzfmm<K, V> {
    final transient zzfmj<? extends List<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfps(Map<K, Collection<V>> map, zzfmj<? extends List<V>> zzfmjVar) {
        super(map);
        this.zza = zzfmjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfmm, com.google.android.gms.internal.ads.zzfnd
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfnd, com.google.android.gms.internal.ads.zzfng
    final Set<K> zzk() {
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzfnd, com.google.android.gms.internal.ads.zzfng
    final Map<K, Collection<V>> zzp() {
        return zzq();
    }
}
