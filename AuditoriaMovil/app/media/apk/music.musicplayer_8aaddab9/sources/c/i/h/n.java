package c.i.h;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class n implements ThreadFactory {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public int f2098b;

    /* loaded from: classes.dex */
    public static class a extends Thread {
        public final int a;

        public a(Runnable runnable, String str, int i2) {
            super(runnable, str);
            this.a = i2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.a);
            super.run();
        }
    }

    public n(String str, int i2) {
        this.a = str;
        this.f2098b = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.a, this.f2098b);
    }
}
