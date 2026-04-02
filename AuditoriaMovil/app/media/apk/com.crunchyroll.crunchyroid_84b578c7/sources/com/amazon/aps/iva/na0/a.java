package com.amazon.aps.iva.na0;

import android.content.Context;
import android.os.Handler;
import com.amazon.aps.iva.b30.j;
import com.amazon.aps.iva.oa0.f1;
import com.amazon.aps.iva.oa0.o0;
import com.amazon.aps.iva.oa0.p0;
import com.amazon.aps.iva.oa0.t0;
import com.amazon.aps.iva.oa0.u0;
import java.io.IOException;
/* compiled from: Singular.java */
/* loaded from: classes4.dex */
public final class a {
    public static u0 a;
    public static boolean b;
    public static Context c;
    public static Boolean d;

    static {
        new j(a.class.getSimpleName());
        b = false;
        c = null;
        d = Boolean.FALSE;
    }

    public static boolean a(String str, com.amazon.aps.iva.if0.c cVar) {
        try {
            if (!c() || f1.i(str)) {
                return false;
            }
            return a.d(str, cVar.toString());
        } catch (RuntimeException e) {
            d(e);
            return false;
        }
    }

    public static boolean b(Context context, b bVar) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            if (a != null) {
                z = true;
            }
            b = z;
            u0 a2 = u0.a(context, bVar);
            a = a2;
            if (b && a2.d.g != null) {
                a2.c.a().post(new t0(a2));
            }
            c = context.getApplicationContext();
            d = bVar.l;
        } catch (IOException e) {
            f1.b(e);
            a = null;
        } catch (RuntimeException e2) {
            d(e2);
            f1.b(e2);
        }
        return c();
    }

    public static boolean c() {
        if (a == null) {
            return false;
        }
        return true;
    }

    public static void d(RuntimeException runtimeException) {
        try {
            p0 b2 = p0.b(c, d);
            Handler handler = b2.b;
            if (handler != null) {
                o0 o0Var = new o0(b2, runtimeException);
                handler.removeCallbacksAndMessages(null);
                handler.post(o0Var);
            }
        } catch (RuntimeException unused) {
        }
    }
}
