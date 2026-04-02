package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;

import android.app.ActivityManager;
import android.os.Build;
/* loaded from: classes.dex */
public class g {
    static final b a;

    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        private c() {
            super();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.g.b
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        a = Build.VERSION.SDK_INT >= 16 ? new c() : new b();
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return a.a(memoryInfo);
    }
}
