package com.google.android.gms.internal.games;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgd<E> extends zzfy<E> {
    private final transient E zznf;
    private transient int zzng;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(E e) {
        this.zznf = (E) zzfo.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(E e, int i) {
        this.zznf = e;
        this.zzng = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zznf.equals(obj);
    }

    @Override // com.google.android.gms.internal.games.zzfs
    public final zzgg<E> zzcn() {
        return new zzga(this.zznf);
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final zzft<E> zzcv() {
        return zzft.zzd(this.zznf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zznf;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.games.zzfy, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzng;
        if (i == 0) {
            int hashCode = this.zznf.hashCode();
            this.zzng = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return this.zzng != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zznf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.games.zzfy, com.google.android.gms.internal.games.zzfs, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
