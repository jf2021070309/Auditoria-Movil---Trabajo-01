package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.a0.g1;
import com.amazon.aps.iva.b0.w;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class l0 implements a0, k {
    public final p3<v0> a;
    public n0 b = androidx.compose.foundation.gestures.a.b;

    public l0(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // com.amazon.aps.iva.b0.a0
    public final Object a(g1 g1Var, w.c.a.C0125a.C0126a c0126a, w.c.a.C0125a c0125a) {
        Object f = this.a.getValue().d.f(g1Var, new k0(this, c0126a, null), c0125a);
        if (f == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return f;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.b0.k
    public final void b(float f) {
        v0 value = this.a.getValue();
        value.a(this.b, value.e(f), 1);
    }
}
