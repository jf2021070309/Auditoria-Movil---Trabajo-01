package com.google.ads.interactivemedia.v3.api;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public interface AdErrorEvent {

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public interface AdErrorListener {
        void onAdError(AdErrorEvent adErrorEvent);
    }

    AdError getError();

    Object getUserRequestContext();
}
