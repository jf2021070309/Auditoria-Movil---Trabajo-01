package com.vungle.publisher;
/* loaded from: classes4.dex */
public interface VungleAdEventListener {
    void onAdAvailabilityUpdate(String str, boolean z);

    void onAdEnd(String str, boolean z, boolean z2);

    void onAdStart(String str);

    void onUnableToPlayAd(String str, String str2);
}
