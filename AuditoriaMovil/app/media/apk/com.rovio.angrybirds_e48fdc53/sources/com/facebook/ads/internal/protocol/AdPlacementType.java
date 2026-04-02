package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.facebook.internal.AnalyticsEvents;
import java.util.Locale;
/* loaded from: classes2.dex */
public enum AdPlacementType {
    UNKNOWN("unknown"),
    BANNER(GMAdConstant.RIT_TYPE_BANNER),
    INTERSTITIAL(GMAdConstant.RIT_TYPE_INTERSTITIAL),
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    INSTREAM("instream"),
    REWARDED_VIDEO("rewarded_video");
    
    private String a;

    AdPlacementType(String str) {
        this.a = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception e) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
