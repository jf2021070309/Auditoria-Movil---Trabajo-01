package com.amazon.aps.iva.se0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public abstract class n1 extends y implements t0, f1 {
    public o1 e;

    @Override // com.amazon.aps.iva.se0.f1
    public final u1 d() {
        return null;
    }

    @Override // com.amazon.aps.iva.xe0.h, com.amazon.aps.iva.se0.t0
    public final void dispose() {
        boolean z;
        o1 r = r();
        do {
            Object b0 = r.b0();
            if (b0 instanceof n1) {
                if (b0 == this) {
                    w0 w0Var = com.amazon.aps.iva.ab.t.j;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.b;
                        if (atomicReferenceFieldUpdater.compareAndSet(r, b0, w0Var)) {
                            z = true;
                            continue;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(r) != b0) {
                            z = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((b0 instanceof f1) && ((f1) b0).d() != null) {
                n();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public j1 getParent() {
        return r();
    }

    @Override // com.amazon.aps.iva.se0.f1
    public final boolean isActive() {
        return true;
    }

    public final o1 r() {
        o1 o1Var = this.e;
        if (o1Var != null) {
            return o1Var;
        }
        com.amazon.aps.iva.yb0.j.m("job");
        throw null;
    }

    @Override // com.amazon.aps.iva.xe0.h
    public final String toString() {
        return getClass().getSimpleName() + '@' + j0.e(this) + "[job@" + j0.e(r()) + ']';
    }
}
