package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class BannerAdapter implements AdAdapter {
    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public final AdPlacementType getPlacementType() {
        return AdPlacementType.BANNER;
    }

    public abstract void loadBannerAd(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.protocol.e eVar, BannerAdapterListener bannerAdapterListener, Map<String, Object> map);
}
