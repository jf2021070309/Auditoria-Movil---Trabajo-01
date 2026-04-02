package com.amazon.aps.iva.t1;

import com.amazon.aps.iva.o0.y1;
/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.ab.a {
    public final c<?> a;
    public final y1 b;

    public j(c<?> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        this.a = cVar;
        this.b = com.amazon.aps.iva.cq.b.c0(null);
    }

    @Override // com.amazon.aps.iva.ab.a
    public final boolean d(c<?> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        if (cVar == this.a) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ab.a
    public final Object g(i iVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iVar, "key");
        if (iVar == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T value = this.b.getValue();
            if (value == 0) {
                return null;
            }
            return value;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
