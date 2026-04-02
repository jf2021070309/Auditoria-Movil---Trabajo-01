package com.flurry.sdk;
/* loaded from: classes2.dex */
public class mh {
    private static final String a = mh.class.getSimpleName();
    private static boolean b;

    public static synchronized void a() {
        synchronized (mh.class) {
            if (!b) {
                kq.a(jm.class);
                try {
                    kq.a(hs.class);
                } catch (NoClassDefFoundError e) {
                    ko.a(3, a, "Analytics module not available");
                }
                try {
                    kq.a(mf.class);
                } catch (NoClassDefFoundError e2) {
                    ko.a(3, a, "Crash module not available");
                }
                try {
                    kq.a((Class<? extends kr>) Class.forName("com.flurry.sdk.j"));
                } catch (ClassNotFoundException | NoClassDefFoundError e3) {
                    ko.a(3, a, "Ads module not available");
                }
                b = true;
            }
        }
    }
}
