package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbzw {
    public final boolean zza;
    public final String zzb;

    public zzbzw(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbzw zza(JSONObject jSONObject) {
        return new zzbzw(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
