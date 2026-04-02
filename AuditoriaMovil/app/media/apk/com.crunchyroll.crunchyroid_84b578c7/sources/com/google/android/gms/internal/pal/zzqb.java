package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqb {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzqb(zzpv zzpvVar, zzqa zzqaVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzpvVar.zza;
        this.zza = new HashMap(map);
        map2 = zzpvVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzpvVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzpvVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzka zza(zzpu zzpuVar, zzlg zzlgVar) throws GeneralSecurityException {
        zzpx zzpxVar = new zzpx(zzpuVar.getClass(), zzpuVar.zzb(), null);
        if (this.zzb.containsKey(zzpxVar)) {
            return ((zzou) this.zzb.get(zzpxVar)).zza(zzpuVar, zzlgVar);
        }
        throw new GeneralSecurityException(e.e("No Key Parser for requested key type ", zzpxVar.toString(), " available"));
    }
}
