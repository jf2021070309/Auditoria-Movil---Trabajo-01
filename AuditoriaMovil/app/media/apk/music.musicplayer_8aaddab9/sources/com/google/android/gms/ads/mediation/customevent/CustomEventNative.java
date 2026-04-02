package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
/* loaded from: classes.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull CustomEventNativeListener customEventNativeListener, String str, @RecentlyNonNull NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle);
}
