package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12;

import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
/* loaded from: classes.dex */
public class c {
    public static void a(String str) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.d(n + "log", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, String str2) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.d((n + "log") + str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.e(n + "log", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str, String str2) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.e((n + "log") + str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(String str) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.i(n + "log", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(String str, String str2) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.w((n + "log") + str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(String str) {
        try {
            g b = j.m().b();
            if (b == null || !b.c()) {
                return;
            }
            String n = b.n();
            if (n == null) {
                n = "";
            }
            Log.w(n + "log", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
