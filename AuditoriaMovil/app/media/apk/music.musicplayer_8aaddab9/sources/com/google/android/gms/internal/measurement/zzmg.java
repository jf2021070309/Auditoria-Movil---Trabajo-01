package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class zzmg extends AbstractList<String> implements RandomAccess, zzkm {
    private final zzkm zza;

    public zzmg(zzkm zzkmVar) {
        this.zza = zzkmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((zzkl) this.zza).get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzmf(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new zzme(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzf(int i2) {
        return this.zza.zzf(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List<?> zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzi(zzix zzixVar) {
        throw new UnsupportedOperationException();
    }
}
