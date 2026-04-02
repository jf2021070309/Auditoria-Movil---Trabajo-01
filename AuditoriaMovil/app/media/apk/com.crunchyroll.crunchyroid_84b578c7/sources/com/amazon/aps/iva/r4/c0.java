package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.o0.e0;
/* compiled from: GlanceAppWidget.kt */
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ z h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z zVar) {
        super(2);
        this.h = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            this.h.a(iVar2, 8);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
