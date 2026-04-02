package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzfol<K, V> extends zzfor<K, V> implements zzfoy<K, V> {
    public zzfol(zzfon<K, zzfoj<V>> zzfonVar, int i2) {
        super(zzfonVar, i2);
    }

    public final zzfoj<V> zza(K k2) {
        zzfoj<V> zzfojVar = (zzfoj) ((zzfor) this).zzb.get(k2);
        return zzfojVar == null ? zzfoj.zzi() : zzfojVar;
    }
}
