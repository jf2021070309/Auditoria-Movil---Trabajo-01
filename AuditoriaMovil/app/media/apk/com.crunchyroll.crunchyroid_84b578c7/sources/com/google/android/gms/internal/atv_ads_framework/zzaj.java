package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzaj extends zzaf {
    private final transient zzae zza;
    private final transient zzab zzb;

    public zzaj(zzae zzaeVar, zzab zzabVar) {
        this.zza = zzaeVar;
        this.zzb = zzabVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy
    public final zzab zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzaf, com.google.android.gms.internal.atv_ads_framework.zzy
    public final zzan zze() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        throw null;
    }
}
