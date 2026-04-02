package com.vungle.warren.utility;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.drive.DriveFile;
import com.vungle.warren.utility.ActivityManager;
/* loaded from: classes2.dex */
public class ExternalRouter {
    public static final String TAG = ExternalRouter.class.getSimpleName();

    public static boolean launch(String str, Context context, ActivityManager.LeftApplicationCallback leftApplicationCallback) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(DriveFile.MODE_READ_ONLY);
                ActivityManager.startWhenForeground(context, parseUri, leftApplicationCallback);
                return true;
            } catch (Exception e) {
                String str2 = TAG;
                Log.e(str2, "Error while opening url" + e.getLocalizedMessage());
                String str3 = TAG;
                Log.d(str3, "Cannot open url " + str);
            }
        }
        return false;
    }
}
