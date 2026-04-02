package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzai extends zzaf {
    private final transient zzae zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzai(zzae zzaeVar, Object[] objArr, int i, int i2) {
        this.zza = zzaeVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
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

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy
    public final zzan zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf
    public final zzab zzh() {
        return new zzah(this);
    }
}
