package e.d.d.m.j;

import android.util.Log;
/* loaded from: classes.dex */
public class f {
    public static final f a = new f("FirebaseCrashlytics");

    public f(String str) {
    }

    public final boolean a(int i2) {
        return 4 <= i2 || Log.isLoggable("FirebaseCrashlytics", i2);
    }

    public void b(String str) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, null);
        }
    }

    public void c(String str, Throwable th) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    public void d(String str) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, null);
        }
    }

    public void e(String str, Throwable th) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }
}
