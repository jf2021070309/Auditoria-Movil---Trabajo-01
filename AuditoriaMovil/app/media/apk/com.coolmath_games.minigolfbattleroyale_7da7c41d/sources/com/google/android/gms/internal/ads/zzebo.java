package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzebo implements zzbtz<zzebp> {
    @Override // com.google.android.gms.internal.ads.zzbtz
    public final /* bridge */ /* synthetic */ JSONObject zzb(zzebp zzebpVar) throws JSONException {
        zzebp zzebpVar2 = zzebpVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzebpVar2.zzc.zzc());
        jSONObject2.put("signals", zzebpVar2.zzb);
        jSONObject3.put(SDKConstants.PARAM_A2U_BODY, zzebpVar2.zza.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzt.zzc().zzj(zzebpVar2.zza.zzb));
        jSONObject3.put("response_code", zzebpVar2.zza.zza);
        jSONObject3.put("latency", zzebpVar2.zza.zzd);
        jSONObject.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzebpVar2.zzc.zzh());
        return jSONObject;
    }
}
