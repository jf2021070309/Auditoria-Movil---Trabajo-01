package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdwk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdwk(String str, zzdwl zzdwlVar) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzf(zzdwk zzdwkVar) {
        String str = (String) zzbet.zzc().zzc(zzbjl.zzgM);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdwkVar.zza);
            jSONObject.put("eventCategory", zzdwkVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdwkVar.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzdwkVar.zzd);
            jSONObject.putOpt("rewardType", zzdwkVar.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdwkVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
