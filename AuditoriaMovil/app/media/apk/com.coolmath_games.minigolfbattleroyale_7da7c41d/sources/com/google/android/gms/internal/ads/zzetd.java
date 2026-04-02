package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzetd implements zzerx<JSONObject> {
    private final String zza;

    public zzetd(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(jSONObject, "pii");
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            zzg.put("attok", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e);
        }
    }
}
