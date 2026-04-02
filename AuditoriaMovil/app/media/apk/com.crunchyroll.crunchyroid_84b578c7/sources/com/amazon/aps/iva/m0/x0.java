package com.amazon.aps.iva.m0;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
public final class x0 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final com.amazon.aps.iva.ze0.d b = com.amazon.aps.iva.gy.t.d();

    /* compiled from: InternalMutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.a0.g1 a;
        public final com.amazon.aps.iva.se0.j1 b;

        public a(com.amazon.aps.iva.a0.g1 g1Var, com.amazon.aps.iva.se0.j1 j1Var) {
            com.amazon.aps.iva.yb0.j.f(g1Var, "priority");
            this.a = g1Var;
            this.b = j1Var;
        }
    }
}
