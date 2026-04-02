package com.amazon.aps.iva.gl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: PlayerTapToSeekViewModel.kt */
/* loaded from: classes2.dex */
public final class w extends f0 implements v {
    public final v0 b = x.e(0L);
    public final v0 c = x.e(0L);
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<Boolean>> d = new com.amazon.aps.iva.i5.v<>(null);

    @Override // com.amazon.aps.iva.gl.v
    public final v0 H4() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.gl.v
    public final v0 Q2() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.gl.v
    public final void V5() {
        this.c.setValue(0L);
        this.b.setValue(0L);
        this.d.k(new com.amazon.aps.iva.ez.d<>(Boolean.FALSE));
    }

    @Override // com.amazon.aps.iva.gl.v
    public final g0 c6() {
        return com.amazon.aps.iva.e.w.D(this);
    }

    @Override // com.amazon.aps.iva.gl.v
    public final void d() {
        v0 v0Var = this.b;
        v0Var.setValue(Long.valueOf(((Number) v0Var.getValue()).longValue() + 10));
        this.c.setValue(0L);
        this.d.k(new com.amazon.aps.iva.ez.d<>(Boolean.TRUE));
    }

    @Override // com.amazon.aps.iva.gl.v
    public final void j() {
        v0 v0Var = this.c;
        v0Var.setValue(Long.valueOf(((Number) v0Var.getValue()).longValue() + 10));
        this.b.setValue(0L);
        this.d.k(new com.amazon.aps.iva.ez.d<>(Boolean.TRUE));
    }

    @Override // com.amazon.aps.iva.gl.v
    public final com.amazon.aps.iva.i5.v l1() {
        return this.d;
    }
}
