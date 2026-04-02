package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfpw<T> implements Comparator<T> {
    public static <C extends Comparable> zzfpw<C> zzb() {
        return zzfpu.zza;
    }

    public static <T> zzfpw<T> zzc(Comparator<T> comparator) {
        if (comparator instanceof zzfpw) {
            return (zzfpw) comparator;
        }
        return new zzfnu(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public <S extends T> zzfpw<S> zza() {
        return new zzfqf(this);
    }
}
