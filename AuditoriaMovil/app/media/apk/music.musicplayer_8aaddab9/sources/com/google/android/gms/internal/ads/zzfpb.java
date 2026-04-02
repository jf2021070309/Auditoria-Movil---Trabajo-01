package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzfpb {
    public static <E> ArrayList<E> zza(int i2) {
        zzfni.zzb(i2, "initialArraySize");
        return new ArrayList<>(i2);
    }

    public static <F, T> List<T> zzb(List<F> list, zzfln<? super F, ? extends T> zzflnVar) {
        return new zzfpa(list, zzflnVar);
    }
}
