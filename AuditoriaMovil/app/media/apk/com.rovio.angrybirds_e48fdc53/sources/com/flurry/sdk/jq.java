package com.flurry.sdk;

import java.util.Locale;
/* loaded from: classes2.dex */
public final class jq {
    private static jq a;

    private jq() {
    }

    public static synchronized jq a() {
        jq jqVar;
        synchronized (jq.class) {
            if (a == null) {
                a = new jq();
            }
            jqVar = a;
        }
        return jqVar;
    }

    public static String b() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }
}
