package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzghr<E> extends zzgeh<E> implements RandomAccess {
    private static final zzghr<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzghr<Object> zzghrVar = new zzghr<>(new Object[0], 0);
        zza = zzghrVar;
        zzghrVar.zzb();
    }

    zzghr() {
        this(new Object[10], 0);
    }

    public static <E> zzghr<E> zzd() {
        return (zzghr<E>) zza;
    }

    private final void zzf(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    private final String zzg(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzbH();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzf(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zzbH();
        zzf(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzbH();
        zzf(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ zzggj zze(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzghr(Arrays.copyOf(this.zzb, i), this.zzc);
    }

    private zzghr(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzbH();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
