package com.google.ads.mediation.customevent;

import android.view.View;
import androidx.annotation.RecentlyNonNull;
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBannerListener extends CustomEventListener {
    void onClick();

    void onReceivedAd(@RecentlyNonNull View view);
}
