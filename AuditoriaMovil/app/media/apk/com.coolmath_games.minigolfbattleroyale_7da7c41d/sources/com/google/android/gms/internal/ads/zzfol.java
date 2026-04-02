package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfol<K, V> extends zzfor<K, V> implements zzfoy<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfol(zzfon<K, zzfoj<V>> zzfonVar, int i) {
        super(zzfonVar, i);
    }

    public final zzfoj<V> zza(K k) {
        zzfoj<V> zzfojVar = (zzfoj) this.zzb.get(k);
        return zzfojVar == null ? zzfoj.zzi() : zzfojVar;
    }
}
