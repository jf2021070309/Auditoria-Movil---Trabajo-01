package com.amazon.aps.iva.se0;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public final class g2 {
    public static final ThreadLocal<x0> a = new ThreadLocal<>();

    public static x0 a() {
        ThreadLocal<x0> threadLocal = a;
        x0 x0Var = threadLocal.get();
        if (x0Var == null) {
            h hVar = new h(Thread.currentThread());
            threadLocal.set(hVar);
            return hVar;
        }
        return x0Var;
    }
}
