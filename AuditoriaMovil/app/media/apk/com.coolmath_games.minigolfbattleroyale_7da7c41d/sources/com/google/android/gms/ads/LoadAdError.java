package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            return this.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zza());
        }
        return zzb;
    }
}
