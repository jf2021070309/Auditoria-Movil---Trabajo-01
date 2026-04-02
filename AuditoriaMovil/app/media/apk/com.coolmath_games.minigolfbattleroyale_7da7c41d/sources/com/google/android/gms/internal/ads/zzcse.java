package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcse implements zzcsc {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcse(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        this.zza.zzc(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
