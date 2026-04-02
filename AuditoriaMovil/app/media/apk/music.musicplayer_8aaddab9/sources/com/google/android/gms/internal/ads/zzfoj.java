package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfoj<E> extends zzfoe<E> implements List<E>, RandomAccess {
    private static final zzfqm<Object> zza = new zzfoh(zzfpx.zza, 0);

    public static <E> zzfoj<E> zzi() {
        return (zzfoj<E>) zzfpx.zza;
    }

    public static <E> zzfoj<E> zzj(E e2) {
        Object[] objArr = {e2};
        zzfpv.zza(objArr, 1);
        return zzs(objArr, 1);
    }

    public static <E> zzfoj<E> zzk(E e2, E e3) {
        Object[] objArr = {e2, e3};
        zzfpv.zza(objArr, 2);
        return zzs(objArr, 2);
    }

    public static <E> zzfoj<E> zzl(E e2, E e3, E e4) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfpv.zza(objArr, 3);
        return zzs(objArr, 3);
    }

    public static <E> zzfoj<E> zzm(E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e2, e3, e4, e5, e6};
        zzfpv.zza(objArr, 5);
        return zzs(objArr, 5);
    }

    public static <E> zzfoj<E> zzn(E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] objArr = {e2, e3, e4, e5, e6, e7};
        zzfpv.zza(objArr, 6);
        return zzs(objArr, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> zzfoj<E> zzo(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return zzp(iterable);
    }

    public static <E> zzfoj<E> zzp(Collection<? extends E> collection) {
        if (!(collection instanceof zzfoe)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfpv.zza(array, length);
            return zzs(array, length);
        }
        zzfoj<E> zze = ((zzfoe) collection).zze();
        if (zze.zzf()) {
            Object[] array2 = zze.toArray();
            return zzs(array2, array2.length);
        }
        return zze;
    }

    public static <E> zzfoj<E> zzq(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        zzfpv.zza(objArr, length);
        return zzs(objArr, length);
    }

    public static <E> zzfoj<E> zzr(Object[] objArr) {
        return zzs(objArr, objArr.length);
    }

    public static <E> zzfoj<E> zzs(Object[] objArr, int i2) {
        return i2 == 0 ? (zzfoj<E>) zzfpx.zza : new zzfpx(objArr, i2);
    }

    public static <E> zzfog<E> zzu() {
        return new zzfog<>(4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (zzflt.zza(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzflt.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final zzfql<E> zza() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @Deprecated
    public final zzfoj<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public int zzg(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfoj<E> subList(int i2, int i3) {
        zzflx.zzg(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (zzfoj<E>) zzfpx.zza : new zzfoi(this, i2, i4);
    }

    @Override // java.util.List
    /* renamed from: zzt */
    public final zzfqm<E> listIterator(int i2) {
        zzflx.zzf(i2, size(), "index");
        return isEmpty() ? (zzfqm<E>) zza : new zzfoh(this, i2);
    }
}
