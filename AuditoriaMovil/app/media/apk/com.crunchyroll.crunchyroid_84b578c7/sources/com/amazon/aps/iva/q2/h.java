package com.amazon.aps.iva.q2;

import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class h implements u0 {
    public final /* synthetic */ t a;

    public h(t tVar) {
        this.a = tVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        t tVar = this.a;
        tVar.d();
        tVar.getClass();
        i0.b(tVar, null);
        tVar.o.removeViewImmediate(tVar);
    }
}
