package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzfae {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfae(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
        this.zzd = zzc;
        this.zza = zzc.optString("ad_html", null);
        this.zzb = zzc.optString("ad_base_url", null);
        this.zzc = zzc.optJSONObject("ad_json");
    }
}
