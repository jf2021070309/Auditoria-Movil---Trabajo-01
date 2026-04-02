package com.facebook.ads.internal.i;

import android.content.Context;
import android.util.Log;
/* loaded from: classes2.dex */
public class a {
    private static a b;
    private Context d;
    private static final String a = a.class.getName();
    private static boolean c = false;

    private a(Context context) {
        this.d = context;
    }

    public static a a(Context context) {
        if (b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (applicationContext) {
                if (b == null) {
                    b = new a(applicationContext);
                }
            }
        }
        return b;
    }

    public synchronized void a() {
        if (!c) {
            if (com.facebook.ads.internal.l.a.g(this.d)) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new com.facebook.ads.internal.f.c(Thread.getDefaultUncaughtExceptionHandler(), this.d, new c(this.d, false).b()));
                } catch (SecurityException e) {
                    Log.e(a, "No permissions to set the default uncaught exception handler", e);
                }
            }
            c = true;
        }
    }
}
