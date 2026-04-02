package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@Deprecated
/* loaded from: classes.dex */
public final class AdUrlAdapter extends AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, MediationNativeAdapter {
    private static final String AD_URL_AD_UNIT_ID = "adurl";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    public String getAdUnitId(Bundle bundle) {
        return AD_URL_AD_UNIT_ID;
    }

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    protected Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
