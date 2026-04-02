package com.amazon.aps.iva.z;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
public final class q0 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final com.amazon.aps.iva.ze0.d b = com.amazon.aps.iva.gy.t.d();

    /* compiled from: InternalMutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final o0 a;
        public final com.amazon.aps.iva.se0.j1 b;

        public a(o0 o0Var, com.amazon.aps.iva.se0.j1 j1Var) {
            com.amazon.aps.iva.yb0.j.f(o0Var, "priority");
            this.a = o0Var;
            this.b = j1Var;
        }
    }
}
