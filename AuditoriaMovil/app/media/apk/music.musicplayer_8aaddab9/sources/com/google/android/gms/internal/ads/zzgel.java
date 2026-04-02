package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzgel extends zzgeh<Boolean> implements RandomAccess, zzggj, zzghp {
    private static final zzgel zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzgel zzgelVar = new zzgel(new boolean[0], 0);
        zza = zzgelVar;
        zzgelVar.zzb();
    }

    public zzgel() {
        this(new boolean[10], 0);
    }

    private zzgel(boolean[] zArr, int i2) {
        this.zzb = zArr;
        this.zzc = i2;
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
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbH();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i2));
        }
        boolean[] zArr = this.zzb;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[a.m(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i2 + 1, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzbH();
        zzggk.zza(collection);
        if (collection instanceof zzgel) {
            zzgel zzgelVar = (zzgel) collection;
            int i2 = zzgelVar.zzc;
            if (i2 == 0) {
                return false;
            }
            int i3 = this.zzc;
            if (Integer.MAX_VALUE - i3 >= i2) {
                int i4 = i3 + i2;
                boolean[] zArr = this.zzb;
                if (i4 > zArr.length) {
                    this.zzb = Arrays.copyOf(zArr, i4);
                }
                System.arraycopy(zzgelVar.zzb, 0, this.zzb, this.zzc, zzgelVar.zzc);
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
        if (obj instanceof zzgel) {
            zzgel zzgelVar = (zzgel) obj;
            if (this.zzc != zzgelVar.zzc) {
                return false;
            }
            boolean[] zArr = zzgelVar.zzb;
            for (int i2 = 0; i2 < this.zzc; i2++) {
                if (this.zzb[i2] != zArr[i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzf(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + zzggk.zzf(this.zzb[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == booleanValue) {
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
        zzf(i2);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbH();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i3, zArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbH();
        zzf(i2);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zzd(boolean z) {
        zzbH();
        int i2 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[a.m(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ zzggj zze(int i2) {
        if (i2 >= this.zzc) {
            return new zzgel(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }
}
