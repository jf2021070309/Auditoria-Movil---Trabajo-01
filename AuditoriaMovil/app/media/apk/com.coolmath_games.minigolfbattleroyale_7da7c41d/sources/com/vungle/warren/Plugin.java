package com.vungle.warren;

import android.util.Log;
import com.vungle.warren.VungleApiClient;
/* loaded from: classes2.dex */
public class Plugin {
    private static final String TAG = Plugin.class.getSimpleName();

    public static void addWrapperInfo(VungleApiClient.WrapperFramework wrapperFramework, String str) {
        if (wrapperFramework != null && wrapperFramework != VungleApiClient.WrapperFramework.none) {
            VungleApiClient.WRAPPER_FRAMEWORK_SELECTED = wrapperFramework;
            VungleApiClient.setHeaderUa(VungleApiClient.getHeaderUa() + ";" + wrapperFramework);
            if (str != null && !str.isEmpty()) {
                VungleApiClient.setHeaderUa(VungleApiClient.getHeaderUa() + "/" + str);
            } else {
                Log.e(TAG, "Wrapper framework version is empty");
            }
        } else {
            Log.e(TAG, "Wrapper is null or is not none");
        }
        if (Vungle.isInitialized()) {
            Log.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
