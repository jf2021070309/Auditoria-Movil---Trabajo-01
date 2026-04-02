package com.flurry.sdk;

import java.lang.Thread;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public final class mg {
    private static mg c;
    final Map<Thread.UncaughtExceptionHandler, Void> b = new WeakHashMap();
    final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    private mg() {
        Thread.setDefaultUncaughtExceptionHandler(new a(this, (byte) 0));
    }

    public static synchronized mg a() {
        mg mgVar;
        synchronized (mg.class) {
            if (c == null) {
                c = new mg();
            }
            mgVar = c;
        }
        return mgVar;
    }

    final Set<Thread.UncaughtExceptionHandler> b() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.b) {
            keySet = this.b.keySet();
        }
        return keySet;
    }

    /* loaded from: classes2.dex */
    final class a implements Thread.UncaughtExceptionHandler {
        private a() {
        }

        /* synthetic */ a(mg mgVar, byte b) {
            this();
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            for (Thread.UncaughtExceptionHandler uncaughtExceptionHandler : mg.this.b()) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (Throwable th2) {
                }
            }
            mg mgVar = mg.this;
            if (mgVar.a != null) {
                try {
                    mgVar.a.uncaughtException(thread, th);
                } catch (Throwable th3) {
                }
            }
        }
    }
}
