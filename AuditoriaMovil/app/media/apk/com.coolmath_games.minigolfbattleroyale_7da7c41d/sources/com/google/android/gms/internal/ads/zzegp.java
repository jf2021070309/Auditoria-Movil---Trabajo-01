package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzegp implements zzeee<zzfbi, zzefy> {
    private final zzdtf zza;

    public zzegp(zzdtf zzdtfVar) {
        this.zza = zzdtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final zzeef<zzfbi, zzefy> zza(String str, JSONObject jSONObject) throws zzfaw {
        return new zzeef<>(this.zza.zzb(str, jSONObject), new zzefy(), str);
    }
}
