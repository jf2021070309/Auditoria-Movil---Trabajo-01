package com.google.android.gms.ads.mediation;

import androidx.annotation.RecentlyNonNull;
/* loaded from: classes.dex */
public interface InitializationCompleteCallback {
    void onInitializationFailed(@RecentlyNonNull String str);

    void onInitializationSucceeded();
}
