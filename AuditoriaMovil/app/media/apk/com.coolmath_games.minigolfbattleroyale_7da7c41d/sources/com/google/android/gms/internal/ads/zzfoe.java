package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfoe<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@CheckForNull Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract zzfql<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public Object[] zzb() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzc() {
        throw new UnsupportedOperationException();
    }

    int zzd() {
        throw new UnsupportedOperationException();
    }

    public zzfoj<E> zze() {
        return isEmpty() ? zzfoj.zzi() : zzfoj.zzr(toArray(zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzg(Object[] objArr, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int size = size();
            int length = tArr.length;
            if (length < size) {
                Object[] zzb = zzb();
                if (zzb == null) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                } else {
                    return (T[]) Arrays.copyOfRange(zzb, zzc(), zzd(), tArr.getClass());
                }
            } else if (length > size) {
                tArr[size] = null;
            }
            zzg(tArr, 0);
            return tArr;
        }
        throw null;
    }
}
