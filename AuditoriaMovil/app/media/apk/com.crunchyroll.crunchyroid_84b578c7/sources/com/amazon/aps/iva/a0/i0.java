package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.s0;
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class i0 extends f.c implements com.amazon.aps.iva.u1.f, com.amazon.aps.iva.u1.p0 {
    public s0.a o;
    public boolean p;

    @Override // com.amazon.aps.iva.u1.p0
    public final void a0() {
        com.amazon.aps.iva.f0.y yVar;
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        com.amazon.aps.iva.u1.q0.a(this, new h0(d0Var, this));
        com.amazon.aps.iva.s1.s0 s0Var = (com.amazon.aps.iva.s1.s0) d0Var.b;
        if (this.p) {
            s0.a aVar = this.o;
            if (aVar != null) {
                aVar.release();
            }
            if (s0Var != null) {
                yVar = s0Var.a();
            } else {
                yVar = null;
            }
            this.o = yVar;
        }
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void o1() {
        s0.a aVar = this.o;
        if (aVar != null) {
            aVar.release();
        }
        this.o = null;
    }
}
