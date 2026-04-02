package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzeun implements zzerx<JSONObject> {
    private final Map<String, Object> zza;

    public zzeun(Map<String, Object> map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", com.google.android.gms.ads.internal.zzt.zzc().zzj(this.zza));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
