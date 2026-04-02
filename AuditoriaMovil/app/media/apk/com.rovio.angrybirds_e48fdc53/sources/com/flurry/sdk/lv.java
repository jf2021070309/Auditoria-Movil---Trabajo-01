package com.flurry.sdk;
/* loaded from: classes2.dex */
public final class lv {
    private static long a = 100;
    private static lv b = null;
    private final lw c = new lw();

    public lv() {
        this.c.a = a;
        this.c.b = true;
    }

    public static synchronized lv a() {
        lv lvVar;
        synchronized (lv.class) {
            if (b == null) {
                b = new lv();
            }
            lvVar = b;
        }
        return lvVar;
    }

    public final synchronized void a(kj<lu> kjVar) {
        kk.a().a("com.flurry.android.sdk.TickEvent", kjVar);
        if (kk.a().a("com.flurry.android.sdk.TickEvent") > 0) {
            this.c.a();
        }
    }

    public final synchronized void b(kj<lu> kjVar) {
        kk.a().b("com.flurry.android.sdk.TickEvent", kjVar);
        if (kk.a().a("com.flurry.android.sdk.TickEvent") == 0) {
            this.c.b();
        }
    }
}
