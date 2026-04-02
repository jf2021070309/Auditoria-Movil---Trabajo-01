package com.bytedance.msdk.api.nativeAd;

import com.bytedance.msdk.api.AdError;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public interface TTNativeAdLoadCallback {
    void onAdLoaded(List<TTNativeAd> list);

    void onAdLoadedFial(AdError adError);
}
