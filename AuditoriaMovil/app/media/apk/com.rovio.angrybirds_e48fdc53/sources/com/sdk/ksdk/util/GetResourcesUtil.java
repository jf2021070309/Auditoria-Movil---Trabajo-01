package com.sdk.ksdk.util;

import android.app.Activity;
/* loaded from: classes3.dex */
public class GetResourcesUtil {
    public static int getResource(Activity activity, String type, String name) {
        return activity.getResources().getIdentifier(name, type, activity.getPackageName());
    }
}
