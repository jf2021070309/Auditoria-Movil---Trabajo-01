package com.facebook.ads.internal.q.a;

import java.util.Random;
/* loaded from: classes2.dex */
public class n {
    private static String a() {
        return p.a(Thread.currentThread().getStackTrace());
    }

    public static String a(int i) {
        if (i > 0 && new Random().nextFloat() < 1.0f / i) {
            return a();
        }
        return null;
    }
}
