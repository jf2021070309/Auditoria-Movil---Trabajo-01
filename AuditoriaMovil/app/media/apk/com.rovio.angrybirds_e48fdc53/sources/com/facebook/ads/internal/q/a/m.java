package com.facebook.ads.internal.q.a;

import java.util.UUID;
/* loaded from: classes2.dex */
public class m {
    private static final String a = m.class.getSimpleName();
    private static volatile boolean b = false;
    private static double c;
    private static String d;

    public static void a() {
        if (b) {
            return;
        }
        synchronized (a) {
            if (!b) {
                b = true;
                c = System.currentTimeMillis() / 1000.0d;
                d = UUID.randomUUID().toString();
            }
        }
    }

    public static double b() {
        return c;
    }

    public static String c() {
        return d;
    }
}
