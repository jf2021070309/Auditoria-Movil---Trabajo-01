package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzghr<E> extends zzgeh<E> implements RandomAccess {
    private static final zzghr<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzghr<Object> zzghrVar = new zzghr<>(new Object[0], 0);
        zza = zzghrVar;
        zzghrVar.zzb();
    }

    public zzghr() {
        this(new Object[10], 0);
    }

    private zzghr(E[] eArr, int i2) {
        this.zzb = eArr;
        this.zzc = i2;
    }

    public static <E> zzghr<E> zzd() {
        return (zzghr<E>) zza;
    }

    private final void zzf(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
    }

    private final String zzg(int i2) {
        return a.S(35, "Index:", i2, ", Size:", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        zzbH();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
        E[] eArr = this.zzb;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[a.m(i3, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.zzb, i2, eArr2, i2 + 1, this.zzc - i2);
            this.zzb = eArr2;
        }
        this.zzb[i2] = e2;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        zzbH();
        int i2 = this.zzc;
        E[] eArr = this.zzb;
        if (i2 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        zzf(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        int i3;
        zzbH();
        zzf(i2);
        E[] eArr = this.zzb;
        E e2 = eArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        zzbH();
        zzf(i2);
        E[] eArr = this.zzb;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ zzggj zze(int i2) {
        if (i2 >= this.zzc) {
            return new zzghr(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }
}
