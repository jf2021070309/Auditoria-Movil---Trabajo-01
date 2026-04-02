package com.google.android.gms.internal.pal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzlb {
    private final ConcurrentMap zza;
    private final zzkv zzb;
    private final Class zzc;
    private final zzrb zzd;

    public /* synthetic */ zzlb(ConcurrentMap concurrentMap, zzkv zzkvVar, zzrb zzrbVar, Class cls, zzla zzlaVar) {
        this.zza = concurrentMap;
        this.zzb = zzkvVar;
        this.zzc = cls;
        this.zzd = zzrbVar;
    }

    public final zzkv zza() {
        return this.zzb;
    }

    public final zzrb zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final boolean zze() {
        if (!this.zzd.zza().isEmpty()) {
            return true;
        }
        return false;
    }
}
