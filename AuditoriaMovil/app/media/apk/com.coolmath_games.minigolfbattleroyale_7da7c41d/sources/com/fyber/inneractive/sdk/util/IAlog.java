package com.fyber.inneractive.sdk.util;

import android.content.Context;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class IAlog {
    public static int a = 4;
    public static int b = 1;
    private static final com.fyber.inneractive.sdk.logger.a c = new com.fyber.inneractive.sdk.logger.a();
    private static List<FMPLogger> d = new ArrayList<FMPLogger>() { // from class: com.fyber.inneractive.sdk.util.IAlog.1
        {
            add(IAlog.c);
        }
    };

    public static void a(Context context) {
        d.retainAll(Collections.singleton(c));
        String b2 = com.fyber.inneractive.sdk.config.f.b();
        if (b2 != null) {
            for (String str : b2.split(",")) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str).newInstance();
                    fMPLogger.initialize(context);
                    d.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void a(String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.verbose(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.debug(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.warning(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.error(str, null, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.error(str, th, objArr);
        }
    }

    public static void a(int i, String str, Object... objArr) {
        for (FMPLogger fMPLogger : d) {
            fMPLogger.log(i, null, str, objArr);
        }
    }

    public static String a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static String a(Class<?> cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }

    /* loaded from: classes.dex */
    public static class a {
        long a = System.currentTimeMillis();
        String b;
        String c;

        public a(String str, String str2) {
            this.c = str;
            this.b = str2;
        }

        public final void a() {
            IAlog.a(this.c + "timelog: " + this.b + " took " + (System.currentTimeMillis() - this.a) + " msec", new Object[0]);
        }
    }
}
