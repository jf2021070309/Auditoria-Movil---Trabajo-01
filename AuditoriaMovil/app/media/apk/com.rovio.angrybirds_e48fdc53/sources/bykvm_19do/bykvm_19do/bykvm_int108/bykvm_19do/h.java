package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do;

import android.app.Application;
import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
public final class h {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        a(Context context, boolean z) {
            this.a = context;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.a.a().a(this.a);
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.d.a(this.a);
            if (this.b) {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.f.a(this.a).a();
            }
        }
    }

    public static void a(Context context, e eVar, boolean z, boolean z2) {
        synchronized (h.class) {
            a(context, eVar, z, false, z2);
        }
    }

    public static void a(Context context, e eVar, boolean z, boolean z2, boolean z3) {
        synchronized (h.class) {
            a(context, eVar, z, z, z2, z3);
        }
    }

    public static void a(Context context, e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (h.class) {
            if (!a) {
                if (context == null) {
                    throw new IllegalArgumentException("context must be not null.");
                }
                if (eVar == null) {
                    throw new IllegalArgumentException("params must be not null.");
                }
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                }
                if (!bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.a.f(context)) {
                    i.a(context, eVar);
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do.e.a(context);
                    if (z || z2) {
                        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108.a a2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108.a.a();
                        if (z) {
                            a2.a(new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108.c(context));
                        }
                    }
                    a = true;
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.h.a().post(new a(context, z4));
                }
            }
        }
    }

    public static void a(g gVar) {
        i.d().a(gVar);
    }

    @Deprecated
    public static void a(String str) {
        if (i.f().e()) {
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108.a.a(str);
        }
    }

    public static void a(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        i.d().a(map);
    }
}
