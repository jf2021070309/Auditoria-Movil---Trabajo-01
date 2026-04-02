package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzglg<K, V> extends zzgkv<K, V, zzgln<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglg(int i, zzglf zzglfVar) {
        super(1);
    }

    public final zzglg<K, V> zzb(K k, zzgln<V> zzglnVar) {
        super.zza("Network", zzglnVar);
        return this;
    }

    public final zzglh<K, V> zzc() {
        return new zzglh<>(this.zza, null);
    }
}
