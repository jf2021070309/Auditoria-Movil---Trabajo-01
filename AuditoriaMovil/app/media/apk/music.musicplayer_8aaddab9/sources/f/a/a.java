package f.a;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public abstract class a {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract f.a.e.b a(Runnable runnable, long j2, TimeUnit timeUnit);
}
