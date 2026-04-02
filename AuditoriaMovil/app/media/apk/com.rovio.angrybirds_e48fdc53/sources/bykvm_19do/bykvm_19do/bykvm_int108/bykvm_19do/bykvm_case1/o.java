package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;
/* loaded from: classes.dex */
public final class o {
    public static Thread a(Runnable runnable) {
        return a(runnable, null);
    }

    public static Thread a(Runnable runnable, String str) {
        if (runnable != null) {
            Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
            thread.start();
            return thread;
        }
        return null;
    }
}
