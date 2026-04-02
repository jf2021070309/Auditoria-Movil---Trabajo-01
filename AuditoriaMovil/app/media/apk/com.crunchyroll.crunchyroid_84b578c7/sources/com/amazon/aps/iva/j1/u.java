package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.o0.e0;
/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.r<Float, Float, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d dVar) {
        super(4);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final com.amazon.aps.iva.kb0.q K(Float f, Float f2, com.amazon.aps.iva.o0.i iVar, Integer num) {
        f.floatValue();
        f2.floatValue();
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            t.a(this.h.f, null, iVar2, 0, 2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
