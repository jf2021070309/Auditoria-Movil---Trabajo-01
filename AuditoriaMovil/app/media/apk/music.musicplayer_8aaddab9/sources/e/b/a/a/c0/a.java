package e.b.a.a.c0;

import e.b.a.a.y.c;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5294b;

    public a() {
        c.a.a("creating system timer", new Object[0]);
        this.f5294b = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.a = System.nanoTime();
    }

    public long a() {
        return (System.nanoTime() - this.a) + this.f5294b;
    }

    public void b(Object obj, long j2) throws InterruptedException {
        long a = a();
        if (a > j2) {
            obj.wait(1L);
        } else {
            TimeUnit.NANOSECONDS.timedWait(obj, j2 - a);
        }
    }
}
