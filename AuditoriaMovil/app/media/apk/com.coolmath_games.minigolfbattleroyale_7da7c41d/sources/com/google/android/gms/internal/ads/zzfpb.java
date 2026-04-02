package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfpb {
    public static <E> ArrayList<E> zza(int i) {
        zzfni.zzb(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <F, T> List<T> zzb(List<F> list, zzfln<? super F, ? extends T> zzflnVar) {
        return new zzfpa(list, zzflnVar);
    }
}
