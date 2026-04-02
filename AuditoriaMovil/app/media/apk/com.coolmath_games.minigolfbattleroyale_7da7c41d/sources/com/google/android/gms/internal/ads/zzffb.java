package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffb {
    private final HashMap<String, String> zza = new HashMap<>();
    private final zzffh zzb = new zzffh(com.google.android.gms.ads.internal.zzt.zzj());

    private zzffb() {
        this.zza.put("new_csi", "1");
    }

    public static zzffb zza(String str) {
        zzffb zzffbVar = new zzffb();
        zzffbVar.zza.put("action", str);
        return zzffbVar;
    }

    public static zzffb zzb(String str) {
        zzffb zzffbVar = new zzffb();
        zzffbVar.zza.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
        return zzffbVar;
    }

    public final zzffb zzc(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzffb zzd(String str) {
        this.zzb.zza(str);
        return this;
    }

    public final zzffb zze(String str, String str2) {
        this.zzb.zzb(str, str2);
        return this;
    }

    public final zzffb zzf(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final zzffb zzg(zzfal zzfalVar, zzcgi zzcgiVar) {
        zzfak zzfakVar = zzfalVar.zzb;
        zzh(zzfakVar.zzb);
        if (!zzfakVar.zza.isEmpty()) {
            switch (zzfakVar.zza.get(0).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzcgiVar != null) {
                        this.zza.put("as", true != zzcgiVar.zzj() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            boolean zza = com.google.android.gms.ads.nonagon.signalgeneration.zze.zza(zzfalVar);
            this.zza.put("scar", String.valueOf(zza));
            if (zza) {
                String zzb = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzb(zzfalVar);
                if (!TextUtils.isEmpty(zzb)) {
                    this.zza.put("ragent", zzb);
                }
                String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzc(zzfalVar);
                if (!TextUtils.isEmpty(zzc)) {
                    this.zza.put("rtype", zzc);
                }
            }
        }
        return this;
    }

    public final zzffb zzh(zzfac zzfacVar) {
        if (!TextUtils.isEmpty(zzfacVar.zzb)) {
            this.zza.put("gqi", zzfacVar.zzb);
        }
        return this;
    }

    public final zzffb zzi(zzezz zzezzVar) {
        this.zza.put("aai", zzezzVar.zzw);
        return this;
    }

    public final Map<String, String> zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzffg zzffgVar : this.zzb.zzc()) {
            hashMap.put(zzffgVar.zza, zzffgVar.zzb);
        }
        return hashMap;
    }
}
