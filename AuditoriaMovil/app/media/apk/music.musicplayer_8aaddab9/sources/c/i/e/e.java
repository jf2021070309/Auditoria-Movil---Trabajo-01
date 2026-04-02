package c.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import c.i.d.c.j;
import c.i.h.m;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class e {
    public static final k a;

    /* renamed from: b  reason: collision with root package name */
    public static final c.f.f<String, Typeface> f2040b;

    /* loaded from: classes.dex */
    public static class a extends m {
        public j.c a;

        public a(j.c cVar) {
            this.a = cVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new j();
        } else if (i2 >= 28) {
            a = new i();
        } else if (i2 >= 26) {
            a = new h();
        } else {
            if (i2 >= 24) {
                Method method = g.f2048d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new g();
                }
            }
            if (i2 >= 21) {
                a = new f();
            } else {
                a = new k();
            }
        }
        f2040b = new c.f.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r6, c.i.d.c.e r7, android.content.res.Resources r8, int r9, int r10, c.i.d.c.j.c r11, android.os.Handler r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.e.e.a(android.content.Context, c.i.d.c.e, android.content.res.Resources, int, int, c.i.d.c.j$c, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            f2040b.put(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}
