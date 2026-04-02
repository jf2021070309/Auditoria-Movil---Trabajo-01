package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class n {
    public static boolean a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.b("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, String str) {
        return !TextUtils.isEmpty(str) && a(context, Uri.parse(str));
    }
}
