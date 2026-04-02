package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import android.app.Application;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
import com.bytedance.msdk.adapter.util.Logger;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {
    private static volatile Context a;
    private static volatile bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c b;
    private static volatile bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> c;
    private static volatile bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> d;
    private static volatile bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0030a implements f.a {
        final /* synthetic */ Context a;

        C0030a(Context context) {
            this.a = context;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.f.a
        public boolean a() {
            Context context = this.a;
            if (context == null) {
                context = a.d();
            }
            return z.a(context);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private static volatile Application a;

        static {
            try {
                Object b = b();
                a = (Application) b.getClass().getMethod("getApplication", new Class[0]).invoke(b, new Object[0]);
                Logger.e("MyApplication", "application get success");
            } catch (Throwable th) {
                Logger.e("MyApplication", "application get failed", th);
            }
        }

        public static Application a() {
            return a;
        }

        private static Object b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                Logger.e("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> a() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<>("V1", new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.b(a), e(), b(), a(a));
                }
            }
        }
        return d;
    }

    private static f.a a(Context context) {
        return new C0030a(context);
    }

    private static f.b b() {
        return f.b.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r2) {
        /*
            java.lang.Class<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
            monitor-enter(r0)
            android.content.Context r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L27
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L29
            android.app.Application r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.b.a()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1b
            android.app.Application r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.b.a()     // Catch: java.lang.Throwable -> L1a
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a = r1     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1b
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L27
        L1a:
            r1 = move-exception
        L1b:
            if (r2 == 0) goto L18
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a = r2     // Catch: java.lang.Throwable -> L24
            goto L18
        L24:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)
            return
        L29:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.b(android.content.Context):void");
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> c() {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.b<>("V3", new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.b(a), e(), b(), a(a));
                }
            }
        }
        return e;
    }

    public static Context d() {
        if (a == null) {
            b(null);
        }
        return a;
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> e() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b(a);
                }
            }
        }
        return c;
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c f() {
        if (b == null) {
            synchronized (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.class) {
                try {
                    if (b == null) {
                        b = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }
}
