package i.a.k2;

import e.j.d.w;
import i.a.i2.r;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class l {
    public static final long a = w.C0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f9129b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9130c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f9131d;

    /* renamed from: e  reason: collision with root package name */
    public static h f9132e;

    static {
        w.B0("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int i2 = r.a;
        int B0 = w.B0("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, null);
        f9129b = B0;
        f9130c = w.B0("kotlinx.coroutines.scheduler.max.pool.size", w.r(i2 * 128, B0, 2097150), 0, 2097150, 4, null);
        f9131d = TimeUnit.SECONDS.toNanos(w.C0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f9132e = f.a;
    }
}
