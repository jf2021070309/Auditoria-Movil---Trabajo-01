package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzcsg implements zzcsc {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcsg(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        this.zza.zzg(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
