package com.amazon.aps.iva.g0;

import androidx.compose.ui.node.o;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.u1.w;
/* compiled from: BringIntoView.kt */
/* loaded from: classes.dex */
public abstract class a extends f.c implements com.amazon.aps.iva.t1.f, w, com.amazon.aps.iva.u1.f {
    public final j o = new j(this);
    public q p;

    public final q t1() {
        q qVar = this.p;
        if (qVar == null || !qVar.l()) {
            return null;
        }
        return qVar;
    }

    @Override // com.amazon.aps.iva.u1.w
    public final void v(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinates");
        this.p = oVar;
    }
}
