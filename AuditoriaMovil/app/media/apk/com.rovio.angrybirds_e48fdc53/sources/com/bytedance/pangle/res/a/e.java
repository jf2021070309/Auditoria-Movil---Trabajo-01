package com.bytedance.pangle.res.a;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class e extends j {
    private long a;

    public e(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.bytedance.pangle.res.a.j, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        skip = super.skip(j);
        this.a += skip;
        return skip;
    }

    @Override // com.bytedance.pangle.res.a.j
    protected final synchronized void a(int i) {
        if (i != -1) {
            this.a += i;
        }
    }

    public final int a() {
        long b = b();
        if (b > 2147483647L) {
            throw new ArithmeticException("The byte count " + b + " is too large to be converted to an int");
        }
        return (int) b;
    }

    public final synchronized long b() {
        return this.a;
    }
}
