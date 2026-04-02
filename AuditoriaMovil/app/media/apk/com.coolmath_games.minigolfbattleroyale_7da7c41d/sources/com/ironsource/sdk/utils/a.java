package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;
/* loaded from: classes2.dex */
public final class a {
    private static a g;
    public String a = h.h();
    public String b = h.g();
    public String c = h.i();
    public String d = h.e();
    public int e = h.f();
    public String f;

    private a(Context context) {
        this.f = h.j(context);
    }

    public static a a(Context context) {
        if (g == null) {
            g = new a(context);
        }
        return g;
    }

    public static String a() {
        return "5.108";
    }

    public static float b(Context context) {
        return h.m(context);
    }

    public static void b() {
        g = null;
    }
}
