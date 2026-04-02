package com.flurry.sdk;

import android.content.Context;
/* loaded from: classes2.dex */
public class jm implements kr {
    public static synchronized jm a() {
        jm jmVar;
        synchronized (jm.class) {
            jmVar = (jm) ka.a().a(jm.class);
        }
        return jmVar;
    }

    @Override // com.flurry.sdk.kr
    public final void a(Context context) {
        lm.a(jz.class);
        kk.a();
        lv.a();
        lr.a();
        kc.a();
        jt.a();
        jn.a();
        ju.a();
        jr.a();
        jn.a();
        jw.a();
        jq.a();
        jy.a();
    }

    public static String b() {
        jz c = c();
        if (c == null) {
            return null;
        }
        return Long.toString(c.c);
    }

    public static jz c() {
        lm b = lo.a().b();
        if (b == null) {
            return null;
        }
        return (jz) b.b(jz.class);
    }

    public static long d() {
        jz c = c();
        if (c == null) {
            return 0L;
        }
        return c.c;
    }

    public static long e() {
        jz c = c();
        if (c == null) {
            return 0L;
        }
        return c.d;
    }

    public static long f() {
        jz c = c();
        if (c == null) {
            return -1L;
        }
        return c.e;
    }

    public static long g() {
        jz c = c();
        if (c == null) {
            return 0L;
        }
        return c.c();
    }

    public static int h() {
        return jt.a().b();
    }
}
