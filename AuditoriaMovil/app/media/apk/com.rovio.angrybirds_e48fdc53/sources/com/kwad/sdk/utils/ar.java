package com.kwad.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes3.dex */
public final class ar {
    public static int ar(Context context, String str) {
        Resources cv = cv(context);
        if (cv == null) {
            cv = context.getResources();
        }
        return cv.getIdentifier(str, "drawable", context.getPackageName());
    }

    public static Resources cv(Context context) {
        if (context == null) {
            return null;
        }
        return ServiceProvider.HA().getResources();
    }
}
