package com.facebook.ads;
/* loaded from: classes2.dex */
public interface Ad {
    void destroy();

    String getPlacementId();

    void loadAd();

    void loadAdFromBid(String str);
}
