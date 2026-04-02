package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class zzfpw<T> implements Comparator<T> {
    public static <C extends Comparable> zzfpw<C> zzb() {
        return zzfpu.zza;
    }

    public static <T> zzfpw<T> zzc(Comparator<T> comparator) {
        return comparator instanceof zzfpw ? (zzfpw) comparator : new zzfnu(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public <S extends T> zzfpw<S> zza() {
        return new zzfqf(this);
    }
}
