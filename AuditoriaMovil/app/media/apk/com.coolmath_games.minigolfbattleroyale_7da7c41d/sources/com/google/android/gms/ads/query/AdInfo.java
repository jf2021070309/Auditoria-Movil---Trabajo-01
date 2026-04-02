package com.google.android.gms.ads.query;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzcgt;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@Deprecated
/* loaded from: classes.dex */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    public static String getRequestId(String str) {
        if (str == null) {
            zzcgt.zzi("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            zzcgt.zzi("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public String getAdString() {
        return this.zzb;
    }

    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}
