package com.google.android.gms.internal.cast_tv;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzkj extends AbstractList implements RandomAccess, zzij {
    private final zzij zza;

    public zzkj(zzij zzijVar) {
        this.zza = zzijVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzii) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzki(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzkh(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzij
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzij
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzij
    public final void zzi(zzgu zzguVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzij
    public final zzij zze() {
        return this;
    }
}
