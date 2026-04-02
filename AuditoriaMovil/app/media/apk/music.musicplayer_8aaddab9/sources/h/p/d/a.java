package h.p.d;

import h.o.c.j;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes2.dex */
public final class a extends h.p.a {
    @Override // h.p.c
    public int f(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // h.p.a
    public Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current()");
        return current;
    }
}
