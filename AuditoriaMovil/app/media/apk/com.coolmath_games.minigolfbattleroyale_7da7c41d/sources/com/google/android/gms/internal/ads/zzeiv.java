package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeiv implements zzeee<zzbxn, zzefy> {
    private final zzejz zza;

    public zzeiv(zzejz zzejzVar) {
        this.zza = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final zzeef<zzbxn, zzefy> zza(String str, JSONObject jSONObject) throws zzfaw {
        zzbxn zzb = this.zza.zzb(str);
        if (zzb == null) {
            return null;
        }
        return new zzeef<>(zzb, new zzefy(), str);
    }
}
