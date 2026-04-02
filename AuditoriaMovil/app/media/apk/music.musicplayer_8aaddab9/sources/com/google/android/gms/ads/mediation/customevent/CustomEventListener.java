package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdError;
/* loaded from: classes.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i2);

    void onAdFailedToLoad(@RecentlyNonNull AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
