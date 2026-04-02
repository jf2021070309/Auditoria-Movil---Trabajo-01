package com.google.ads.mediation.customevent;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBannerListener extends CustomEventListener {
    void onClick();

    void onReceivedAd(View view);
}
