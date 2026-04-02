package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
public final class l0 extends f.c implements com.amazon.aps.iva.t1.f, com.amazon.aps.iva.u1.r {
    public boolean o;
    public com.amazon.aps.iva.s1.q p;

    @Override // com.amazon.aps.iva.u1.r
    public final void z(androidx.compose.ui.node.o oVar) {
        com.amazon.aps.iva.xb0.l lVar;
        this.p = oVar;
        if (!this.o) {
            return;
        }
        com.amazon.aps.iva.xb0.l lVar2 = null;
        if (oVar.l()) {
            com.amazon.aps.iva.s1.q qVar = this.p;
            if (qVar != null && qVar.l()) {
                if (this.n) {
                    lVar2 = (com.amazon.aps.iva.xb0.l) l(androidx.compose.foundation.k.a);
                }
                if (lVar2 != null) {
                    lVar2.invoke(this.p);
                    return;
                }
                return;
            }
            return;
        }
        if (this.n) {
            lVar = (com.amazon.aps.iva.xb0.l) l(androidx.compose.foundation.k.a);
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
