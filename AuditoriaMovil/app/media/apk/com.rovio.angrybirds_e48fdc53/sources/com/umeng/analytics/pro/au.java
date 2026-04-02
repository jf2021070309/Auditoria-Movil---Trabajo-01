package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;
/* compiled from: OpenDeviceId.java */
/* loaded from: classes3.dex */
public class au {
    private static at a = null;
    private static boolean b = false;

    public static synchronized String a(Context context) {
        synchronized (au.class) {
            try {
                if (context == null) {
                    throw new RuntimeException("Context is null");
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                b(context);
                at atVar = a;
                if (atVar != null) {
                    try {
                        return atVar.a(context);
                    } catch (Exception e) {
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void b(Context context) {
        if (a == null && !b) {
            synchronized (au.class) {
                if (a == null && !b) {
                    a = aw.a(context);
                    b = true;
                }
            }
        }
    }
}
