package com.fyber.inneractive.sdk.util;

import com.google.android.gms.measurement.AppMeasurement;
/* loaded from: classes.dex */
public final class al {
    public static boolean a(String str) {
        String e = com.fyber.inneractive.sdk.config.f.e();
        return e != null && e.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(AppMeasurement.CRASH_ORIGIN);
    }
}
