package h.p;

import java.util.Random;
/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // h.p.c
    public int a(int i2) {
        return ((-i2) >> 31) & (h().nextInt() >>> (32 - i2));
    }

    @Override // h.p.c
    public int b() {
        return h().nextInt();
    }

    public abstract Random h();
}
