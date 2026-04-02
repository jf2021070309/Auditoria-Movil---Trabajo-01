package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbjy {
    private final Map<String, zzbjx> zza = new HashMap();
    private final zzbka zzb;

    public zzbjy(zzbka zzbkaVar) {
        this.zzb = zzbkaVar;
    }

    public final void zza(String str, zzbjx zzbjxVar) {
        this.zza.put(str, zzbjxVar);
    }

    public final void zzb(String str, String str2, long j2) {
        zzbka zzbkaVar = this.zzb;
        zzbjx zzbjxVar = this.zza.get(str2);
        String[] strArr = {str};
        if (zzbjxVar != null) {
            zzbkaVar.zzb(zzbjxVar, j2, strArr);
        }
        this.zza.put(str, new zzbjx(j2, null, null));
    }

    public final zzbka zzc() {
        return this.zzb;
    }
}
