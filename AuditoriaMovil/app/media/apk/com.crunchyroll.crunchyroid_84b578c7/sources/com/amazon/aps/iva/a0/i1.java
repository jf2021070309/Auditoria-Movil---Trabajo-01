package com.amazon.aps.iva.a0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MutatorMutex.kt */
/* loaded from: classes.dex */
public final class i1 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final com.amazon.aps.iva.ze0.d b = com.amazon.aps.iva.gy.t.d();

    /* compiled from: MutatorMutex.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final g1 a;
        public final com.amazon.aps.iva.se0.j1 b;

        public a(g1 g1Var, com.amazon.aps.iva.se0.j1 j1Var) {
            com.amazon.aps.iva.yb0.j.f(g1Var, "priority");
            this.a = g1Var;
            this.b = j1Var;
        }
    }

    public static final void a(i1 i1Var, a aVar) {
        a aVar2;
        boolean z;
        boolean z2;
        do {
            AtomicReference<a> atomicReference = i1Var.a;
            aVar2 = atomicReference.get();
            z = true;
            if (aVar2 != null) {
                if (aVar.a.compareTo(aVar2.a) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
            while (true) {
                if (!atomicReference.compareAndSet(aVar2, aVar)) {
                    if (atomicReference.get() != aVar2) {
                        z = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z);
        if (aVar2 != null) {
            aVar2.b.a(new h1(0));
        }
    }
}
