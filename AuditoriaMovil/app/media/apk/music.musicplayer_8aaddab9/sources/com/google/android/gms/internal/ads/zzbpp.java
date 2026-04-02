package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbpp implements zzbpr<zzcml> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        if (map.keySet().contains("start")) {
            zzcmlVar2.zzar(true);
        }
        if (map.keySet().contains("stop")) {
            zzcmlVar2.zzar(false);
        }
    }
}
