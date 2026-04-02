package com.amazon.aps.iva.ca;

import java.util.Collections;
/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class r<K, A> extends a<K, A> {
    public final A i;

    public r(com.amazon.aps.iva.na.c<A> cVar, A a) {
        super(Collections.emptyList());
        k(cVar);
        this.i = a;
    }

    @Override // com.amazon.aps.iva.ca.a
    public final float c() {
        return 1.0f;
    }

    @Override // com.amazon.aps.iva.ca.a
    public final A f() {
        com.amazon.aps.iva.na.c<A> cVar = this.e;
        A a = this.i;
        float f = this.d;
        return cVar.b(0.0f, 0.0f, a, a, f, f, f);
    }

    @Override // com.amazon.aps.iva.ca.a
    public final A g(com.amazon.aps.iva.na.a<K> aVar, float f) {
        return f();
    }

    @Override // com.amazon.aps.iva.ca.a
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // com.amazon.aps.iva.ca.a
    public final void j(float f) {
        this.d = f;
    }
}
