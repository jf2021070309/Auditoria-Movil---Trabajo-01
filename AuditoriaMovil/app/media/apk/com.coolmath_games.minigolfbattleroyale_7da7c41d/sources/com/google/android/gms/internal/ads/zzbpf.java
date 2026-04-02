package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbpf implements zzbpr<zzcml> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        JSONObject zzc;
        zzcml zzcmlVar2 = zzcmlVar;
        zzblt zzaq = zzcmlVar2.zzaq();
        if (zzaq == null || (zzc = zzaq.zzc()) == null) {
            zzcmlVar2.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcmlVar2.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}
