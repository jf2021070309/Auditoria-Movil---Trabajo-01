package com.facebook.ads.internal.q.a;

import java.util.Locale;
/* loaded from: classes2.dex */
public class r {
    public static String a(double d) {
        return String.format(Locale.US, "%.3f", Double.valueOf(d));
    }

    public static String a(long j) {
        return a(j / 1000.0d);
    }
}
