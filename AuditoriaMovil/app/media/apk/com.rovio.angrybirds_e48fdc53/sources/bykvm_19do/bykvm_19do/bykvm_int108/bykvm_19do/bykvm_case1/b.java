package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;

import android.os.Build;
import android.os.Debug;
/* loaded from: classes.dex */
public class b {
    static final C0063b a;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0063b {
        private C0063b() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends C0063b {
        private c() {
            super();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.b.C0063b
        public int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.b.C0063b
        public int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.b.C0063b
        public int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        a = Build.VERSION.SDK_INT >= 19 ? new c() : new C0063b();
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return a.c(memoryInfo);
    }
}
