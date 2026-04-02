package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class zzfny {
    private static final zzfny zza = new zzfnv();
    private static final zzfny zzb = new zzfnw(-1);
    private static final zzfny zzc = new zzfnw(1);

    public /* synthetic */ zzfny(zzfnx zzfnxVar) {
    }

    public static zzfny zzj() {
        return zza;
    }

    public abstract <T> zzfny zza(T t, T t2, Comparator<T> comparator);

    public abstract zzfny zzb(int i2, int i3);

    public abstract zzfny zzc(boolean z, boolean z2);

    public abstract zzfny zzd(boolean z, boolean z2);

    public abstract int zze();
}
