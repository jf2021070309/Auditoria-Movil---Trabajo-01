package com.amazon.aps.iva.t5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
/* compiled from: Log.java */
/* loaded from: classes.dex */
public final class p {
    public static final Object a = new Object();

    public static String a(String str, Throwable th) {
        String e = e(th);
        if (!TextUtils.isEmpty(e)) {
            StringBuilder b = com.amazon.aps.iva.b6.x.b(str, "\n  ");
            b.append(e.replace("\n", "\n  "));
            b.append('\n');
            return b.toString();
        }
        return str;
    }

    public static void b() {
        synchronized (a) {
        }
    }

    public static void c() {
        synchronized (a) {
        }
    }

    public static void d(String str, Throwable th) {
        a(str, th);
        c();
    }

    public static String e(Throwable th) {
        boolean z;
        synchronized (a) {
            try {
                if (th == null) {
                    return null;
                }
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        if (th2 instanceof UnknownHostException) {
                            z = true;
                            break;
                        }
                        th2 = th2.getCause();
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return "UnknownHostException (no network)";
                }
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            } finally {
            }
        }
    }

    public static void f() {
        synchronized (a) {
        }
    }

    public static void g() {
        synchronized (a) {
        }
    }

    public static void h(String str, Throwable th) {
        a(str, th);
        g();
    }
}
