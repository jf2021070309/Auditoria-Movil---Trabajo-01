package com.bytedance.pangle.util.b.b;
/* loaded from: classes.dex */
public final class c {
    public int a;
    public int e;
    public int f;
    public int g;
    public String h;
    public long i;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    private final long j = 30;

    public final long a() {
        long j = this.c;
        if (j <= 0) {
            return this.d;
        }
        return j;
    }

    public final long b() {
        return c() + a();
    }

    public final long c() {
        return this.e + 30 + this.g;
    }
}
