package e.b.a.a;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class k {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(AbstractComponentTracker.LINGERING_TIMEOUT);

    /* renamed from: b  reason: collision with root package name */
    public final l f5361b;

    /* renamed from: c  reason: collision with root package name */
    public Thread f5362c;

    /* renamed from: d  reason: collision with root package name */
    public final e.b.a.a.z.c f5363d;

    /* renamed from: e  reason: collision with root package name */
    public final e.b.a.a.z.g f5364e;

    public k(e.b.a.a.w.a aVar) {
        e.b.a.a.z.c cVar = new e.b.a.a.z.c();
        this.f5363d = cVar;
        e.b.a.a.z.g gVar = new e.b.a.a.z.g(aVar.f5394i, cVar);
        this.f5364e = gVar;
        l lVar = new l(aVar, gVar, cVar);
        this.f5361b = lVar;
        Thread thread = new Thread(lVar, "job-manager");
        this.f5362c = thread;
        thread.start();
    }
}
