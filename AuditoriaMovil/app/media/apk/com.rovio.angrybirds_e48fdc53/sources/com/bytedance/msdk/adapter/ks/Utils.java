package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
/* loaded from: classes.dex */
public class Utils {
    public static float dip2Px(Context context, float f) {
        if (context == null) {
            return 0.0f;
        }
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int getScreenWidthInPx(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static void printPrivacyLog(MediationInitConfig mediationInitConfig) {
    }
}
