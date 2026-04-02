package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.f0.b0;
import com.amazon.aps.iva.o0.w1;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.s1.s0;
/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes.dex */
public final class y implements com.amazon.aps.iva.s1.s0, s0.a, b0.a {
    public final Object a;
    public final b0 b;
    public final w1 c;
    public final w1 d;
    public final y1 e;
    public final y1 f;

    public y(Object obj, b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "pinnedItemList");
        this.a = obj;
        this.b = b0Var;
        this.c = com.amazon.aps.iva.e.w.J(-1);
        this.d = com.amazon.aps.iva.e.w.J(0);
        this.e = com.amazon.aps.iva.cq.b.c0(null);
        this.f = com.amazon.aps.iva.cq.b.c0(null);
    }

    @Override // com.amazon.aps.iva.s1.s0
    public final y a() {
        y yVar;
        if (b() == 0) {
            b0 b0Var = this.b;
            b0Var.getClass();
            b0Var.b.add(this);
            com.amazon.aps.iva.s1.s0 s0Var = (com.amazon.aps.iva.s1.s0) this.f.getValue();
            if (s0Var != null) {
                yVar = s0Var.a();
            } else {
                yVar = null;
            }
            this.e.setValue(yVar);
        }
        this.d.e(b() + 1);
        return this;
    }

    public final int b() {
        return this.d.t();
    }

    @Override // com.amazon.aps.iva.f0.b0.a
    public final int getIndex() {
        return this.c.t();
    }

    @Override // com.amazon.aps.iva.f0.b0.a
    public final Object getKey() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.s1.s0.a
    public final void release() {
        boolean z;
        if (b() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.d.e(b() - 1);
            if (b() == 0) {
                b0 b0Var = this.b;
                b0Var.getClass();
                b0Var.b.remove(this);
                y1 y1Var = this.e;
                s0.a aVar = (s0.a) y1Var.getValue();
                if (aVar != null) {
                    aVar.release();
                }
                y1Var.setValue(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
