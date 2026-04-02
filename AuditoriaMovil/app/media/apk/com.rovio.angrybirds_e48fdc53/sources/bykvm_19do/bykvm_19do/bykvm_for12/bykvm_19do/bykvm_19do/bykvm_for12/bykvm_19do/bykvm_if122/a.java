package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.e;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
/* loaded from: classes.dex */
public class a {
    public static long a(int i, Context context) {
        long b = b(i, context);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("ad limit by memory:" + b);
        return b;
    }

    public static boolean a() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.b())) ? false : true;
    }

    private static long b(int i, Context context) {
        if (context != null) {
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.freeMemory() / 1048576;
            long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
            if (maxMemory > 0) {
                long j = ((maxMemory + freeMemory) - 10) / 2;
                if (j <= 2) {
                    return 1L;
                }
                if (j > 10) {
                    return Math.min(j * 10, i);
                }
            } else if (freeMemory <= 2) {
                return 1L;
            } else {
                if (freeMemory > 10) {
                    return Math.min((freeMemory / 2) * 10, i);
                }
            }
            i = Math.min(i, 10);
        }
        return i;
    }

    public static boolean b() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.d())) ? false : true;
    }

    public static boolean c() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.a())) ? false : true;
    }

    public static boolean d() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.f())) ? false : true;
    }

    public static boolean e() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.e())) ? false : true;
    }

    public static boolean f() {
        e e = j.m().e();
        return (e == null || TextUtils.isEmpty(e.c())) ? false : true;
    }
}
