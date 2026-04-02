package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzeso implements zzerx<JSONObject> {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;

    public zzeso(AdvertisingIdClient.Info info, String str) {
        this.zza = info;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(jSONObject, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                zzg.put("pdid", this.zzb);
                zzg.put("pdidtype", "ssaid");
                return;
            }
            zzg.put("rdid", this.zza.getId());
            zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzg.put("idtype", "adid");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
