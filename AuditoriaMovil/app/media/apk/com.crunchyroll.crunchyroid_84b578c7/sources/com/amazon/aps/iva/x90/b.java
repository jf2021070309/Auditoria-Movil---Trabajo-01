package com.amazon.aps.iva.x90;

import com.amazon.aps.iva.ee0.f1;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultParam.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final List<String> a = f1.K("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");
    public static final long b;
    public static final long c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.toMillis(1L);
        timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        b = timeUnit2.toMillis(6L);
        c = timeUnit2.toMillis(5L);
    }
}
