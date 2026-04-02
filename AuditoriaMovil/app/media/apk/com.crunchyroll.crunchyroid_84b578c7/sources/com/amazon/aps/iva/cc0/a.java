package com.amazon.aps.iva.cc0;

import java.util.Random;
/* compiled from: PlatformRandom.kt */
/* loaded from: classes4.dex */
public abstract class a extends c {
    @Override // com.amazon.aps.iva.cc0.c
    public final int a(int i) {
        return ((-i) >> 31) & (e().nextInt() >>> (32 - i));
    }

    @Override // com.amazon.aps.iva.cc0.c
    public final int b() {
        return e().nextInt();
    }

    @Override // com.amazon.aps.iva.cc0.c
    public final long c() {
        return e().nextLong();
    }

    public abstract Random e();

    public final int f(int i) {
        return e().nextInt(i);
    }
}
