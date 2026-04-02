package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzgq {
    public static Application zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static boolean zzb(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceAndroidTvMode()) {
            return true;
        }
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
        boolean hasSystemFeature2 = context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        if (zzc(context, testingConfiguration) && hasSystemFeature && !hasSystemFeature2) {
            return true;
        }
        return false;
    }

    public static boolean zzc(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }
}
