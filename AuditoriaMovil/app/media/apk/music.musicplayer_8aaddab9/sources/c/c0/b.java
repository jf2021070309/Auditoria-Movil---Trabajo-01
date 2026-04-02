package c.c0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1316b;

    public b(c cVar, boolean z) {
        this.f1316b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder y = e.a.d.a.a.y(this.f1316b ? "WM.task-" : "androidx.work-");
        y.append(this.a.incrementAndGet());
        return new Thread(runnable, y.toString());
    }
}
