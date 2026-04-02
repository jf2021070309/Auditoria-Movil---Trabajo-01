package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzbx {
    private static final zzbx zza = new zzbx();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzbx() {
    }

    public static zzbx zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        this.zzb.add(zzeVar);
    }

    public final void zze(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzeVar);
        this.zzc.remove(zzeVar);
        if (zzg && !zzg()) {
            zzcd.zzb().zzf();
        }
    }

    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        boolean zzg = zzg();
        this.zzc.add(zzeVar);
        if (!zzg) {
            zzcd.zzb().zze();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
