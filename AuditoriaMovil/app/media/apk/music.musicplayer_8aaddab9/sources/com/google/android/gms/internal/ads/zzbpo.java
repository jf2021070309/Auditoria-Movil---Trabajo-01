package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbpo implements zzbpr<zzcml> {
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
