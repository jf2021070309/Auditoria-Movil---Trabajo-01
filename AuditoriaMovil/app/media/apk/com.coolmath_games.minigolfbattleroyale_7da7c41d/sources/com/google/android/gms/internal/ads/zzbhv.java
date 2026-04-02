package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbhv {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzbhv(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        if (TextUtils.isEmpty(this.zzc)) {
            return "";
        }
        try {
            return new JSONObject(this.zzc).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final Bundle zzc() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzc;
    }
}
