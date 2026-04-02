package com.amazon.aps.iva.se0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public final class p0<T> extends com.amazon.aps.iva.xe0.p<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public p0(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.ob0.g gVar) {
        super(dVar, gVar);
        this._decision = 0;
    }

    @Override // com.amazon.aps.iva.xe0.p, com.amazon.aps.iva.se0.o1
    public final void x(Object obj) {
        y(obj);
    }

    @Override // com.amazon.aps.iva.xe0.p, com.amazon.aps.iva.se0.o1
    public final void y(Object obj) {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (e.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.aq.k.z(obj), com.amazon.aps.iva.a60.b.s(this.d), null);
    }

    public final Object y0() {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (e.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            return com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        }
        Object w = com.amazon.aps.iva.ab.t.w(b0());
        if (!(w instanceof w)) {
            return w;
        }
        throw ((w) w).a;
    }
}
