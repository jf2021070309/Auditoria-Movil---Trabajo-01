package com.kwad.sdk.crash.utils;

import com.facebook.appevents.AppEventsConstants;
/* loaded from: classes.dex */
public final class j {
    public static String al(long j) {
        String valueOf;
        String valueOf2;
        long j2 = j / 60000;
        long j3 = (j - (60000 * j2)) / 1000;
        if (j2 < 10) {
            valueOf = AppEventsConstants.EVENT_PARAM_VALUE_NO + j2;
        } else {
            valueOf = String.valueOf(j2);
        }
        if (j3 < 10) {
            valueOf2 = AppEventsConstants.EVENT_PARAM_VALUE_NO + j3;
        } else {
            valueOf2 = String.valueOf(j3);
        }
        return valueOf + ":" + valueOf2;
    }
}
