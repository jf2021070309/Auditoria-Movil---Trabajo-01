package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.b0.m0;
/* compiled from: LazyLayoutSemanticState.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.f0.f0 {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ boolean b;

    public e(g0 g0Var, boolean z) {
        this.a = g0Var;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.f0.f0
    public final float a() {
        g0 g0Var = this.a;
        return (g0Var.a.b.t() / 100000.0f) + g0Var.a.a.t();
    }

    @Override // com.amazon.aps.iva.f0.f0
    public final boolean b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.f0.f0
    public final Object c(float f, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object a = m0.a(this.a, f, com.amazon.aps.iva.z.k.c(0.0f, null, 7), dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.f0.f0
    public final com.amazon.aps.iva.a2.b d() {
        if (this.b) {
            return new com.amazon.aps.iva.a2.b(-1, 1);
        }
        return new com.amazon.aps.iva.a2.b(1, -1);
    }

    @Override // com.amazon.aps.iva.f0.f0
    public final Object e(int i, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object a = g0.a(this.a, i, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
