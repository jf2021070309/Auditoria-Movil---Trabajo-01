package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class zzgir implements ListIterator<String> {
    public final ListIterator<String> zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzgit zzc;

    public zzgir(zzgit zzgitVar, int i2) {
        zzggs zzggsVar;
        this.zzc = zzgitVar;
        this.zzb = i2;
        zzggsVar = zzgitVar.zza;
        this.zza = zzggsVar.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
