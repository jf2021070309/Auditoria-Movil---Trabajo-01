package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdwk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdwk(String str, zzdwl zzdwlVar) {
        this.zzb = str;
    }

    public static /* synthetic */ String zzf(zzdwk zzdwkVar) {
        String str = (String) zzbet.zzc().zzc(zzbjl.zzgM);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdwkVar.zza);
            jSONObject.put("eventCategory", zzdwkVar.zzb);
            jSONObject.putOpt("event", zzdwkVar.zzc);
            jSONObject.putOpt("errorCode", zzdwkVar.zzd);
            jSONObject.putOpt("rewardType", zzdwkVar.zze);
            jSONObject.putOpt("rewardAmount", zzdwkVar.zzf);
        } catch (JSONException unused) {
            zzcgt.zzi("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return a.t(new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length()), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }
}
