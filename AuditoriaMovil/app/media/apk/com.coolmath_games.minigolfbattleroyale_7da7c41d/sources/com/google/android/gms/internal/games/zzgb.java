package com.google.android.gms.internal.games;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgb<E> extends zzfy<E> {
    static final zzgb<Object> zzmz = new zzgb<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient Object[] zzna;
    private final transient Object[] zznb;
    private final transient int zznc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgb(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzna = objArr;
        this.zznb = objArr2;
        this.mask = i2;
        this.zznc = i;
        this.size = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final int zzcp() {
        return 0;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zznb;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzp = zzfp.zzp(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = zzp & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzp = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    public final zzgg<E> zzcn() {
        return (zzgg) zzcr().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final Object[] zzco() {
        return this.zzna;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzna, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final zzft<E> zzcv() {
        return zzft.zzb(this.zzna, this.size);
    }

    @Override // com.google.android.gms.internal.games.zzfy, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zznc;
    }

    @Override // com.google.android.gms.internal.games.zzfy, com.google.android.gms.internal.games.zzfs, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
