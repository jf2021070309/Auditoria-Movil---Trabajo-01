package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.ed0.j;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.g1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.l;
/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes4.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<e0> {
    public final /* synthetic */ d h;
    public final /* synthetic */ y0 i;
    public final /* synthetic */ a j;
    public final /* synthetic */ c1 k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, y0 y0Var, a aVar, c1 c1Var, j jVar) {
        super(0);
        this.h = dVar;
        this.i = y0Var;
        this.j = aVar;
        this.k = c1Var;
        this.l = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final e0 invoke() {
        m0 m0Var;
        g1 g1Var = this.h.d;
        com.amazon.aps.iva.oc0.h k = this.k.k();
        if (k != null) {
            m0Var = k.m();
        } else {
            m0Var = null;
        }
        a aVar = this.j;
        aVar.getClass();
        return g1Var.b(this.i, a.e(a.e(aVar, null, false, null, m0Var, 31), null, this.l.s(), null, null, 59));
    }
}
