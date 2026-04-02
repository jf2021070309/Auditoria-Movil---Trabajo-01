package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfny {
    private static final zzfny zza = new zzfnv();
    private static final zzfny zzb = new zzfnw(-1);
    private static final zzfny zzc = new zzfnw(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfny(zzfnx zzfnxVar) {
    }

    public static zzfny zzj() {
        return zza;
    }

    public abstract <T> zzfny zza(T t, T t2, Comparator<T> comparator);

    public abstract zzfny zzb(int i, int i2);

    public abstract zzfny zzc(boolean z, boolean z2);

    public abstract zzfny zzd(boolean z, boolean z2);

    public abstract int zze();
}
