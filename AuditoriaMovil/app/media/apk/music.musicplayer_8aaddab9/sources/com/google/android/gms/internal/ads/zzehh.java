package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class zzehh<AdT> implements zzeec<AdT> {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        return !TextUtils.isEmpty(zzezzVar.zzv.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<AdT> zzb(zzfal zzfalVar, zzezz zzezzVar) {
        String optString = zzezzVar.zzv.optString("pubid", "");
        zzfar zzfarVar = zzfalVar.zza.zza;
        zzfap zzfapVar = new zzfap();
        zzfapVar.zzK(zzfarVar);
        zzfapVar.zzw(optString);
        Bundle zzd = zzd(zzfarVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzezzVar.zzv.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            zzd2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = zzezzVar.zzv.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            zzd2.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzezzVar.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzezzVar.zzD.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzbdg zzbdgVar = zzfarVar.zzd;
        zzfapVar.zzr(new zzbdg(zzbdgVar.zza, zzbdgVar.zzb, zzd2, zzbdgVar.zzd, zzbdgVar.zze, zzbdgVar.zzf, zzbdgVar.zzg, zzbdgVar.zzh, zzbdgVar.zzi, zzbdgVar.zzj, zzbdgVar.zzk, zzbdgVar.zzl, zzd, zzbdgVar.zzn, zzbdgVar.zzo, zzbdgVar.zzp, zzbdgVar.zzq, zzbdgVar.zzr, zzbdgVar.zzs, zzbdgVar.zzt, zzbdgVar.zzu, zzbdgVar.zzv, zzbdgVar.zzw, zzbdgVar.zzx));
        zzfar zzL = zzfapVar.zzL();
        Bundle bundle = new Bundle();
        zzfac zzfacVar = zzfalVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfacVar.zza));
        bundle2.putInt("refresh_interval", zzfacVar.zzc);
        bundle2.putString("gws_query_id", zzfacVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfalVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzezzVar.zzw);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzezzVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzezzVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzezzVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzezzVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzezzVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzezzVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzezzVar.zzj));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzezzVar.zzk);
        bundle3.putString("valid_from_timestamp", zzezzVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzezzVar.zzL);
        if (zzezzVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzezzVar.zzm.zzb);
            bundle4.putString("rb_type", zzezzVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzL, bundle);
    }

    public abstract zzfsm<AdT> zzc(zzfar zzfarVar, Bundle bundle);
}
