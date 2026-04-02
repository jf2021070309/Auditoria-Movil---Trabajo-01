package e.h.g;

import android.content.res.Configuration;
import android.content.res.Resources;
import e.h.g.j0;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class q1 {
    public static Resources a;

    public static void a() {
        a = null;
        e(R.string.cancel);
    }

    public static void b() {
        if (!j1.f()) {
            Locale p = x0.f8405d.p();
            if (p != null) {
                Configuration configuration = new Configuration(x0.f8405d.getResources().getConfiguration());
                j1.k(configuration, p);
                a = x0.f8405d.createConfigurationContext(configuration).getResources();
                return;
            }
            return;
        }
        j0.d(new j0.b() { // from class: e.h.g.g0
            @Override // e.h.g.j0.b
            public final void a() {
                Locale p2 = x0.f8405d.p();
                if (p2 == null) {
                    q1.a = x0.f8405d.getResources();
                    return;
                }
                Configuration configuration2 = new Configuration(x0.f8405d.getResources().getConfiguration());
                j1.k(configuration2, p2);
                q1.a = x0.f8405d.createConfigurationContext(configuration2).getResources();
            }
        });
        long nanoTime = System.nanoTime();
        while (a == null && (System.nanoTime() - nanoTime) / 1000000 < 16) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e2) {
                s1.l(e2, true);
            }
        }
    }

    public static String c(int i2, int i3) {
        x0 x0Var = x0.f8405d;
        if (x0Var != null && x0Var.r()) {
            if (a == null) {
                b();
            }
            Resources resources = a;
            if (resources != null) {
                return resources.getQuantityString(i2, i3, Integer.valueOf(i3));
            }
        }
        try {
            return x0.f8405d.getResources().getQuantityString(i2, i3, Integer.valueOf(i3));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d(int i2, int i3, Object[] objArr) {
        x0 x0Var = x0.f8405d;
        if (x0Var != null && x0Var.r()) {
            if (a == null) {
                b();
            }
            Resources resources = a;
            if (resources != null) {
                return resources.getQuantityString(i2, i3, objArr);
            }
        }
        try {
            return x0.f8405d.getResources().getQuantityString(i2, i3, objArr);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e(int i2) {
        x0 x0Var = x0.f8405d;
        if (x0Var != null && x0Var.r()) {
            if (a == null) {
                b();
            }
            Resources resources = a;
            if (resources != null) {
                return resources.getString(i2);
            }
        }
        try {
            return x0.f8405d.getResources().getString(i2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f(int i2, Object... objArr) {
        x0 x0Var = x0.f8405d;
        if (x0Var != null && x0Var.r()) {
            if (a == null) {
                b();
            }
            Resources resources = a;
            if (resources != null) {
                return resources.getString(i2, objArr);
            }
        }
        try {
            return x0.f8405d.getResources().getString(i2, objArr);
        } catch (Exception unused) {
            return "";
        }
    }
}
