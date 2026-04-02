package com.amazon.aps.iva.ye0;

import com.amazon.aps.iva.xe0.t;
import java.util.concurrent.TimeUnit;
/* compiled from: Tasks.kt */
/* loaded from: classes4.dex */
public final class k {
    public static final long a = com.amazon.aps.iva.dg.b.G("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b;
    public static final int c;
    public static final long d;
    public static final e e;
    public static final i f;
    public static final i g;

    static {
        int i = t.a;
        if (i < 2) {
            i = 2;
        }
        b = com.amazon.aps.iva.dg.b.H("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        c = com.amazon.aps.iva.dg.b.H("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(com.amazon.aps.iva.dg.b.G("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        e = e.a;
        f = new i(0);
        g = new i(1);
    }
}
