package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzggb extends zzgeh<Integer> implements RandomAccess, zzggf, zzghp {
    private static final zzggb zza;
    private int[] zzb;
    private int zzc;

    static {
        zzggb zzggbVar = new zzggb(new int[0], 0);
        zza = zzggbVar;
        zzggbVar.zzb();
    }

    public zzggb() {
        this(new int[10], 0);
    }

    private zzggb(int[] iArr, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    public static zzggb zzd() {
        return zza;
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
    }

    private final String zzj(int i2) {
        return a.S(35, "Index:", i2, ", Size:", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        zzbH();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
        int[] iArr = this.zzb;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[a.m(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.zzb, i2, iArr2, i2 + 1, this.zzc - i2);
            this.zzb = iArr2;
        }
        this.zzb[i2] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzbH();
        zzggk.zza(collection);
        if (collection instanceof zzggb) {
            zzggb zzggbVar = (zzggb) collection;
            int i2 = zzggbVar.zzc;
            if (i2 == 0) {
                return false;
            }
            int i3 = this.zzc;
            if (Integer.MAX_VALUE - i3 >= i2) {
                int i4 = i3 + i2;
                int[] iArr = this.zzb;
                if (i4 > iArr.length) {
                    this.zzb = Arrays.copyOf(iArr, i4);
                }
                System.arraycopy(zzggbVar.zzb, 0, this.zzb, this.zzc, zzggbVar.zzc);
                this.zzc = i4;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzggb) {
            zzggb zzggbVar = (zzggb) obj;
            if (this.zzc != zzggbVar.zzc) {
                return false;
            }
            int[] iArr = zzggbVar.zzb;
            for (int i2 = 0; i2 < this.zzc; i2++) {
                if (this.zzb[i2] != iArr[i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzi(i2);
        return Integer.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + this.zzb[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == intValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        int i3;
        zzbH();
        zzi(i2);
        int[] iArr = this.zzb;
        int i4 = iArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbH();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i3, iArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbH();
        zzi(i2);
        int[] iArr = this.zzb;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    /* renamed from: zzf */
    public final zzggf zze(int i2) {
        if (i2 >= this.zzc) {
            return new zzggb(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final int zzg(int i2) {
        zzi(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzggf
    public final void zzh(int i2) {
        zzbH();
        int i3 = this.zzc;
        int[] iArr = this.zzb;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[a.m(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        iArr3[i4] = i2;
    }
}
