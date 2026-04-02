package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbpg implements zzbpr<zzcml> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        JSONObject zzd;
        zzcml zzcmlVar2 = zzcmlVar;
        zzblt zzaq = zzcmlVar2.zzaq();
        if (zzaq == null || (zzd = zzaq.zzd()) == null) {
            zzcmlVar2.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcmlVar2.zzd("nativeClickMetaReady", zzd);
        }
    }
}
