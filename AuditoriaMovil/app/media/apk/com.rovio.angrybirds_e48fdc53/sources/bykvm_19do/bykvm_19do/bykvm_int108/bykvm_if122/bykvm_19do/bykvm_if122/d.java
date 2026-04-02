package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class d implements ThreadFactory {
    private static final AtomicInteger e = new AtomicInteger(1);
    private final ThreadGroup a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;
    private final b.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b.a aVar, String str) {
        StringBuilder sb;
        this.d = aVar;
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        if (TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            str = "ttdefault-";
        } else {
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append(e.getAndIncrement());
        sb.append("-thread-");
        this.c = sb.toString();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int i;
        ThreadGroup threadGroup = this.a;
        Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        b.a aVar = this.d;
        if (aVar != null && aVar.a() == b.a.LOW.a()) {
            i = 1;
        } else if (thread.getPriority() == 5) {
            thread.setPriority(5);
            return thread;
        } else {
            i = 3;
        }
        thread.setPriority(i);
        return thread;
    }
}
