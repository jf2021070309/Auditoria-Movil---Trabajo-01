package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.j;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class i {
    private static Context a = null;
    private static long b = 0;
    private static String c = "default";
    private static boolean d;
    private static bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.a e;
    private static volatile ConcurrentHashMap<Integer, String> h;
    private static volatile int j;
    private static volatile String k;
    private static bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.b f = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.b();
    private static b g = new b();
    private static j i = null;

    public static long a() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, e eVar) {
        b = System.currentTimeMillis();
        a = context;
        e = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.a(context, eVar);
    }

    public static Context b() {
        return a;
    }

    public static String c() {
        return c;
    }

    public static b d() {
        return g;
    }

    public static bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.a e() {
        return e;
    }

    public static bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.b f() {
        return f;
    }

    public static int g() {
        return j;
    }

    public static String h() {
        return k;
    }

    public static ConcurrentHashMap<Integer, String> i() {
        return h;
    }

    public static j j() {
        if (i == null) {
            synchronized (i.class) {
                i = new j(a);
            }
        }
        return i;
    }

    public static boolean k() {
        return d;
    }
}
