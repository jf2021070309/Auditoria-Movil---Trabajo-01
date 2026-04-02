package com.bytedance.msdk.api.v2.ad.nativeAd;

import com.bytedance.msdk.api.AdError;
import java.util.List;
/* loaded from: classes.dex */
public interface GMPrimeNativeAdLoadCallback extends GMNativeAdLoadCallback {
    void onSingleAdLoad(List<GMNativeAd> list, AdError adError);
}
