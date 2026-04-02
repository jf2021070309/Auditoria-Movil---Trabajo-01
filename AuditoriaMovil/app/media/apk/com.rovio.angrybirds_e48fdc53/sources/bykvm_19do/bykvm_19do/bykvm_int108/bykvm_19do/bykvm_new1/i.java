package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import com.umeng.analytics.pro.bg;
/* loaded from: classes.dex */
public class i {
    private static long a = -1;

    /* loaded from: classes.dex */
    static class a {
        private static long a = -1;

        public static long a() {
            if (i.a == -1) {
                long unused = i.a = 1000 / b();
            }
            return i.a;
        }

        public static long a(long j) {
            long j2 = a;
            if (j2 > 0) {
                return j2;
            }
            int i = Build.VERSION.SDK_INT;
            long sysconf = i >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : i >= 14 ? a("_SC_CLK_TCK", j) : j;
            if (sysconf > 0) {
                j = sysconf;
            }
            a = j;
            return j;
        }

        private static long a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField(bg.x).get(null), Integer.valueOf(i))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j;
            }
        }

        public static long b() {
            return a(100L);
        }
    }
}
