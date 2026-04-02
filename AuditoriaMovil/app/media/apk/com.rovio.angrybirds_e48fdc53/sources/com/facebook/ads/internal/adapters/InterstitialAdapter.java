package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class InterstitialAdapter implements AdAdapter {
    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public final AdPlacementType getPlacementType() {
        return AdPlacementType.INTERSTITIAL;
    }

    public abstract void loadInterstitialAd(Context context, InterstitialAdapterListener interstitialAdapterListener, Map<String, Object> map, com.facebook.ads.internal.m.c cVar, EnumSet<CacheFlag> enumSet);

    public abstract boolean show();
}
