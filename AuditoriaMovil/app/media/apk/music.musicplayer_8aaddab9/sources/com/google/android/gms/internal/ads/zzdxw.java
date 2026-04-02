package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdxw {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final String zzd;
    private final int zze;

    public zzdxw(String str, String str2, int i2, String str3, int i3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = str3;
        this.zze = i3;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzb);
        jSONObject.put("status", this.zzc);
        jSONObject.put("description", this.zzd);
        jSONObject.put("initializationLatencyMillis", this.zze);
        return jSONObject;
    }
}
