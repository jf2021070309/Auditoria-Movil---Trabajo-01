package e.a.c;

import android.content.Context;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class g7 {
    public static e.h.g.l0 a;

    public static boolean a(String str, boolean z) {
        e.h.g.l0 f2 = f();
        return f2 != null ? f2.d(str, z) : z;
    }

    public static int b(String str, int i2) {
        return f() != null ? f().e(str, i2) : i2;
    }

    public static int c(Context context, String str, int i2) {
        e.h.g.l0 i3 = e.h.g.l0.i(context, "music.musicplayer");
        return i3 != null ? i3.e(str, i2) : i2;
    }

    public static long d() {
        long e2 = e("bd", 0L);
        if (e2 == 0) {
            k("bd", System.currentTimeMillis());
        }
        return e("bd", e2);
    }

    public static long e(String str, long j2) {
        return f() != null ? f().f(str, j2) : j2;
    }

    public static e.h.g.l0 f() {
        if (a == null) {
            a = e.h.g.l0.g();
        }
        return a;
    }

    public static boolean g() {
        try {
            return a("az", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String h(String str, String str2) {
        return f() != null ? f().k(str, str2) : str2;
    }

    public static void i() {
        try {
            l(e.h.g.x0.f8405d, "activetab", c(e.h.g.x0.f8405d, "activetab", R.id.artisttab));
            e.h.g.l0 i2 = e.h.g.l0.i(e.h.g.x0.f8405d, "Music");
            i2.m("fake", i2.d("fake", false));
        } catch (NullPointerException unused) {
        }
    }

    public static void j(String str, boolean z) {
        f().m(str, z);
    }

    public static void k(String str, long j2) {
        f().o(str, j2);
    }

    public static void l(Context context, String str, int i2) {
        e.h.g.l0.i(context, "music.musicplayer").n(str, i2);
    }
}
