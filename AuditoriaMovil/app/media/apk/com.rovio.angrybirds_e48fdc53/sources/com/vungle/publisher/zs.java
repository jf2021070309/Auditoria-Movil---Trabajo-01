package com.vungle.publisher;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
public class zs {
    private final AtomicInteger a = new AtomicInteger();

    public int a(int i, int i2) {
        int i3;
        int a;
        do {
            i3 = this.a.get();
            a = za.a(i3, i, i2);
        } while (!this.a.compareAndSet(i3, a));
        return a;
    }
}
