package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnv extends zzfny {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnv() {
        super(null);
    }

    static final zzfny zzf(int i) {
        zzfny zzfnyVar;
        zzfny zzfnyVar2;
        zzfny zzfnyVar3;
        if (i < 0) {
            zzfnyVar3 = zzfny.zzb;
            return zzfnyVar3;
        } else if (i > 0) {
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
    public final zzfny zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
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
