package com.amazon.aps.iva.oa0;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
/* compiled from: SingularInstance.java */
/* loaded from: classes4.dex */
public final class r0 implements com.amazon.aps.iva.pa0.d {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ long b;
    public final /* synthetic */ u0 c;

    public r0(u0 u0Var, CountDownLatch countDownLatch, long j) {
        this.c = u0Var;
        this.a = countDownLatch;
        this.b = j;
    }

    @Override // com.amazon.aps.iva.pa0.d
    public final void a(HashMap hashMap) {
        u0 u0Var = this.c;
        u0Var.h = hashMap;
        this.a.countDown();
        u0Var.n = f1.k(this.b);
    }
}
