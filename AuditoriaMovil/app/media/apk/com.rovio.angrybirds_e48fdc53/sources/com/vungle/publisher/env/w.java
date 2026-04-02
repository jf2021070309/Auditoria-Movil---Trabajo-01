package com.vungle.publisher.env;

import android.os.Build;
/* loaded from: classes4.dex */
public interface w {
    public static final boolean a = "Amazon".equals(Build.MANUFACTURER);
    public static final String b;
    public static final String c;

    static {
        b = a ? "amazon" : "android";
        c = a ? "VungleAmazon/" : "VungleDroid/";
    }
}
