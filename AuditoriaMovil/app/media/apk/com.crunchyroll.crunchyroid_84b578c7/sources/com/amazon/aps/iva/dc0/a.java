package com.amazon.aps.iva.dc0;

import com.amazon.aps.iva.yb0.j;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.cc0.a {
    @Override // com.amazon.aps.iva.cc0.c
    public final long d(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // com.amazon.aps.iva.cc0.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.e(current, "current()");
        return current;
    }
}
