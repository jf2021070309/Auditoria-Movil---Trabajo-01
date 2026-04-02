package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class zzkr extends zzii<Long> implements RandomAccess, zzkd, zzlj {
    private static final zzkr zza;
    private long[] zzb;
    private int zzc;

    static {
        zzkr zzkrVar = new zzkr(new long[0], 0);
        zza = zzkrVar;
        zzkrVar.zzb();
    }

    public zzkr() {
        this(new long[10], 0);
    }

    private zzkr(long[] jArr, int i2) {
        this.zzb = jArr;
        this.zzc = i2;
    }

    public static zzkr zzf() {
        return zza;
    }

    private final String zzh(int i2) {
        return a.S(35, "Index:", i2, ", Size:", this.zzc);
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        zzbM();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        long[] jArr = this.zzb;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[a.m(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.zzb, i2, jArr2, i2 + 1, this.zzc - i2);
            this.zzb = jArr2;
        }
        this.zzb[i2] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbM();
        zzkf.zze(collection);
        if (collection instanceof zzkr) {
            zzkr zzkrVar = (zzkr) collection;
            int i2 = zzkrVar.zzc;
            if (i2 == 0) {
                return false;
            }
            int i3 = this.zzc;
            if (Integer.MAX_VALUE - i3 >= i2) {
                int i4 = i3 + i2;
                long[] jArr = this.zzb;
                if (i4 > jArr.length) {
                    this.zzb = Arrays.copyOf(jArr, i4);
                }
                System.arraycopy(zzkrVar.zzb, 0, this.zzb, this.zzc, zzkrVar.zzc);
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

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkr) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zzc != zzkrVar.zzc) {
                return false;
            }
            long[] jArr = zzkrVar.zzb;
            for (int i2 = 0; i2 < this.zzc; i2++) {
                if (this.zzb[i2] != jArr[i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzi(i2);
        return Long.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + zzkf.zzc(this.zzb[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == longValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        int i3;
        zzbM();
        zzi(i2);
        long[] jArr = this.zzb;
        long j2 = jArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbM();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i3, jArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbM();
        zzi(i2);
        long[] jArr = this.zzb;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkd
    public final long zza(int i2) {
        zzi(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    /* renamed from: zze */
    public final zzkd zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzkr(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j2) {
        zzbM();
        int i2 = this.zzc;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[a.m(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        jArr3[i3] = j2;
    }
}
