package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbva {
    public final String zza;
    public final String zzb;
    public final List<String> zzc;
    public final String zzd;
    public final String zze;
    public final List<String> zzf;
    public final List<String> zzg;
    public final List<String> zzh;
    public final List<String> zzi;
    public final List<String> zzj;
    public final String zzk;
    public final List<String> zzl;
    public final List<String> zzm;
    public final List<String> zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List<String> zzt;
    public final String zzu;
    public final String zzv;

    public zzbva(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.zzb = jSONObject.optString(FacebookAdapter.KEY_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzf = zzbvc.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzg = zzbvc.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzh = zzbvc.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzj = zzbvc.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzl = zzbvc.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzn = zzbvc.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzm = zzbvc.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzu();
            list = zzbvc.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzi = list;
        this.zza = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzk = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zze = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzq = jSONObject.optString("html_template", null);
        this.zzr = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzs = optJSONObject3 != null ? optJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.zzt.zzu();
        this.zzt = zzbvc.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzu = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.zzv = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
