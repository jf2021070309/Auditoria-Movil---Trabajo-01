package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzeuj implements zzerx<JSONObject> {
    private final String zza;

    public zzeuj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbx.zzg(jSONObject2, "pii").put("adsid", this.zza);
        } catch (JSONException e2) {
            zzcgt.zzj("Failed putting trustless token.", e2);
        }
    }
}
