package com.amazon.aps.iva.c1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.o;
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class f extends f.c implements o {
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.h1.e, q> o;

    public f(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.h1.e, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "onDraw");
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        this.o.invoke(cVar);
        cVar.f1();
    }
}
