package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.d.a.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;
/* loaded from: classes.dex */
public final class zzbye implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcgt.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcgt.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcgt.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzcgt.zzi("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzcgt.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else if (!PlatformVersion.isAtLeastIceCreamSandwichMR1() || !zzbkj.zza(context)) {
            zzcgt.zzi("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzcgt.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            MediationInterstitialListener mediationInterstitialListener2 = this.zzb;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        c cVar = new c(intent, null);
        cVar.a.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbyd(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(cVar.a, null), null, new zzbyc(this), null, new zzcgz(0, 0, false, false, false), null, null)));
        com.google.android.gms.ads.internal.zzt.zzg().zzh();
    }
}
