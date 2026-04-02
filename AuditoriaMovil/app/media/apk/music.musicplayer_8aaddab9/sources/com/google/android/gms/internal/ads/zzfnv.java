package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class zzfnv extends zzfny {
    public zzfnv() {
        super(null);
    }

    public static final zzfny zzf(int i2) {
        zzfny zzfnyVar;
        zzfny zzfnyVar2;
        zzfny zzfnyVar3;
        if (i2 < 0) {
            zzfnyVar3 = zzfny.zzb;
            return zzfnyVar3;
        } else if (i2 > 0) {
            zzfnyVar2 = zzfny.zzc;
            return zzfnyVar2;
        } else {
            zzfnyVar = zzfny.zza;
            return zzfnyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final <T> zzfny zza(T t, T t2, Comparator<T> comparator) {
        return zzf(comparator.compare(t, t2));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzb(int i2, int i3) {
        return zzf(i2 < i3 ? -1 : i2 > i3 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzc(boolean z, boolean z2) {
        return zzf(zzfqq.zza(false, false));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzd(boolean z, boolean z2) {
        return zzf(zzfqq.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final int zze() {
        return 0;
    }
}
