package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
/* loaded from: classes3.dex */
public final class c {
    public static boolean bH(Context context) {
        try {
            if (context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29) {
                if (!Environment.isExternalStorageLegacy()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}
