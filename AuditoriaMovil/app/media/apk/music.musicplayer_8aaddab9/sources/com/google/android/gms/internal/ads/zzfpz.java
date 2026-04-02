package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfpz<K, V> extends zzfot<Map.Entry<K, V>> {
    private final transient zzfon<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzfpz(zzfon<K, V> zzfonVar, Object[] objArr, int i2, int i3) {
        this.zza = zzfonVar;
        this.zzb = objArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe
    public final zzfql<Map.Entry<K, V>> zza() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzg(Object[] objArr, int i2) {
        return zze().zzg(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final zzfoj<Map.Entry<K, V>> zzn() {
        return new zzfpy(this);
    }
}
