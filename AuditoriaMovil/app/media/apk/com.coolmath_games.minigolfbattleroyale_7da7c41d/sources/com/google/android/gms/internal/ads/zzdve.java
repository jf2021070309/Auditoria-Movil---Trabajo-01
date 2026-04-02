package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdve {
    private final ConcurrentHashMap<String, String> zza;
    private final zzcgi zzb;

    public zzdve(zzdvn zzdvnVar, zzcgi zzcgiVar) {
        this.zza = new ConcurrentHashMap<>(zzdvnVar.zzb);
        this.zzb = zzcgiVar;
    }

    public final void zza(zzfal zzfalVar) {
        if (zzfalVar.zzb.zza.size() > 0) {
            switch (zzfalVar.zzb.zza.get(0).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzj() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        if (!TextUtils.isEmpty(zzfalVar.zzb.zzb.zzb)) {
            this.zza.put("gqi", zzfalVar.zzb.zzb.zzb);
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
                if (TextUtils.isEmpty(zzc)) {
                    return;
                }
                this.zza.put("rtype", zzc);
            }
        }
    }

    public final void zzb(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzc() {
        return this.zza;
    }
}
