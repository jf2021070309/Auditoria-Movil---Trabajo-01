package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.if0.c;
import java.util.HashSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzct {
    private c zza;
    private final zzdc zzb;

    public zzct(zzdc zzdcVar) {
        this.zzb = zzdcVar;
    }

    public final c zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzdd(this));
    }

    public final void zzc(c cVar, HashSet hashSet, long j) {
        this.zzb.zzb(new zzde(this, hashSet, cVar, j));
    }

    public final void zzd(c cVar, HashSet hashSet, long j) {
        this.zzb.zzb(new zzdf(this, hashSet, cVar, j));
    }

    public final void zze(c cVar) {
        this.zza = cVar;
    }
}
