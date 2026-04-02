package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbpc implements zzbpr {
    static final zzbpr zza = new zzbpc();

    private zzbpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnn zzcnnVar = (zzcnn) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("URL missing from httpTrack GMSG.");
        } else {
            new com.google.android.gms.ads.internal.util.zzcb(zzcnnVar.getContext(), ((zzcnv) zzcnnVar).zzt().zza, str).zzc();
        }
    }
}
