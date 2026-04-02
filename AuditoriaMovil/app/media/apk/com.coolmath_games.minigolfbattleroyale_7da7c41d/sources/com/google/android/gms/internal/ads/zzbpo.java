package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbpo implements zzbpr<zzcml> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        if (map.keySet().contains("start")) {
            zzcmlVar2.zzR().zzk();
        } else if (map.keySet().contains("stop")) {
            zzcmlVar2.zzR().zzl();
        } else if (map.keySet().contains("cancel")) {
            zzcmlVar2.zzR().zzm();
        }
    }
}
