package e.a.a.a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class v implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f5023b = new AtomicInteger(1);

    public v(d dVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        int andIncrement = this.f5023b.getAndIncrement();
        StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
