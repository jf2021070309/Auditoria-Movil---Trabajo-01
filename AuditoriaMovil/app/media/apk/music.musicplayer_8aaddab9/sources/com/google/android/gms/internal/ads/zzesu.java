package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzesu implements zzerx<JSONObject> {
    private final String zza;

    public zzesu(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.zza);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
