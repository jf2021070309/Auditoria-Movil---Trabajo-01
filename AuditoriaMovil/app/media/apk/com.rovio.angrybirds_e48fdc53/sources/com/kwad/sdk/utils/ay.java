package com.kwad.sdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* loaded from: classes3.dex */
public final class ay {
    private static String TAG = "plugin.signature";

    private static Signature[] cX(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String str = TAG;
            com.kwad.sdk.core.e.c.w(str, "Can not get signature, error = " + e.getLocalizedMessage());
            com.kwad.sdk.core.e.c.w(TAG, e);
            return null;
        }
    }

    public static String cY(Context context) {
        try {
            Signature[] cX = cX(context);
            if (cX != null && cX.length > 0) {
                return ad.l(cX[0].toByteArray());
            }
            return "";
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.w(TAG, e);
            return "";
        }
    }
}
