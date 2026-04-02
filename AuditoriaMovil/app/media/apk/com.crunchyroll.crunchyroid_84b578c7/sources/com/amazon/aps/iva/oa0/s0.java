package com.amazon.aps.iva.oa0;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
/* compiled from: SingularInstance.java */
/* loaded from: classes4.dex */
public final class s0 implements com.amazon.aps.iva.pa0.d {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ u0 b;

    public s0(u0 u0Var, CountDownLatch countDownLatch) {
        this.b = u0Var;
        this.a = countDownLatch;
    }

    @Override // com.amazon.aps.iva.pa0.d
    public final void a(HashMap hashMap) {
        this.b.i = hashMap;
        this.a.countDown();
    }
}
